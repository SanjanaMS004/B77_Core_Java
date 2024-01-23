package Override;

public class MOr {
    public static void main(String[] args) {
        RBI rbi;
        
        //assigning child class obj to parent class ref var
        rbi= new SBI();
        System.out.println(rbi.getRateOfInterest());
        System.out.println(rbi.getClass());
        System.out.println(rbi.hashCode());
        System.out.println();

        rbi= new HDFC();
        System.out.println(rbi.getRateOfInterest());
        System.out.println(rbi.getClass());
        System.out.println(rbi.hashCode());

        rbi= new ICIC();
        System.out.println(rbi.getRateOfInterest());
        System.out.println(rbi.getClass());
        System.out.println(rbi.hashCode());
    }
}
