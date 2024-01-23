import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr=new int[]{45,85,32,65,89};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println("maximum: "+max(arr));
    }
    static int max(int[] arr){
        int max_num=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max_num<arr[i]){
                max_num=arr[i];
            }

        }
        return max_num;
    }
}
