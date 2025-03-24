package fupisfun;

import java.util.Locale;
import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite o numero 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o numero 2: ");
        int num2 = scanner.nextInt();

        
        int maiornumero = 0;

        if(num1 > num2){
            maiornumero = num1;
            System.out.println(maiornumero);
        }
        else{
            maiornumero = num2;
            System.out.println(maiornumero);
        }

        scanner.close();




    }
    
}
