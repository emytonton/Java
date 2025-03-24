package fupisfun;

import java.util.Locale;
import java.util.Scanner;

public class TresouCinco {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();

        if(num1 == 3 || num1 == 5){
            System.out.println("SIM");

        }
        else{
            System.out.println("NAO");
        }


        scanner.close();

    }
    
}
