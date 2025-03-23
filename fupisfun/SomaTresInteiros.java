package fupisfun;

import java.util.Scanner;

    public class SomaTresInteiros{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Escreva o número 1: ");
            int num1 = scanner.nextInt();

            System.out.println("Escreva o número 2: ");
            int num2 = scanner.nextInt();

            System.out.println("Escreva o número 3: ");
            int num3 = scanner.nextInt();


            int soma = num1 + num2 + num3;

            System.out.println(soma);

            scanner.close();


        }
    }