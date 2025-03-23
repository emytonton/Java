package bootcamp.exercicios;

public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);


        String concatenacao ="?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // = 31

        concatenacao =  1 + "1" + 1 + 1; // = 1111
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; // = 1111
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 +1); // = 13
        System.out.println(concatenacao);

        // apartir do momento que ele detecta um caractere, ele para de realizar soma e realiza a concatenacao
    }
    
}
