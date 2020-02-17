package simplecompoundinterst;

/*
 * @author Bhargav reddy id:170030703
 */
public class Houserent {
	
	public double constructioncost(String material,double area)
	{
		int cost;
		if(material=="standard")
		{
			 cost=1200;
			
		}
		else if(material=="abovestandard")
		{
			 cost=1500;
		}
		else if(material=="highstandard")
		{
			 cost=1800;
		}
		else
		{
			 cost=2500;
		}
		double totalcost=area*cost;
		return totalcost;
		
	}

}
