import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

	private ArrayList<Integer> cards;

	public CardDeck() {

		super();
		cards = new ArrayList<Integer>();
	}

	ArrayList<Integer> createCardDeck() {

		for (int i = 0; i < 4; i++)
			cards.add(11);
		for (int j = 0; j < 16; j++)
			cards.add(10);
		for (int k = 2; k <= 9; k++)
			for (int i = 0; i < 4; i++)
				cards.add(k);

		Collections.shuffle(cards);
		return cards;
	}

	public ArrayList<Integer> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Integer> cards) {
		this.cards = cards;
	}

}