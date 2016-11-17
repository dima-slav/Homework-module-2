package Task2_1;

/**
 * Created by Дима on 17.11.2016.
 */
public class CalculateMultiplication {
    public static void main(String[] args) {
        int iarray[] = {10, 22, 24, 66, -10, -22, -14, 33, 26, 10};
        double darray[] = {10.5, 22.5, 24.5, 66.5, -10.5, -22.5, -14.5, 33.5, 26.5, 10.5};
        imult(iarray);
        dmult(darray);


    }
    public static int imult(int[] array){
        int mult = 1;
        if (mult == 0){
            System.out.println("Array 1 muliplication result = 0");

        }else{
            for (int i = 0; i < array.length; i++){
                mult = mult * array[i];
            }
            System.out.println("Array 1 multiplication result = " + mult);

        }
        return mult;
    }
    public static double dmult(double[] array){
        double mult = 1;
        if (mult == 0){
            System.out.println("Array 2 multiplication result = 0");

        }else{
            for (int i = 0; i < array.length; i++){
                mult = mult * array[i];
            }
            System.out.println("Array 2 multiplication result = " + mult);

        }
        return mult;

    }
}
