import java.util.*;
public class vucutKitle {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz:");
        double boy= input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz:");
        int kilo= input.nextInt();

        double x=kilo/(boy*boy);

        System.out.print("Vücut kitle indeksiniz:"+x);



    }
}
