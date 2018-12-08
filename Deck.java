/*****************************************
 * Deck class for video poker
 * @author Alison Simons
 * @date 4/2/18
 ****************************************/ 

public class Deck
{
	//instance variables
	private Card[] cards;
	private int top;
	
    //constructor
	public Deck()
    {
		cards = new Card[52]; 
        top = 0;
        int i = 0;
        int suit;
        int rank;
        for (suit = 1; suit <= 4; suit++)
        {
            for (rank = 1; rank <= 13; rank++)
            {
                cards[i] = new Card(suit, rank);
                i++;
            }
        }
	}
	
    //shuffles deck by swapping two random cards 1000 times
	public void shuffle()
    {
		int i;
        for (i = 0; i < 1000; i++)
        {
            int randomOne = (int) (Math.random()*52);
            int randomTwo = (int) (Math.random()*52);
            Card temp = cards[randomTwo];
            cards[randomTwo] = cards[randomOne];
            cards[randomOne] = temp;
            top = 0;
        }
	}
	
    //returns the top card and makes the next card in the deck the top card
	public Card deal()
    {
        Card topCard = cards[top];
        top++;
        return topCard;
    }
}
