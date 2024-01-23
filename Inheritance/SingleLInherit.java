package inheritance;

class Shape{
    public void area(){
        System.out.println("displays area");
    }
}

class triangle extends Shape{
    public void area(int i, int j){
        System.out.println(i/2*i*j);
    }
}

public class SingleLInherit {
    public static void main(String[] args) {
        triangle ar= new triangle();
        ar.area(5,10);
    
    }
}
