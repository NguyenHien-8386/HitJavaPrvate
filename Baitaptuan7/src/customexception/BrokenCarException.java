package customexception;

public class BrokenCarException extends Exception{
    public BrokenCarException (String messager){
        super(messager);
    }
}
