package exceptions;

public class PostconditionError extends ContractError {
	private static final long serialVersionUID = 9050050491786738283L;

	public PostconditionError(String service, String method, String message) {
		super("Postcondition failed: "+ "message: "+message + " method " + method + " service " + service);

	}
}
