package langPackage;

public class WrapperClassOne {
    public static void main(String[] args) {
        System.out.println("Hello World");

		int a = Integer.parseInt(args[1]);
		int b = Integer.parseInt(args[2]);
		int c = a + b;
		System.out.println(c);
    }
}
