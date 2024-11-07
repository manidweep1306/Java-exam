import java.util.Scanner;

public class StringBufferExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        StringBuffer sb = new StringBuffer("Hello World!");
        System.out.println("Original string: " + sb);
            sb.delete(5,9);
            System.out.println("String after deletion: " + sb);
            sb.deleteCharAt(4);
            System.out.println("String after deletion: " + sb);
    }
}
