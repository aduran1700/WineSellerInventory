package AccessPoint;

import ManageUser.User;
import MessageManager.MessageManager;
import MessageManager.Entities.AccessPoint_Entity;
import MessageManager.Events.Event;
import MessageManager.Events.Logout_Event;

/**
 * Singleton that Allows Access that creates an access point for other
 * subsystems after user logs in.
 * @author Rene Alfonso
 */
public class AccessPointManager implements AccessPoint_Entity
{
	// Instance of this object.
	private static AccessPointManager instance;
	
	private User userObj;
	
	// Constructor.
	private AccessPointManager()
	{
		MessageManager.getInstance().registerObserver(this);
	}
	
	/**
	 * Singleton global access point to the instance of this object.
	 * @return The instance.
	 */
	public static AccessPointManager getInstance()
	{
		// Check if instance doesn't exist. 
		if(instance == null)
			// Create the object.
			instance = new AccessPointManager();
		
		// Return the instance.
		return instance;
	}
	
	/**
	 * Points the userObj to a User.
	 * @param user The User.
	 */
	public void pointToUserObj(User user)
	{
		userObj = user;
	}
	
	/**
	 * Makes the reference to the userObj null.
	 */
	public void removeUserObj()
	{
		userObj = null;
	}
	
	/**
	 * Returns a pointer to the current User in the system.
	 * @return The User object.
	 */
	public User getUser()
	{
		return userObj;
	}

	@Override
	public void handleEvent(Event ev) 
	{
		// Check for a Logout_Event
		if(ev instanceof Logout_Event)
		{
			System.out.println("AccessPointManager handling Logout_Event");
			
			// Run appropriate Logout_measures.
			
			// Remove userObj reference.
			removeUserObj();
		}
	}
}
