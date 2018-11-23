
public class Statistics {
	
	int valueCont[];
	int colorCont[];

	public Statistics(Card[] cards) {
		
		valueCont = new int[12];
		colorCont = new int[4];
		
		for (int i = 0; i < cards.length; i++) {
		// for (Card card: cardList)
			valueCont[cards[i].number]++;
			colorCont[cards[i].color.ordinal()]++;
		}
	}

}
