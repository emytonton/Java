public class ExercicioArray {
    public static void main(String[] args) {
        
        int[] numeros = {10, 20, 30, 40, 50};
        
        
        int soma = 0;
        
        
        System.out.println("Elementos do array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            soma += numeros[i]; 
        }
        
       
        System.out.println("A soma dos elementos do array é: " + soma);
    }
}