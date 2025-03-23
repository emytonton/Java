package fupisfun;

import java.util.Scanner;

public class MediaDoisInteiros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o numero 1:");
        int num1 = scanner.nextInt();


        System.out.println("Digite o numero 2: ");
        int num2 = scanner.nextInt();


        double media = (num1 + num2) / 2;

        System.out.printf("%.1f%n", media);

        scanner.close();





    }
    
}
