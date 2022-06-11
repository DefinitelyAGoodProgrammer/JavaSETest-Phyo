package with_ide;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
        /*int myArray[] = {23,24,12,78,62};
        int max = myArray[0];
        int i;
        for (i=1; i<myArray.length;i++){
            if (myArray[i]>max)
                max = myArray[i];

            System.out.println(max);


        }*/

        int myArr[] = {23,24,12,78,62};
        int max = Arrays.stream(myArr).max().getAsInt();
        System.out.println(max);




    }
}
