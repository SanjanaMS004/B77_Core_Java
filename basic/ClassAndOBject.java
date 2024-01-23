class Pen{
    String color;
    String Type;

    public void write(){
        System.out.println("Writting..");
    }
    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.Type);
    }
    Pen(){

    }
    Pen(Pen penN){
        this.color=penN.color;
        this.Type=penN.Type;
    }
}

// Student
 
class Student {
    String name;
    int age;
    
}
public class ClassAndOBject{
    public static void main(String[] args) {
        //class pen
        Pen pen1=new Pen();
        pen1.color="black";
        pen1.Type="gel";

        Pen pen2=new Pen(pen1);

        pen1.write();
        pen2.printInfo();

        //class Student
        Student s1=new Student(); //const is created by default
        s1.name="sam";
        s1.age=20;

    }
}