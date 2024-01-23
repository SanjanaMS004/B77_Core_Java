import java.util.Arrays;
import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        int[][] arr = new int[3][2]; 
        System.out.println(arr.length); // no of rows // input

        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        System.out.println("array ele:");
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }
}