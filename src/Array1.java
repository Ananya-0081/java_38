import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        int a[][]=new int [2][3];
        int b[][]=new int [2][3];
        int c[][]=new int [2][3];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}