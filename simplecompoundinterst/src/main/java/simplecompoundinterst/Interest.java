package simplecompoundinterst;
/*
 * @author Bhargav reddy id:170030703
 */

public class Interest {
	double simpleinterest(float pricipalamount,float rateofinterest,int time)
	{
		double simpleinterest=(pricipalamount*rateofinterest*time*12)/100;
		return simpleinterest;
		
	}
	double compoundinterest(float pricipalcompound,float rateofinterestcompound,int timecompound)
	{
		double compoundinterest = pricipalcompound* (Math.pow((1 + rateofinterestcompound / 100), timecompound));
		return compoundinterest;
	}

}
