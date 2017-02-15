
//exception for empty arrays or index out of bounds
@SuppressWarnings("serial")
public class EmptyStructureException extends RuntimeException {
   public EmptyStructureException() { super(); }
   public EmptyStructureException(String s) { super(s); }
}