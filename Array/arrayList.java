import java.util.ArrayList;
import java.util.Scanner;
public class ArrayL {
    public static void main(String[] args) {
        ArrayList<Integer> var= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
              
        System.out.println("ADD ELE:");
        for(int i=0;i<5;i++){
            var.add(sc.nextInt());
        }
        
        for(int i=0;i<5;i++){
            System.out.println(var.get(i));
        }
        sc.close();
    }
}