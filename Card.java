   

import java.util.Random;

public class Card {
	private final int maxSuit = 4; // using camel case naming convention
	private final int maxValue = 13;

	private int suit;
	private int face_value;

	
	public Card() {    // Constructor
		Random randomVal = new Random();
		suit = randomVal.nextInt(MaxSuit) + 1; 
		face_value = ran.nextInt(MaxValue) + 1; 
	}

	public void setSuit(int suit) {
		if (suit > 0 && suit <= MaxSuit) {
			this.suit = suit;
		}
	}

	public void setValue(int value) {
		if (value > 0 && value <= MaxValue) {
			this.face_value = value;
		}
	}

	public String getSuit() {
		String suitResult = null;
		if (suit == 1) {
			suitResult = "Hearts";
		} else if (suit == 2) {
			suitResult = "Spades";
		} else if (suit == 3) {
			suitResult = "Clubs";
		} else if (suit == 4) {
			suitResult = "Diamonds";
		}
		return suitResult;
	}

	public String getValue() {
		String valueResult = null;
		switch (face_value) {
		case 1:
			valueResult = "Ace";
			break;
		case 2:
			valueResult = "2";
			break;
		case 3:
			valueResult = "3";
			break;
		case 4:
			valueResult = "4";
			break;
		case 5:
			valueResult = "5";
			break;
		case 6:
			valueResult = "6";
			break;
		case 7:
			valueResult = "7";
			break;
		case 8:
			valueResult = "8";
			break;
		case 9:
			valueResult = "9";
			break;
		case 10:
			valueResult = "10";
			break;
		case 11:
			valueResult = "Jack";
			break;
		case 12:
			valueResult = "Queen";
			break;
		case 13:
			valueResult = "King";
			break;
		}
		return valueResult;
	}

	public String toString() {
		return getValue() + " of "+ getSuit();
	}

	public static void main(String[] args) {
		final int LIMIT = 5;
		String[] array = new String[LIMIT]; 

		for (int index = 0; index < LIMIT; index++) {
			array[index] = new Card().toString();
		}
		
		System.out.println("The random cards were:" + LIMIT );  
     	for (String result : array) 
     	{
     		System.out.print(result + "\n");
		}
	}
}
