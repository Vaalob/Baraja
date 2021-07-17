package Cartas;

public class Baraja {

    public static void main(String[] args) {

        Deck baraja = new Deck();
        System.out.println("\nSe inicializo con " + baraja.getSize() +" cartas\n");
        baraja.mezclar();
        System.out.println("\nLa primera carta de la baraja es: ");
        baraja.head();
        System.out.println("\nLa carta escogida de la baraja es: ");
        baraja.pick();
        System.out.println("\nTu juego de cartas en la mano son: ");
        baraja.hand();
    }
}