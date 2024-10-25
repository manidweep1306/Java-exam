import java.lang.*;

class user {
    public static void validate(int age) {
        if(age < 18) {
            throw new ArithmeticException("not eligible to vote");
        } else {
            System.out.println("eligible to vote");
        }
    }

    public static void main(String args[]) {
        try {
            validate(19);
            validate(14);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}