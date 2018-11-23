
public class Player {
	
	Card cards[];
	
	Player(){
		cards = new Card[5];
		
		for (int i=0; i < cards.length; i++) {
			cards[i] = Card.random();
		}
	}

	public boolean wins(Player player2) {
		return true;
	}
	
	public void analyze() {
		GambleAnalyzer gambleAnalyzer = new GambleAnalyzer();
		gambleAnalyzer.analyze();
	}
}
