
public abstract class Analyzer {
	
	Analyzer next;
	
	Statistics statistics;
	
	Analyzer(Card cards[]) {
		statistics = new Statistics(cards);		
	}
	
	public abstract boolean analyze();

}
