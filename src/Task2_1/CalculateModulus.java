package Task2_1;

/**
 * Created by Дима on 17.11.2016.
 */
public class CalculateModulus {
    public static void main(String[] args) {
        int iarray[] = {76,81,48,36,25,20,15,8,4,2};
        double darray[] = {76.5, 81.5, 48.5, 36.5, 25.5, 20.5, 15.5, 8.5, 4.5, 2.5};
        imod(iarray);
        dmod(darray);

    }
    public static int imod(int[] array){
        int a = array [0];
        int b = array[array.length - 1];
        int result1 = a % b;
        System.out.println("Array 1 modulus result =" + result1);
        return result1;
    }
    public static double dmod(double[] array){
        double x = array[0];
        double y = array[array.length - 1];
        double result2 = x % y;
        System.out.println("Array 2 modulus result =" + result2);
        return result2;
    }
}
