package lesson8;

/**
 * homework lesson8
 *
 * @author Amina
 * 30.03.2021
 */
public class MyArraySizeException extends Exception{

    public MyArraySizeException() {
    }

    public MyArraySizeException(String message) {
        super(message);
    }

    public MyArraySizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArraySizeException(Throwable cause) {
        super(cause);
    }

    public MyArraySizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
