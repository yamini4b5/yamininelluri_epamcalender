package yamini.bubbly;
class Divide{
	double x,y;
	Divide(double x,double y){
		this.x=x;
		this.y=y;
	}
	void div() {
		try {
			if(this.y==0)
				throw new ArithmeticException();
		else
		System.out.println(this.x+this.y);
		}
		catch (ArithmeticException e) {
			System.out.println("Enter valid number other than 0");
		}
	}
}