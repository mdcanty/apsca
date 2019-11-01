public class fraction{
	private int numerator;
	private int denominator;

	public fraction(){
		numerator = 0;
		denominator = 1;
	}

	public fraction(int a, int b){
		numerator = a;
		if(b == 0){
			denominator = 1;
		}else{
			denominator = b;
		}
	}

	public void print(){
		System.out.println("Your fraction is: " + numerator	+ "/" + denominator);
	}
	public String print2(){
		return "Your fraction is: " + numerator	+ "/" + denominator;
	}

	public void toDecimal(){
		System.out.println("Your decimal is: " + ((double) numerator / denominator));
	}
}
