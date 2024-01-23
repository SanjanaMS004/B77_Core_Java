package Overloading;

class Overload{
    public double add (double a, double b){
        return a+b;
    }
    public int add(int a,int b){
        return a+b;
    }
    public String add(String a,String b){
        return a+b;
    }
    public int add(int a,int b, int c){
        return a+b+c;
    }
}

public class MOl {
    public static void main(String[] args) {
        Overload x=new Overload();

        String res=x.add("abc", "xyz");
        System.out.println(res);

        int res1=x.add(2, 3);
        System.out.println(res1);

        double res2=x.add(2.33, 4.32);
        System.out.println(res2);
        
        int res3=x.add(2, 2, 8);
        System.out.println(res3);
    }
}
