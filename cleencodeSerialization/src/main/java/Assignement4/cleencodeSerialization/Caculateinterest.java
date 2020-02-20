package Assignement4.cleencodeSerialization;

public class Caculateinterest {

	public double simpleInterestcalculator(double amount,double time,double interestrate)
	{
		return amount+(amount*time*interestrate/100.00);
	}
	public double compoundinterestcalculator(double amount,double time,double interestrate)
	{
		return (double)amount*Math.pow(1+interestrate/100.0,time);
	}
}
