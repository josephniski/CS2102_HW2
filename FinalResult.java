public class FinalResult 
{
	ShootingResult shoot;
	SkiingResult ski;
	
	FinalResult(ShootingResult sh, SkiingResult sk)
	{
		shoot = sh;
		ski = sk;
	}
	
	double getShootingPenalties(ShootingResult sh)
	{
		return (20 - this.shoot.pointsEarned()) * 60;
	}

	double finalScore()
	{
		if(this.ski.position == 1)
		{
			return this.ski.pointsEarned() + this.getShootingPenalties(shoot) - 10;
		}
		else if(this.ski.position == 2)
		{
			return this.ski.pointsEarned() + this.getShootingPenalties(shoot) - 7;
		}
		else if(this.ski.position == 3)
		{
			return this.ski.pointsEarned() + this.getShootingPenalties(shoot) - 3;
		}
		else
		{
			return this.ski.pointsEarned() + this.getShootingPenalties(shoot);
		}
	}
}
