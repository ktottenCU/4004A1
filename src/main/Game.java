package main;

import javax.swing.JOptionPane;

public class Game {
  
  //Runs all lines in the cardfile as poker games, and prints out all values
  public static void main(String args[]) {
    String s = (String)JOptionPane.showInputDialog("How many lines would you like to run? (Integer Please)");

    //If a string was returned, say so.
    if ((s != null) && (s.length() > 0)) {
      int runs = Integer.parseInt(s);
      
      int i = 0;
      while(i<runs) {
        PokerGame Game = new PokerGame("src/cardfile", i);
        Game.processBehaviour();
        Game.determineWinner();
        i++;
      }
      
      
    }
  }
}
