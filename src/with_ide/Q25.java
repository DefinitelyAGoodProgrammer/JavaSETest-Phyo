package with_ide;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        for (int a= 0; a<= rows-1 ; a++)
        {
            for (int b=0; b<=a; b++)
            {
                System.out.print(" ");
            }
            for (int c=1; c<=rows-1-a; c++)
            {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}

//wrong