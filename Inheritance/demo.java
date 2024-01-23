package inheritance;

class Shape{
    String color;
}

class Triangle extends Shape{
    //triangle automatically inherites properties of class shape
}

public class demo {
    public static void main(String[] args) {
        Triangle col= new Triangle();
        col.color="red";
    }
}
