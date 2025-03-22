package bootcamp;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        String nomeUm = "EMILLY";
        String nomeDois = "EMILLY";

        System.out.println(nomeUm == nomeDois);



        String nomeTres = "EMI";
        String nomeQuatro = new String("EMI");

        // AQUI OS "TIPOS" SAO DIFERENTES, ENT A COMPARAÇÃO DARIA FALSE. PARA COMPARAR O CONTEUDO USAMOS EQUALS :

        System.out.println(nomeTres.equals(nomeQuatro));



        int numero1 = 1;
        int numero2 = 2;

        if(numero1 < numero1){
            System.out.println("a nossa condicao é verdadeira");
        }


        boolean simNao = numero1 == numero2;

        System.out.println("O numero 1 é igual ao numero 2 ?" + simNao);

        boolean simNao2 = numero1 != numero2;

        System.out.println("Numero 1 é diferente de Numero 2?"+ simNao2);


    }
    
}
