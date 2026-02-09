import java.util.*;
public class cal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two number for division");
        int first =sc.nextInt();
        int second =sc.nextInt();
        try {
            int result =first/second;
            System.out.println("Result is :"+result);
        } catch (ArithmeticException exception) {
            System.out.println("Dividing by Zero is not Valid ");
        }
    }
}