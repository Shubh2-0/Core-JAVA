


public class  SimpleInterestTester{
	
public static void main(String[] args) {
	
SimpleInterest s1 = new SimpleInterest();
SimpleInterest s2 = new SimpleInterest();




s1.setValues(1005, 2, 7.5);
s2.setValues(1235.50, 2.5, 8.25);

double spFors1 = s1.getInterestAmount();
double spFors2 = s2.getInterestAmount();


System.out.println("Simple Interest for s1 is "+ spFors1);
System.out.println("Simple Interest for s2 is "+ spFors2);



	
	
}
	
	
}


