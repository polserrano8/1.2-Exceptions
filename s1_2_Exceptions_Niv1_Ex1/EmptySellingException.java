package s1_2_Exceptions_Niv1_Ex1;

import java.lang.RuntimeException;
import java.io.Serializable;

public class EmptySellingException extends RuntimeException implements Serializable {
	//ToDo
	private String msg;
	private static final long serialVersionUID = 1L;
	
	public EmptySellingException(String msg) {
		super(msg);
	}
	@Override
    public String toString() {
        return msg;
    }
}
