import java.util.Arrays;
import java.util.Scanner;

public class OneDArray {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("enter size");
        int size= in.nextInt();
        int arr[]=new int[size];

        System.out.println("enter elements");
        //input
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }

        System.out.println("ele are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
}