import  java.util.*;
public class Exazample {
    public static void main(String [] arg) {
        int a =6;
        Random b = new Random();
        System.out.println(a);
        System.out.println(b.nextInt(6));
        System.out.println(a);
        int d=Math.abs(b.nextInt());
        System.out.println(d);
    }
}
