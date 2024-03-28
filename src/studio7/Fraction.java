package studio7;

public class Fraction {
	
	//instance variables
	private int numerator;
	private int denominator; 
	
	//constructor 
	public Fraction(int x, int y)
	{
		numerator = x;
		denominator = y;
	}
	
	// add itself to another fraction ; then return a new fraction of sum 
	public void add(Fraction y)
	{
		if(this.denominator == y.getDenominator()) {
			this.numerator += y.getNumerator();
		} else {
			this.numerator = this.numerator * y.getDenominator();
			y.setNumerator(y.getNumerator() * this.denominator);
//			y.setDenominator(y.getDenominator() * this.denominator);
			this.denominator = this.denominator * y.getDenominator();
			this.numerator += y.getNumerator();
		}
		
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public void setDenominator(int x) {
		this.denominator = x;
	}
	
	public void setNumerator(int x) {
		this.numerator = x;
	}
	
	// multiply itself ; return product 
	
	// reciprocal itself ; return new value 
	
	// simplify itself ; return simplification 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction x = new Fraction(2,3);
		Fraction y = new Fraction(3,4);
		x.add(y);
		System.out.println(x.getNumerator());
		System.out.println(x.getDenominator());

	}

}
