import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // num1 = Fibonacci dizisinin kaçıncı terime kadar oluşturulacağını belirten bir tamsayı
     //num2= Fibonacci dizisinin   bir önceki sayısını tutar.
        int num, num2 = 1,num3 = 1, num4;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        num = input.nextInt();
        for (int  i = 3; i <= num ; i++){  // 3'ten baslamasının sebebi ilk iki terim döngüyü baslatır
            num4 = num2 + num3;
            System.out.println(num4);
            num2 =num3;
            num3 =num4;
        }




    }
}