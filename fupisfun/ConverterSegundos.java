package fupisfun;

import java.util.Locale;
import java.util.Scanner;

public class ConverterSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Informe os segundos para converter: ");
        int segundos =  Integer.parseInt(scanner.nextLine().trim()); 

        int horas = segundos / 3600;

        int resto = segundos % 3600;

        int minutos = resto / 60;

        int segundosFinais = resto % 60;


        System.out.println(horas + ":" + minutos + ":" + segundosFinais);

        scanner.close();
    }
    
}
