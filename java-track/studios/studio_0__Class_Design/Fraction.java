package studio_0__Class_Design;

//Fraction
//
//A fraction has a numerator and denominator.
//A fraction should be able to add itself to another fraction, returning a new fraction that represents the sum.
//A fraction should be able to multiply itself by another fraction, returning a new fraction as the product.
//A fraction should be able to take the reciprocal of itself, returning that value as a new fraction.
//A fraction should be able to simplify itself, returning a new fraction as that simplification.


public class Fraction {
	
	//Attributes:
	//n - int
	//d - int
	
	//Methods:
	//-constructor
	//-multiply(Fraction)
	//-reciprocate()
	//-simplify()

	private int n;
	private int d;
	
	public Fraction(int n, int d) {
		this.n = n;
		this.d = d;
	}
	
	public Fraction multiply(Fraction f) {
		int num = this.n * f.n;
		int den = this.d * f.d;
		Fraction newF = new Fraction(num, den);
		return newF;
	}
	
	public Fraction reciprocate() {
		Fraction newF = new Fraction(this.d, this.n);
		return newF;
	}
	
	public Fraction simplify(){
		int gcd = gcd(this.n, this.d);
		int newn = this.n / gcd;
		int newd = this.d / gcd;
		Fraction newf = new Fraction(newn, newd);
		return newf;
	}
	
	public String toString() {
		return this.n + "/" + this.d;
	}
	
	private int gcd(int a, int b) {		
		if (a % b == 0) {
			return b;
		}
		else {
			int newa = b;
			int newb = a % b;
			return gcd(newa, newb);
		}
		
	}
	
	public static void main(String[] args) {
		Fraction frac = new Fraction(12, 16);
		System.out.println(frac.simplify());
	}
	
}
