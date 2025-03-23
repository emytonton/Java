package fupisfun;

import java.util.Scanner;
import java.util.Locale;

public class QuantoSobrou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 

        System.out.print("Qual a quantidade do 1 produto? ");
        int produto1 = Integer.parseInt(scanner.nextLine().trim()); 

        System.out.print("Qual a quantidade do 2 produto? ");
        int produto2 = Integer.parseInt(scanner.nextLine().trim()); 

        System.out.print("Qual a quantidade do 3 produto? ");
        int produto3 = Integer.parseInt(scanner.nextLine().trim()); 

        System.out.print("Qual o valor do 1 produto? ");
        double valorProduto1 = Double.parseDouble(scanner.nextLine().trim()); 

        System.out.print("Qual o valor do 2 produto? ");
        double valorProduto2 = Double.parseDouble(scanner.nextLine().trim()); 

        System.out.print("Qual o valor do 3 produto? ");
        double valorProduto3 = Double.parseDouble(scanner.nextLine().trim()); 

        System.out.print("Qual a quantidade de dinheiro que você deu? ");
        double dinheiroRecebido = Double.parseDouble(scanner.nextLine().trim()); 

        double valorTotal1 = produto1 * valorProduto1;

        double valorTotal2 = produto2 * valorProduto2;

        double valorTotal3 = produto3 * valorProduto3;

        double valorTotalCompra = valorTotal1 + valorTotal2 + valorTotal3;
        
        double troco = dinheiroRecebido - valorTotalCompra;

        System.out.printf("%.2f%n", troco);

        scanner.close();
    }
}
