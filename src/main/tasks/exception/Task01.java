package main.tasks.exception;

// какое исключение будет выброшено из метода при true/false?

import java.nio.charset.IllegalCharsetNameException;

public class Task01 {

    public static void checkExceptions(boolean check) {
        try {
            if (check) {
                throw new NullPointerException("NPE");
            } else {
                throw new IllegalStateException("ISE");
            }
        } catch (NullPointerException e) {
            throw new IllegalCharsetNameException("ICNE");
        } catch (RuntimeException e) {
            throw new ClassFormatError("CFE");
        } catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("AIOBE");
        } finally {
            throw new ClassCastException("CCE");
        }
    }

    public static void main(String[] args) {
//        checkExceptions(true);
        checkExceptions(false);
    }
}
