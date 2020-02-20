package Assignement4.cleencodeSerialization;

public class EstimateCost {

	public double estimate(int standard,double area,boolean automated)
	{
		if(standard==1)
			return (double)1200*area;
		else if(standard==2)
			return (double)1500*area;
		else if(standard==3&&!automated)
			return (double)1800*area;
		else
			return (double)2500*area;
	}
	
}
