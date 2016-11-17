package Task2_1.Task2_1;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Дима on 17.11.2016.
 */
public class CalculateMax_positive {
    public static void main(String[] args) {
        // Допустим, мы имеем массив, состоящий только из отрицательных чисел.

        int[] iarray = new int [10];

        for (int i = 0; i < iarray.length; i++){
            iarray[i] = (int) ((Math.random() * iarray.length) - 5);
        }
        System.out.print("The array 1 contains:");

        for (int i = 0; i < iarray.length; i++){
            System.out.print(iarray[i] + ", ");
        }
        System.out.println();
        max(iarray);
        System.out.println();
        System.out.println();

        //---------------------------------------
        double[] darray = new double [10];
        for (int i = 0; i < darray.length; i++){
            darray[i] = ((Math.random() * darray.length) - 5);

        }
        System.out.print("The array 2 contains:");
        for (int i = 0; i < darray.length; i++){
            System.out.print(darray[i] + ", ");

        }
        System.out.println();
        maxD(darray);


    }

    public static int max(int array[]){
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];

            }
        }
        if (max > 0){
            System.out.println("The largest positive number of array 1 =" + max);

        }else{
            System.out.println("No largest positive number, because the array 1 contains only negative numbers");
        }
        return max;
    }

    public static double maxD(double[] array){
        double max = array [0];
        for (int i = 0; i < array.length; i++){
            if (max < array[i]){
                max = array[i];

            }
        }
        if (max > 0){
            System.out.println("The largest positive number of array 2 = " + max);
        }else{
            System.out.println("No largest positive number, because the array 2 contains only negative number");

        }
        return max;
    }

}
