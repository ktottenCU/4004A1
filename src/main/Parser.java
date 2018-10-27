package main;
////////////////////
//
//Class for the Parser. Brings in the cards from the file
//
////////////////////

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Parser {
  //Class to get the data from the text file
	
  public ArrayList<ArrayList<String>> getCards(String file) throws IOException{
    //Takes a file path, and returns the 52 cards in an arraylist
    
    //Adds all strings to the list
    ArrayList<String> cards = new ArrayList<String>();
    ArrayList<ArrayList<String>> retval = new ArrayList<ArrayList<String>>();
    BufferedReader reader = new BufferedReader(new FileReader(file));
    String line = reader.readLine();
    while (line != null) {
      String[] temp = line.split(" ");
      cards = new ArrayList(Arrays.asList(temp));
      retval.add(cards);
      line = reader.readLine();
    }

    reader.close();

    return retval;
  }

}
