/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceydeucey;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Zachcollins
 */
public class ADDeck {//ArrayList easier
    
    private ArrayList<ADCard> deck; //creates my deck
    private Random rand;

    public ADDeck() {  
        deck = new ArrayList<ADCard>();   //randomizes deck
        rand = new Random();
        initialize();
    }

    public void init() {
        initialize();
    }

    private void initialize() {
        String[] suit = {"Spades", "Diamonds", "Hearts", "Clubs"};
        for (int i = 0; i < 52; i++) {
            int val = i % 13;
            int st = i % 4;
            deck.add(new ADCard(suit[st], val));
        }
    }

    public void shuffle() { //shuffles my cards
        for (int i = 0; i < 500; i++) {
            int r1 = rand.nextInt(52);
            int r2 = rand.nextInt(52);
            ADCard temp = deck.get(r1);
            deck.set(r1, deck.get(r2));
            deck.set(r2, temp);
        }
    }

    public boolean isEmpty() {  //lets no when deck is empty
        return deck.isEmpty();
    }

    public ADCard dealOne() {   //deals one card
        if (!deck.isEmpty()) {
            return deck.remove(0);
        } else {
            return null;
        }

    }
}
    

