
public class Poker {
	
	public void main() {
		Player player1 = new Player();
		Player player2 = new Player();
		
		if (player1.wins(player2) == true)
		{
			System.out.println("player1 wins");
		}
		else
		{
			System.out.println("player2 wins");
		}
			
	}

}
