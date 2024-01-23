package langPackage;

public class WrapperClass {
    public static void main(String[] args) {
        @SuppressWarnings("removal")
		Integer i=new Integer(10);
		System.out.println(i);
		
        int a = 100;
        Integer i1 = a;
        System.out.println(i1);
    }
}
