
public class RoyalFlushAnalyzer extends Analyzer {

	RoyalFlushAnalyzer(Card[] cards) {
		super(cards);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean analyze() {
		for (int i = 0; i < statistics.colorCont.length; i++) {
			if (statistics.valueCont[i] == 5)
			{
				if ( 
						(statistics.valueCont[8] == 1) &&
						(statistics.valueCont[9] == 1) &&
						(statistics.valueCont[10] == 1) &&
						(statistics.valueCont[11] == 1) &&
						(statistics.valueCont[12] == 1) 
					)
				{
					return true;
				}
			}
		}
		return false;
	}

}
