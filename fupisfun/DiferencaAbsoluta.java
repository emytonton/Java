package fupisfun;

import java.util.Locale;
import java.util.Scanner;

public class DiferencaAbsoluta {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        int diferenca = num1 - num2;

        if(diferenca < 0){
            diferenca = diferenca * -1;
            System.out.println(diferenca);
        }

        else{
            System.out.println(diferenca);
        }

        scanner.close();


    }
    
}
