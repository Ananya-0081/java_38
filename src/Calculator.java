import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, z = 0;
        System.out.println("Enter values of x,y");
        x = sc.nextInt();
        y = sc.nextInt();
        try {
            z = x / y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(z);
        }
    }
}
