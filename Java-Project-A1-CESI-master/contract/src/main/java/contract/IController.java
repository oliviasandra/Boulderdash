package contract;


/**
 * The IController interface
 * @author group 12 olivia serge yves-alexis
 * @version 1.0
 *
 */
public interface IController {

	/**
	 * Control.
	 */
	public void control();

	/**
	 * Order perform.
	 *
	 * @param controllerOrder
	 *          the controller order
	 */
	public void orderPerform(ControllerOrder controllerOrder);
}
