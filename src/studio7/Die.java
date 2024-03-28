package studio7;

public class Die {
	
	// instance variables 
			private int sides;
			
	// constructor 
		public Die(int n)
		{
			sides = n;
		}
			
	// method to roll the dice 
		public int roll() {
			int rolled = (int) (Math.random() * sides + 1);
			return rolled;
		}
			
			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Die x = new Die(6);
		System.out.print(x.roll());
		
		
	}

}
