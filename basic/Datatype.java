public class Datatype {
    public static void main(String[] args) {
        //primitive
        byte by=127;        // -128 to +127
        short s=32000;      // -32k to +32k
        int num=5;          // -2B to +2B
        long L= 334567l;
        float flt= 5.8f;            // 7 decimals
        double dbl=5.345678d;       // 16 decimals
        boolean b= true;  // does not accepts 0 or 1
        
        System.out.println(by);
        System.out.println(s);
        System.out.println(num);
        System.out.println(L);
        System.out.println(flt);
        System.out.println(dbl);
        System.out.println(b);
        
        //char single quote
        char ch='a';                // 1 byte-> ASCII    and 2 byte-> UNICODE
        char uni='\u0041';
        char ascii=65;

        System.out.println("ch="+ch);
        System.out.println("uni="+uni);
        System.out.println("ascii="+ascii);

        /*non-primitive datatypes
            Unlike primitive data types, these are not predefined. 
            These are user-defined data types created by programmers. 
            These data types are used to store multiple values.
        */
        String str="abcdefg";   //double qupte , immutable
        str="ABCDEFG";
        System.out.println(str);

        String name= new String("Radhe");
        name="RADHE";
        System.out.println(name);

        StringBuffer sb=new StringBuffer("sanjana");
        sb.append("Naidu"); 
        System.out.println(sb); 

        /*
          class
          object
          Array, etc
         */
    }
}
