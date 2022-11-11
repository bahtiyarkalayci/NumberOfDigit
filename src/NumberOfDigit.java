import java.util.Scanner;

public class NumberOfDigit {

    public static void main(String[] args) {
        //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14

        Scanner scanner=new Scanner(System.in);
        int number,basamakTop=0;
        System.out.println("sayıyı giriniz");
        number=scanner.nextInt();
        int tempNumber=number;
        int basnumber;



        while (tempNumber!=0){
           basnumber=tempNumber%10;
            System.out.println("basnumber"+basnumber);
            basamakTop+=basnumber;
            tempNumber/=10;

        }
        System.out.println("basamak sayısı toplamı="+basamakTop);
    }
}
