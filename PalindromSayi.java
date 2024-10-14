import java.util.Scanner;

public class PalindromSayi {

    public static int tersSayi(int sayi,int ters){
        if(sayi == 0){
            return ters;
        }
        ters = (ters*10) + (sayi%10);
        return tersSayi(sayi /10,ters);
    }

    public static boolean palindromMu(int sayi){
        if(sayi<0){
            return false;
        }
        int ters = tersSayi(sayi,0);
        return sayi == ters;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int num = input.nextInt();

        if(palindromMu(num)){
            System.out.println(num + " bir palindrom sayıdır.");
        }else{
            System.out.println(num + " palindrom sayı değildir.");
        }

    }
}
