/*****************************************
 * Player class for video poker
 * @author Alison Simons
 * @date 4/2/18
 ****************************************/ 

import java.util.ArrayList;

public class Player {
	
	//instance variables	
	private ArrayList<Card> hand; // the player's cards
	private double bankroll;
    private double bet;
	
    //constructor
	public Player()
    {		
        hand = new ArrayList<Card>();
        bankroll = 5;
        bet = 0;
	}

    //adds a card to the hand
	public void addCard(Card c)
    {
        hand.add(c);
	}

    //removes a card from the hand
	public void removeCard(Card c)
    {
        hand.remove(c);        
    }
	
    //bets tokens
    public void bets(double amt)
    {
        bet = amt;
        bankroll -= bet;
    }

    //calculates winnings and adds them to bankroll
    public void winnings(double odds)
    {
        double won = odds * bet;
        bankroll += won;        
    }

    //returns bankroll
    public double getBankroll()
    {
        return bankroll;
    }
    
    //returns hand
    public ArrayList<Card> getHand()
    {
        return hand;
    }
    
    //empties hand
    public void emptyHand()
    {
        hand.clear();
    }
}


