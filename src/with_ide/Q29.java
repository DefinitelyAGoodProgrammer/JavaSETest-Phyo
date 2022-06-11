package with_ide;

import java.util.Arrays;

public class Q29 {

    public static void main(String[] args) {
        int myArray[]={10,20,30,40,50};
        System.out.println(Arrays.toString(myArray));

        for (int i = myArray.length-1;i>=0;i--){
            System.out.println(myArray[i]);
        }

        /*int[] myArray = new int[]{10,20,30,40,50};
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        for (int i = myArray.length-1;i>=0;i--){
            System.out.println(Arrays.toString(myArray));
        }*/

    }
}
