package fupisfun;

import java.util.Locale;
import java.util.Scanner;

public class ConversorparaFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US); 


        System.out.println("Digite a temperatura em graus celsius: ");
        double temperaturaCelcius = scanner.nextDouble();

        double temperaturaF = (1.8 * temperaturaCelcius) + 32;

        System.out.printf("%.6f%n", temperaturaF );

        scanner.close();



        
    }
    
}
