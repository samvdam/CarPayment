import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test
	public void monthlyCost_Test1() throws java.lang.Exception{
		CarPayment c= new CarPayment(25000.0,3000,60,.03);
		assertTrue((int) c.monthlyCost()==425);
	}
	
	@Test
	public void totalInterest_Test1() throws java.lang.Exception{
		CarPayment c= new CarPayment(25000.0,3000,60,.03);
		assertTrue((int) c.totalInterest()==3555);
	}

}
