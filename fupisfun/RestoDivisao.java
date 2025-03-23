package fupisfun;

import java.util.Scanner;


public class RestoDivisao {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva o numero 1: ");
        int num1 = scanner.nextInt();


        System.out.println("Escreva o número 2: ");
        int num2 = scanner.nextInt();

        int quociente = num1 / num2;

        int resto = num1 % num2;

        System.out.println(quociente + " " + resto);

        scanner.close();




    }
    
}
