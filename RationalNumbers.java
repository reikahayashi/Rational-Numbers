
public class RationalNumbers {

	public static void main(String[] args) {
		RationalNums a = new RationalNums(1,2);
		RationalNums b = new RationalNums(1,3);
		
		

		System.out.println(a + " + " + b + " = " + a.add(b)); 
		System.out.println(a + " - " + b + " = " + a.sub(b)); 
		System.out.println(a + " * " + b + " = " + a.mul(b)); 
		System.out.println(a + " / " + b + " = " + a.div(b)); 
}

}
class RationalNums{
		
	
	public RationalNums(int num, int den) {
		
		this.num = num;
		this.den = den;
		
	}
	
	public RationalNums add(RationalNums o) {
		return new RationalNums(((num * o.den)+ (den * o.num)), den*o.den);
		
	}
	public RationalNums div(RationalNums o) {
		return new RationalNums(num * o.den, den * o.num);
		
	}
	public RationalNums mul(RationalNums o) {
		return new RationalNums(num * o.num, den * o.den);
		
	
}
	public RationalNums sub(RationalNums o) {
		return new RationalNums((num*o.den) - (den*o.num), den*o.den);
	
}
	public String toString() {
		
		return "(" + num + "/" + den + ")";
		
	}
	
	private int num;
	private int den;
}

	
//answers

//(1/2) + (1/3) = (5/6)
//(1/2) - (1/3) = (1/6)
//(1/2) * (1/3) = (1/6)
//(1/2) / (1/3) = (3/2)
