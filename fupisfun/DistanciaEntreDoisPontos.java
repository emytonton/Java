package fupisfun;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        System.out.println("Digite a cordenada x do primeiro ponto: ");
        double pontox1 = scanner.nextDouble();

        System.out.println("Digite a cordenada y do primeiro ponto: ");
        double pontoy1 = scanner.nextDouble();

        System.out.println("Digite a cordenada x do segundo ponto: ");
        double pontox2 = scanner.nextDouble();

        System.out.println("Digite a cordenada y do segundo ponto: ");
        double pontoy2 = scanner.nextDouble();


        double calculo1 = (pontox2 - pontox1); 
        double calculo2 = (pontoy2 - pontoy1);

        double calculo1elevado = Math.pow(calculo1, 2);

        double calculo2elevado = Math.pow(calculo2, 2);

        double soma = calculo1elevado + calculo2elevado;


        double distancia = Math.sqrt(soma);

        System.out.printf("%.2f%n", distancia);

        scanner.close();



    }
    
}
