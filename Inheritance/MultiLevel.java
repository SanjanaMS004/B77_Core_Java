package inheritance;

//extends an extended class
class EquilateralTriangle extends triangle{
    public void area(int l, int h){
        System.out.println(l/2*l*h);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        EquilateralTriangle ar= new EquilateralTriangle();
        ar.area(5,10);
    }
}
