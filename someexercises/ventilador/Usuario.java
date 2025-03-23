package someexercises.ventilador;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Ventilador ventilador = new Ventilador();


        System.out.println("O ventilador está ligado? " + ventilador.ligado);

        System.out.println("Qual a velocidade? " + ventilador.velocidade);

        System.out.println("O ventilador está em modo de osilação? " + ventilador.osilacao);

        ventilador.ligar();
        System.out.println("O ventilador foi ligado. Status atual: "+ ventilador.ligado);

        System.out.println("Escolha a velocidade do ventilador: ");
        int velocidade = scanner.nextInt();


        ventilador.mudarVelocidade(velocidade); 

        scanner.close();

        System.out.println("Velocidade atual do ventilador: " + ventilador.velocidade);

        ventilador.ligarOsilacao();
        System.out.println("Osilação foi ligada! Novo status: " + ventilador.osilacao);


        ventilador.desligar();
        System.out.println("Ventilador foi desligado! Até proxima onda de calor!");


    }
    
}
