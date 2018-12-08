/*****************************************
 * Game class for video poker
 * @author Alison Simons
 * @date 4/2/18
 ****************************************/ 

import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.*;

public class Game {
	
    //instance variables
	private Player p;
	private Deck cards;
    private ArrayList<Card> hand;
    private String handy;
    private int type;
    private double odds;
	
	//game with arguments
	public Game(String[] testHand)
    {
		type = 1;
        hand = new ArrayList<Card>();
        
        for (int i = 0; i < 5; i++)
        {
            String cardy = testHand[i];
            char suity = cardy.charAt(0);
            String ranky = cardy.substring(1, cardy.length());
            
            int suit = 1;
            if (suity == 'c')
            {
                suit = 1;
            }
            if (suity == 'd')
            {
                suit = 2;
            }
            if (suity == 'h')
            {
                suit = 3;
            }
            if (suity == 's')
            {
                suit = 4;
            }
            
            int rank = Integer.parseInt(ranky);
            
            Card testCard = new Card(suit, rank);
            hand.add(testCard);            
        }	
	}
	
    //game without arguments
	public Game()
    {
		type = 2;
        p = new Player();
        cards = new Deck();
        cards.shuffle();
	}
	
    //play method for both types of games
	public void play()
    {       
        System.out.println("Welcome to Video Poker!");
        int reply = 1;
        if (type == 1)
        {
            this.checkHand(hand);
            System.out.println("Your hand is a " + handy);
        }
        else if (type == 2)
        {   
            do 
            {
                System.out.println("You have " + p.getBankroll() + " tokens");
                System.out.println("How many tokens would you like to bet?");
                Scanner betting = new Scanner(System.in);
                double bet = betting.nextDouble();
                
                while (bet > p.getBankroll())
                {
                    System.out.println("You don't have that many tokens."
                                      + " Please enter a smaller number");
                    Scanner redo1 = new Scanner(System.in);
                    bet = redo1.nextDouble();
                }
                
                while (bet != 1.0
                       &&bet != 2.0
                       &&bet != 3.0
                       &&bet != 4.0
                       &&bet != 5.0)
                {
                    System.out.println("Please enter a number between "
                                       + "1 and 5 (inclusive)");
                    Scanner redo2 = new Scanner(System.in);
                    bet = redo2.nextDouble();
                }
                
                p.bets(bet);
            
                Card card1 = cards.deal();
                Card card2 = cards.deal();
                Card card3 = cards.deal();
                Card card4 = cards.deal();
                Card card5 = cards.deal();
        
                p.addCard(card1);
                p.addCard(card2);
                p.addCard(card3);
                p.addCard(card4);
                p.addCard(card5);
        
                System.out.println("Your hand is:");
                System.out.println(p.getHand());
        
                System.out.println("Do you want to redeal card 1?"
                                   + " 0 is no, 1 is yes");
                Scanner response1 = new Scanner(System.in);
                int switch1 = response1.nextInt();
        
                System.out.println("Do you want to redeal card 2?"
                                   + " 0 is no, 1 is yes");
                Scanner response2 = new Scanner(System.in);
                int switch2 = response2.nextInt();
        
                System.out.println("Do you want to redeal card 3?"
                                   + " 0 is no, 1 is yes");
                Scanner response3 = new Scanner(System.in);
                int switch3 = response3.nextInt();
        
                System.out.println("Do you want to redeal card 4?"
                                   + " 0 is no, 1 is yes");
                Scanner response4 = new Scanner(System.in);
                int switch4 = response4.nextInt();
        
                System.out.println("Do you want to redeal card 5?"
                                   + " 0 is no, 1 is yes");
                Scanner response5 = new Scanner(System.in);
                int switch5 = response1.nextInt();
        
                if (switch1 == 1)
                {
                    p.removeCard(card1);
                    Card card6 = cards.deal();
                    p.addCard(card6);
                }
                if (switch2 == 1)
                {
                    p.removeCard(card2);
                    Card card7 = cards.deal();
                    p.addCard(card7);
                }
                if (switch3 == 1)
                {
                    p.removeCard(card3);
                    Card card8 = cards.deal();
                    p.addCard(card8);
                }
                if (switch4 == 1)
                {
                    p.removeCard(card4);
                    Card card9 = cards.deal();
                    p.addCard(card9);
                }
                if (switch5 == 1)
                {
                    p.removeCard(card5);
                    Card card10 = cards.deal();
                    p.addCard(card10);
                }
        
                System.out.println("Your new hand:");
                System.out.println(p.getHand());
        
                this.checkHand(p.getHand());
                System.out.println("Your hand is a " + handy);
            
                p.winnings(odds);
                System.out.println("You now have " + p.getBankroll() 
                                   + " tokens");
            
                if (p.getBankroll() != 0)
                {
                    System.out.println("Keep playing? 0 = no, 1 = yes");
                    Scanner answer = new Scanner(System.in);
                    reply = answer.nextInt();
                    if (reply == 0)
                    {
                        System.out.println("Thanks for playing!");
                    }
                }
                else
                {
                    System.out.println("Sorry, you're out of tokens. Better"
                                      + " luck next time!");
                }
                
                cards.shuffle();
                p.emptyHand();
 
                } while (reply == 1&&p.getBankroll() != 0);
            }
	}
	
    //checks for all the hands
	public String checkHand(ArrayList<Card> hand)
    {
        Collections.sort(hand);
        Card card1 = hand.get(0);
        Card card2 = hand.get(1);
        Card card3 = hand.get(2);
        Card card4 = hand.get(3);
        Card card5 = hand.get(4);
        Boolean found = false;
        handy = "";
        
        //check for royal flush
        if (card1.getSuit() == card2.getSuit()
            &&card2.getSuit() == card3.getSuit()
            &&card3.getSuit() == card4.getSuit()
            &&card4.getSuit() == card5.getSuit()
            &&card1.getRank() == 1
            &&card2.getRank() == 10
            &&card3.getRank() == 11
            &&card4.getRank() == 12
            &&card5.getRank() == 13)
        {
            found = true;
            handy = "royal flush";
            odds = 250;
        }
        
        //check for straight flush
        if (found == false
            &&card1.getSuit() == card2.getSuit()
            &&card2.getSuit() == card3.getSuit()
            &&card3.getSuit() == card4.getSuit()
            &&card4.getSuit() == card5.getSuit()
            &&card1.getRank() == card2.getRank() - 1
            &&card2.getRank() == card3.getRank() - 1
            &&card3.getRank() == card4.getRank() - 1
            &&card4.getRank() == card5.getRank() - 1)
        {
            found = true;
            handy = "straight flush";
            odds = 50;
        }
        
        //check for four of a kind
        if (found == false
            &&((card1.getRank() == card2.getRank()
                &&card2.getRank() == card3.getRank()
                &&card3.getRank() == card4.getRank())
               ||(card2.getRank() == card3.getRank()
                  &&card3.getRank() == card4.getRank()
                  &&card4.getRank() == card5.getRank())))
        {
            found = true;
            handy = "four of a kind";
            odds = 25;
        }
        
        //check for full house
        if (found == false
            &&((card1.getRank() == card2.getRank()
                &&card3.getRank() == card4.getRank()
                &&card4.getRank() == card5.getRank())
               ||(card1.getRank() == card2.getRank()
                  &&card2.getRank() == card3.getRank()
                  &&card4.getRank() == card5.getRank())))
        {
            found = true;
            handy = "full house";
            odds = 6;
        }
        
        //check for flush
        if (found == false
            &&card1.getSuit() == card2.getSuit()
            &&card2.getSuit() == card3.getSuit()
            &&card3.getSuit() == card4.getSuit()
            &&card4.getSuit() == card5.getSuit())
        {
            found = true;
            handy = "flush";
            odds = 5;
        }
        
        //check for straight
        if (found == false
            &&((card1.getRank() == card2.getRank() - 1
            &&card2.getRank() == card3.getRank() - 1
            &&card3.getRank() == card4.getRank() - 1
            &&card4.getRank() == card5.getRank() - 1)
               ||(card1.getRank() == 1
                  &&card2.getRank() == 10
                  &&card3.getRank() == 11
                  &&card4.getRank() == 12
                  &&card5.getRank() == 13)))
        {
            found = true;
            handy = "straight";
            odds = 4;
        }
        
        //check for three of a kind
        if (found == false
            &&((card1.getRank() == card2.getRank()
            &&card2.getRank() == card3.getRank())
               ||(card2.getRank() == card3.getRank()
                  &&card3.getRank() == card4.getRank())
               ||(card3.getRank() == card4.getRank()
                  &&card4.getRank() == card5.getRank())))
        {
            found = true;
            handy = "three of a kind";
            odds = 3;
        }
        
        //check for two pairs
        if (found == false
            &&((card1.getRank() == card2.getRank()
                &&card3.getRank() == card4.getRank())
               ||(card1.getRank() == card2.getRank()
                  &&card4.getRank() == card5.getRank())
               ||(card2.getRank() == card3.getRank()
                  &&card4.getRank() == card5.getRank())))
        {
            found = true;
            handy = "two pairs";
            odds = 2;
        }
        
        //check for one pair
        if (found == false
            &&(card1.getRank() == card2.getRank()
                ||card2.getRank() == card3.getRank()
                ||card3.getRank() == card4.getRank()
                ||card4.getRank() == card5.getRank()))
        {
            found = true;
            handy = "one pair";
            odds = 1;
        }
        
        //check for no pair
        if (found == false)
        {
            handy = "no pair";
            odds = 0;
        }
        
        return handy;
	}
}
