public class Athlete 
{
	FinalResult fin;
	
	Athlete(FinalResult f)
	{
		fin = f;
	}
	
	Athlete betterSkiier(Athlete otherAthlete)
	{
		if(this.fin.ski.pointsEarned() < otherAthlete.fin.ski.pointsEarned())
		{
			return this;
		}
		else
		{
			return otherAthlete;
		}
	}
	
	boolean hasBeaten(Athlete otherAthlete)
	{
		if(this.fin.shoot.pointsEarned() > otherAthlete.fin.shoot.pointsEarned())
		{
			return true;
		}
		else
		{
			return (this.fin.ski.pointsEarned() < otherAthlete.fin.ski.pointsEarned());
		}
	}
}
