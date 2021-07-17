package Cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private final String[] tipoPalo = {"Diamante", "Corazón", "Trébol", "Pica"};
    private final String[] tipoColor = {"Negro", "Rojo"};
    private final String[] tipoValor = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};

    private ArrayList<Card> Deck = new ArrayList<Card>();

    public Deck() {

        for (int palo = 0; palo < 2; palo++)
            for (int valor = 0; valor < tipoValor.length; valor++)
                Deck.add(new Card(tipoPalo[palo], tipoColor[1], tipoValor[valor]));

            for (int palo = 2; palo < 4; palo++) {
                for (int valor = 0; valor < tipoValor.length; valor++)
                Deck.add(new Card(tipoPalo[palo], tipoColor[0], tipoValor[valor]));
            }
    }

    public int getSize() {
        return Deck.size();
    }

    public ArrayList<Card> getDeck() {
        return Deck;
    }

    public void mezclar() {
        Collections.shuffle(Deck);
        System.out.println("Se mezcló el Deck.");
    }

    public void head(){
        System.out.println(Deck.get(0));
        Deck.remove(0);
        System.out.println("Quedan " + Deck.size() + " cartas en la baraja");
    }


    public void pick() {
        Random random = new Random();
        System.out.println(Deck.get(random.nextInt(Deck.size())));
        Deck.remove(random.nextInt(Deck.size()));
        System.out.println("Quedan " + Deck.size() + " cartas en la baraja");
    }

    public void hand() {
        for(int i=0; i<=4; i++){
            System.out.println(Deck.get(i));
        }
        for(int i=0; i<=4; i++){
            Deck.remove(i);
        }
        System.out.println("Quedan " + Deck.size()+ " cartas en la baraja");
    }
}