import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0;
        int y=0;
        int z = 0;
        System.out.println("Enter values of x,y");

        try {
            x = sc.nextInt();
            y = sc.nextInt();
            z = x / y;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println(z);
        }
    }
}
