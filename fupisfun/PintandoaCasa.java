package fupisfun;

import java.util.Locale;
import java.util.Scanner;

public class PintandoaCasa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 


        System.out.println("Digite o tamanho do primeiro lado do triangulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Digite o tamanho do segundo lado do triangulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Digite o tamanho do terceiro lado do triangulo: ");
        double lado3 = scanner.nextDouble();

        double p = (lado1 + lado2 + lado3) / 2;

        double area = p * (p - lado1) * (p - lado2) * (p - lado3);

        double areafinal = Math.sqrt(area);

        System.out.printf("%.2f%n", areafinal);


        scanner.close();






        
    }
    
}
