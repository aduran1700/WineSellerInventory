package MessageManager.Entities;
import MessageManager.Events.Event;


/**
 * Entity represents any class that will listen to messages/Events.
 * @author Rene Alfonso
 */
public interface Entity 
{
	/**
	 * Handles the Event that is delegated to this class.
	 * @param ev The Event.
	 */
	void handleEvent(Event ev);
}
