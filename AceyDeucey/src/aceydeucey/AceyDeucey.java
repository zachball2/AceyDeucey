
package aceydeucey;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * need to have a wallet for betting create deck shuffle then you push 4 into
 * the hoper you pop cards out of the hoper enqueue them into the players hand
 * look at the top two then figure out if they one keep going until they want to
 * quit -or run out of money
 *
 * only need a push and pop -enqueue and dequeue stack and queue need to be an
 * ArrayList
 */
public class AceyDeucey {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Welcome to my Acey Duecy Card Game Program!");
        JOptionPane.showMessageDialog(null, "Here are the game instructions:\n"
                + "1) The dealer deals three cards to your hands\n"
                + "2) You flips the top two cards\n"
                + "3) You bet whether or not the last card is in-between the first two\n"
                + "4) You flip the third card\n"
                + "5) If the third card is in between the other two, you will be given double your bet\n"
                + "6) If the third card is not between the first two, you will lose your bet\n"
                + "7) If the third card is equal to either of the first two, you will lose twice your bet). ");
        JOptionPane.showMessageDialog(null, "By: Zach Collins"
                + "\nCSC 222"
                + "\nProf: Plunkett"); //welcome message
        String name = JOptionPane.showInputDialog("Whats your name?");

        //creates the hands
        ADQueue player = new ADQueue();

        //Stack that will hold cards
        ADStack MainStack = new ADStack();

        //Create decks, shuffles, and pushes them into the hoper
        for (int i = 0; i < 4; i++) {
            ADDeck deck = new ADDeck();
            deck.shuffle();
            while (!deck.isEmpty()) {
                MainStack.push(deck.dealOne());
            }
        }

        String playAgain = "y"; //button to keep going
        int wallet = 100;   //sets my wallet amount

        while (playAgain.equalsIgnoreCase("Y") && !MainStack.empty()) { //While loop for the main program
            JOptionPane.showMessageDialog(null, name + " have $" + wallet + " in your wallet"); //lets user know amount of money they have to play with

            //pops three cards out of my hoper
            for (int i = 0; i < 3; i++) {
                player.add(MainStack.pop());
            }
            //removes cards
            ADCard card1 = player.remove();
            ADCard card2 = player.remove();
            ADCard card3 = player.remove();

            //shows player the cards
            JOptionPane.showMessageDialog(null, "Here are your cards\n"
                    + card1 + "\n" + card2);

            int bet = Integer.parseInt(JOptionPane.showInputDialog("How much money would you like to bet?"));
            if (bet > wallet) {
                JOptionPane.showMessageDialog(null, "You dont have that much money to bet");
                bet = Integer.parseInt(JOptionPane.showInputDialog("How much money would you like to bet?"));

            }

            JOptionPane.showMessageDialog(null, "Here is your third card\n"
                    + card3);

            if (card3.getVal() < card2.getVal() && card3.getVal() > card1.getVal()) {//if card 3 are in between the cards
                wallet = bet + wallet;// adds winning to the wallet
                JOptionPane.showMessageDialog(null, "You Won!!");

            } else if (card3.getVal() == card2.getVal() || card3.getVal() == card1.getVal()) { //if card3 equals either cards
                wallet = wallet - bet * 2;//you lose double your bet
                JOptionPane.showMessageDialog(null, "You lost double:(");
            } else {
                wallet = wallet - bet;  //lose your bet
                JOptionPane.showMessageDialog(null, "You Lost");
            }

            if (wallet == 0) {  //if no funds in wallet
                JOptionPane.showMessageDialog(null, "Sorry you're out of money so the game is over");
                JOptionPane.showMessageDialog(null, "Thanks for letting me take your money " + name + " !");
                System.exit(0);
                //lets you know that your game is over
            }

            playAgain = JOptionPane.showInputDialog("Would you like to continue"
                    + "\nYES|Y|"
                    + "\nNO|N|");   //do you want to keep going

        }
        JOptionPane.showMessageDialog(null, "You finished with $" + wallet + " in your wallet");// lets them know what the had left in their wallet when they finished
        JOptionPane.showMessageDialog(null, "Thanks for using my database " + name + " !"); //exit message
        System.exit(0);

    }
}