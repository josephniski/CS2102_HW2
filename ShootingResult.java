public class ShootingResult implements IEvent
{
	ShootingRound round1, round2, round3, round4;
	
	ShootingResult(ShootingRound r1, ShootingRound r2, ShootingRound r3, ShootingRound r4)
	{
		round1 = r1;
		round2 = r2;
		round3 = r3;
		round4 = r4;
	}

	@Override
	public double pointsEarned()
	{
		return (round1.hit + round2.hit + round3.hit + round4.hit);
	}
}
