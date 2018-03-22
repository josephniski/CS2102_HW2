import java.util.LinkedList;

public class SkiingResult implements IEvent
{
	LinkedList<Double> times;
	int position;
	
	SkiingResult(double t1, double t2, double t3, double t4, double t5, int p)
	{
		this.times.add(t1);
		this.times.add(t2);
		this.times.add(t3);
		this.times.add(t4);
		this.times.add(t5);
		this.position = p;
	}

	@Override
	public double pointsEarned() 
	{
		int sum = 0;
		for(double t: this.times)
		{
			sum += t;
		}
		
		return sum;
	}
}
