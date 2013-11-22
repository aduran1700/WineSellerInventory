package AccessPoint;

import ManageUser.User;

/**
 * Authenticator: is used by the system to authenticate the user�s credentials. 
 * This class deligates some of the work to the DatabaseManager. 
 * 
 * No other class except the LoginPanel has access to this class.
 * @author Rene Alfonso
 */
class Authenticator 
{
	/**
	 * Creates an Authenticator Object.
	 */
	public Authenticator()
	{
		
	}
	
	/**
	 * Authenticates user credentials.
	 * @param id The user's ID.
	 * @param p The user's password.
	 */
	public void authenticate(String id, String p)
	{
		
		// Delegate work to validateCredentials.
		validateCredentials(id, p);
	}
	
	private void validateCredentials(String id, String p)
	{
		// Call database
		
		// If credentials match in database.
		
		// Allow access.
		
		// Get the user Object from the DatabaseManager.
		
		// allowAccess();
		
	}
	
	private void allowAccess(User user)
	{
		// Allow access to the system.
		
		// Pass the User object to the AccessPointManager.
		AccessPointManager.getInstance().pointToUserObj(user);
	}
}
