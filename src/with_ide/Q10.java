package with_ide;

import java.util.Arrays;
import java.util.Collections;

public class Q10 {

    public static void main(String[] args) {
        int myArray[] = {5,4,1,8,6,9};
        Arrays.sort(myArray,0,5);
        System.out.println(Arrays.toString(myArray));
        System.out.println();

        /*Arrays.sort(myArray,0,5, Collections.reverseOrder());
        System.out.println(Arrays.toString(myArray));*/

    }
}
