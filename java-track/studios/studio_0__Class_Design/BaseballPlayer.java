package studio_0__Class_Design;

//BaseballPlayer
//
//A baseball player has a name and a jersey number.
//Most players hit either right or left, but some can hit either way.
//This object should be able to react when a player completes a game,
//	recording how many hits and RBIs the player earned in that game.
//A player has a certain number of runs and RBIs he or she has recorded over all games played.
//A player has a certain number of games he or she has played.


public class BaseballPlayer {
	
	//Attributes:
	//name - String
	//jersey - int
	//batsLeft - boolean
	//batsRight - boolean
	//runs - int
	//RBIs - int
	//games - int
	
	
	//Methods:
	//constructor
	//recordHits(int)
	//recordRBI(int)
	
	private String name;
	private int jersey;
	private boolean batsLeft; 
	private boolean batsRight;
	private int runs;
	private int RBIs;
	private int games;
	private int hits;  //not in specs, but recordHits() is
	
	public BaseballPlayer(	String name, 
							int jersey, 
							boolean batsLeft, 
							boolean batsRight, 
							int runs, 
							int RBIs, 
							int games,
							int hits) {		// added
		this.name = name;
		this.jersey = jersey;
		this.batsLeft = batsLeft;
		this.batsRight = batsRight;
		this.runs = runs;
		this.RBIs = RBIs;
		this.games = games;
		this.hits = hits; 		// added
	}
	
	public void recordHits(int hits) {
		this.hits += hits;		
	}

	public void recordRBIs(int RBIs) {
		this.RBIs += RBIs;
	}
	
	public String toString() {
		return 	"Name: "  + this.name + 
				"  Jersey: " + this.jersey +
				"  BatsLeft: " + this.batsLeft +
				"  BatsRight: " + this.batsRight +
				"  runs: " + this.runs +
				"  RBIs: " + this.RBIs +
				"  games: " + this.games +
				"  hits: " + this.hits;				
	}
	
	public static void main(String[] args) {
		BaseballPlayer baller = new BaseballPlayer("Jackie", 79, true, false, 60, 243, 27, 9001);
		System.out.println(baller);
	}
	
}
