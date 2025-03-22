package someexercises;
import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();
        
        int[] numeros = new int[quantidade];

      
        System.out.println("Digite os números:");
        for (int i = 0; i < quantidade; i++) {
            numeros[i] = scanner.nextInt();
        }

        
        System.out.println("Números primos na lista:");
        for (int num : numeros) {
            if (ehPrimo(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    
    public static boolean ehPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
