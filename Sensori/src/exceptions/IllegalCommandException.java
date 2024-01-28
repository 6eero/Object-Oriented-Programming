package Exceptions;

public class IllegalCommandException extends Throwable {
    public IllegalCommandException(String s) {
        System.out.println(s);
    }
}
