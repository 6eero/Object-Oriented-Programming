package Exceptions;

public class IllegalActionToDoException extends Throwable {
    public IllegalActionToDoException(String s) {
        System.out.println(s);
    }
}
