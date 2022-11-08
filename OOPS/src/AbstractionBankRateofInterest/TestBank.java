package AbstractionBankRateofInterest;

public class TestBank 
{    
	public static void main(String args[])
	{    
		 
		Bank ob =new ICICI();
		ob.getRateOfInterest();
		
		Bank ob1 =new CSB();
		ob1.getRateOfInterest();
		
		Bank ob2 =new HDFC();
		ob2.getRateOfInterest();
		
		//Bank b; 
		//b=new ICICI(); 
		//System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
		
		//b=new CSB();  
		//System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
		
		//b=new HDFC();  
		//System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
	}
}    
