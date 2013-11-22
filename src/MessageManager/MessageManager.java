package MessageManager;
import java.util.ArrayList;

import MessageManager.Entities.Entity;
import MessageManager.Events.Event;

/**
 * The MessageManager will notify all listeners every time there is a new Event.
 * @author Rene Alfonso
 */
public class MessageManager 
{
	// Instance of this object.
	private static MessageManager instance;
	
	// List of observers.
	private ArrayList<Entity> observersList;
	
	// Constructor.
	private MessageManager()
	{
		observersList = new ArrayList<Entity>();
	}
	
	/**
	 * Singleton global access point to the instance of this object.
	 * @return The instance.
	 */
	public static MessageManager getInstance()
	{
		// Check if instance is null.
		if(instance == null)
			// Create the instance.
			instance = new MessageManager();
		
		// Return the instance.
		return instance;
	}
	
	/**
	 * Registers an observer.
	 * @param en The Entity to register.
	 */
	public void registerObserver(Entity en)
	{
		// Check for null. 
		if(en == null)
			return;
		
		observersList.add(en);
	}
	
	/**
	 * Unregister an observer.
	 * @param en The Entity to unregister.
	 */
	public void unRegisterObserver(Entity en)
	{
		// Check for null.
		if(en == null)
			return;
		
		observersList.remove(en);
	}
	
	/**
	 * Notifies an Event to all registered observers.
	 * @param ev An Event.
	 */
	public void notifyEvent(Event ev)
	{
		for(Entity en : observersList)
			// Check if Entity is null. Someone might have forgotten to unregister when
			// closing their Pane.
			if(en != null)
				en.handleEvent(ev);
	}
}
