package bootcamp.sistemasmartv_metodos;

public class Usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv esta ligada? " + smartTv.ligada);

        System.out.println("Qual o canal atual? " + smartTv.canal);

        System.out.println("Qual o vlume atual? " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada?" + smartTv.ligada);


        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada?" + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Aumentou o volume! Volume atual: " + smartTv.volume);


        smartTv.diminuirVolume();
        System.out.println("Diminuiu o volume! Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("Voce mudou o canal! Canal atual: " + smartTv.canal);





    }
}
