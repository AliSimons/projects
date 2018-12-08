/*****************************************
 * Card class for video poker
 * @author Alison Simons
 * @date 4/2/18
 ****************************************/ 

public class Card implements Comparable<Card>{
	
    //instance variables
	private int suit;
    private final int CLUB = 1;
    private final int DIAMOND = 2;
    private final int HEART = 3;
    private final int SPADE = 4;
	private int rank;
    private final int ACE = 1;
    private final int JACK = 11;
    private final int QUEEN = 12;
    private final int KING = 13;
	
    //constructor
	public Card(int s, int r)
    {
		suit = s;
        rank = r;
	}
	
    //comparing method to allow sorting
	public int compareTo(Card c)
    {
        if (this.getRank() > c.getRank())
        {
            return 1;
        }
        if (this.getRank() < c.getRank())
        {
            return -1;
        }
        else
        {
            if (this.getSuit() > c.getSuit())
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
	}
	
    //method to convert card to a string
	public String toString()
    {
		String stringy;
        
        if (rank == ACE)
        {
            stringy = "Ace";
        }
        else if (rank == JACK)
        {
            stringy = "Jack";
        }
        else if (rank == QUEEN)
        {
            stringy = "Queen";
        }
        else if (rank == KING)
        {
            stringy = "King";
        }
        else
        {
            stringy = rank + "";
        }
        
        stringy += " of ";
        
        if (suit == CLUB)
        {
            stringy += "Clubs";
        }
        if (suit == DIAMOND)
        {
            stringy += "Diamonds";
        }
        if (suit == HEART)
        {
            stringy += "Hearts";
        }
        if (suit == SPADE)
        {
            stringy += "Spades";
        }
        
        return stringy;
	}
    
    //returns rank
    public int getRank()
    {
        return rank;
    }
    
    //returns suit
    public int getSuit()
    {
        return suit;
    }
}
