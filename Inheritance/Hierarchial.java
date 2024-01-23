package inheritance;

//more than one class extending same super class 
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        Circle ar= new Circle();
        ar.area(5);
    
    }
}
