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

        if (x<=18.5){
            System.out.print("\nDurumunuz:"+"ZAYIF");
        }
        else if (18.5 < x && x <= 24.9) {
                System.out.println("\nDurumunuz:"+"NORMAL");
            }
        else if(24.9<x && x<=29.9) {
            System.out.print("\nDurumunuz:" + "ŞİŞMAN");
        }
        else if(29.9<x && x<=34.9) {
            System.out.print("\nDurumunuz:" + "OBEZ");
         }
        else{
            System.out.print("\nDurumunuz:"+"AŞIRI OBEZ");
        }
        }


    }

