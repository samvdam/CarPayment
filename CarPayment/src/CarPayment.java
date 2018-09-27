
public class CarPayment {
	private double price;
	private double down;
	private int time;
	private double interest;
	
	public CarPayment(double p, double d, int t, double i) {
		this.price=p;
		this.down=d;
		this.time=t;
		this.interest=i;
	}
	
	public double monthlyCost() {
		
		double start=price-down;
		
		double total=start+totalInterest();
		
		return total/time;
	}
	
	public double totalInterest() {
		double start=price-down;
		
		double total=start*Math.pow((1+interest/12),time)-start;
		
		return total;
	}
}
