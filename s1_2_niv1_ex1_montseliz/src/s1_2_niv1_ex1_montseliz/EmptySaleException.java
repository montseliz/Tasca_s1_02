package s1_2_niv1_ex1_montseliz;

public class EmptySaleException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public EmptySaleException() {
	}
	
	public EmptySaleException(String errorMessage) {
		super(errorMessage); 
	}
	


}
