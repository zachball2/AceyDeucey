/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceydeucey;

/**
 *
 * @author Zachcollins
 */
public class ADCard { //creates my cards with there value and suits and it allows you to access each

    private String suit;
    private int value;

    public ADCard(String s, int v) {
        suit = s;
        value = v;
    }

    @Override
    public String toString() {
        String[] sVal = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        //Aces value is zero
        return sVal[value] + " of " + suit;
    }

    public int getVal() {
        return value;
    }

    public String getSuit() {
        return suit;
    }
}
