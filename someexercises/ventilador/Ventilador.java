package someexercises.ventilador;

public class Ventilador {

    boolean ligado = false;

    int velocidade = 1;

    boolean osilacao = false;


    public void ligar(){

        ligado = true;
    }

    public void desligar(){

        ligado = false;
    }
    
    public void mudarVelocidade(int velocidadeDesejada){
        if(velocidadeDesejada > 3){
            System.out.println("A velocidade máxima do ventilador é 3. Ajustado para velociadade máxima");
            velocidade = 3;
        }
        else if(velocidadeDesejada == 0){
            System.out.println("Colocar a velocidade no 0 desliga o ventilador. Ventilador desligado.");

            ligado = false;

        }
        else{
            System.out.println("Velocidade do ventilador alterada para:" + velocidadeDesejada);

            velocidade = velocidadeDesejada;
        }
    }

    public void ligarOsilacao(){

        osilacao = true;

    }

    public void  desligarOsilacao(){
        osilacao = false;
    }
    
}
