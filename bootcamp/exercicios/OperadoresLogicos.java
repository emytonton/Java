package bootcamp.exercicios;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condicoes sao verdadeiras");
        }
        else
        System.out.println("Pelo menos uma das condições no teste 1 é falsa");


        if(condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições no teste 2 é verdadeira");

        }
        else{
            System.out.println("As duas condiçõs são falsas");
        }
    }
    
}
