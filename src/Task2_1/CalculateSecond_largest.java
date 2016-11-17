package Task2_1;

/**
 * Created by Дима on 17.11.2016.
 */
public class CalculateSecond_largest {
    public static void main(String[] args) {
        // int[] iarray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] iarray = new int[21];
        for (int i = 0; i < iarray.length; i++) {
            iarray[i] = (int) ((Math.random() * iarray.length) - 10);

        }
        System.out.print("Array 1 contains:");
        for (int i = 0; i < iarray.length; i++) {
            System.out.print(iarray[i] + ", ");
        }
        System.out.println();
        max(iarray);
        System.out.println();
        System.out.println();
        // -----------------------------------------------------------
        double[] darray = new double[31];

        for (int i = 0; i < darray.length; i++) {
            darray[i] = ((Math.random() * darray.length) - 15);
        }
        System.out.print("Array 2 contains:");
        for (int i = 0; i < darray.length; i++) {
            System.out.print(darray[i] + ", ");
        }
        System.out.println();
        maxD(darray);
    }

    public static int max(int[] array) {
        int max = array[0];
        int imax = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;
            }
        }
        int maxSec = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max && i != imax) {
                maxSec = array[i];

            } else if (array[i] != max & maxSec < array[i]) {
                maxSec = array[i];
            }
        }
        System.out.println("Larges number of array 1 = " + max);
        System.out.println("Second largest number of array 1 = " + maxSec);
        return maxSec;

    }

    // -----------------------------------------------------------------
    public static double maxD(double[] array) {
        double max = array[0];
        int imax = 0;
        for (int i =0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                imax = i;

            }
        }
        double maxSec = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max & i != imax) {
                maxSec = array[i];
            } else if (array[i] != max && maxSec < array[i]) {
                maxSec = array[i];
            }
        }
        System.out.println("Largest number of array 2 = " + max);
        System.out.println("Second largest number of array 2 = " + maxSec);
        return maxSec;
    }












        }


