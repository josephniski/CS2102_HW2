import static org.junit.Assert.*;
import org.junit.Test;

public class Examples 
{
	ShootingRound SRound1 = new ShootingRound(1);
	ShootingRound SRound2 = new ShootingRound(2);
	ShootingRound SRound3 = new ShootingRound(3);
	ShootingRound SRound4 = new ShootingRound(4);
	ShootingRound SRound5 = new ShootingRound(5);
	
	ShootingResult ShResult1 = new ShootingResult(SRound5,SRound5,SRound5,SRound4);
	ShootingResult ShResult2 = new ShootingResult(SRound1,SRound1,SRound1,SRound2);
	
	SkiingResult SkResult1 = new SkiingResult(1.0, 1.0, 1.0, 2.0, 2.0, 1);
	SkiingResult SkResult2 = new SkiingResult(2.0, 2.0, 2.0, 1.0, 1.0, 2);
	
	FinalResult Final1 = new FinalResult(ShResult1, SkResult1);
	FinalResult Final2 = new FinalResult(ShResult2, SkResult2);
	
	Athlete Athlete1 = new Athlete(Final1);
	Athlete Athlete2 = new Athlete(Final2);
	
	public Examples(){}
	
	@Test
	public void checkShootingResult()
	{
		assertEquals(SRound5, ShResult1.round1);
		assertEquals(4, ShResult1.round4.hit);
		assertEquals(SRound1, ShResult2.round2);
		assertEquals(2, ShResult2.round4.hit);
	}
	
	@Test
	public void checkSkiingResult()
	{
		assertEquals(1.0, SkResult1.time1, 0.01);
		assertEquals(2.0, SkResult2.time2, 0.01);
		assertEquals(1, SkResult1.position);
	}
	
	@Test
	public void checkGetShootingPenalties()
	{
		assertEquals(60.0, Final1.getShootingPenalties(ShResult1), 0.01);
		assertEquals(900.0, Final2.getShootingPenalties(ShResult2), 0.01);
	}
	
	@Test
	public void checkFinalScore()
	{
		assertEquals(57.0, Final1.finalScore(), 0.01);
		assertEquals(901.0, Final2.finalScore(), 0.01);
	}
	
	@Test
	public void checkBetterSkier()
	{
		assertEquals(Athlete1, Athlete1.betterSkiier(Athlete2));
		assertEquals(Athlete1, Athlete2.betterSkiier(Athlete1));
	}
	
	@Test 
	public void checkHasBeaten()
	{
		assertEquals(false, Athlete2.hasBeaten(Athlete1));
		assertEquals(true, Athlete1.hasBeaten(Athlete2));
	}
}
