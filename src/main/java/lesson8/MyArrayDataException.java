package lesson8;

/**
 * homework lesson8
 *
 * @author Amina
 * 30.03.2021
 */
public class MyArrayDataException extends Exception{
    public MyArrayDataException() {
    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyArrayDataException(Throwable cause) {
        super(cause);
    }

    public MyArrayDataException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
