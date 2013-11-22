package MessageManager.Entities;

/** 
 * Pane_Entity: should be realized by any class that wants to handle pane related 
 * Events. It serves as an intermediate between Entity and concrete Pane Entities to 
 * facilitate software upgrades in the future.
 * @author Rene Alfonso
 */
public interface Pane_Entity extends Entity
{
	/**
	 * Call this method when you want to close a pane.
	 * 
	 * Why is this method here? Well, this way you can't forget to 
	 * close a pane.
	 */
	void closePane();
}
