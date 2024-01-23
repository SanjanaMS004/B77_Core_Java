public class Sum {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        int N= arr.length;
        System.out.println(sum(arr,N));
    }
    static int sum(int[] arr, int N){
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<N;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return max+min;
    } 
}
