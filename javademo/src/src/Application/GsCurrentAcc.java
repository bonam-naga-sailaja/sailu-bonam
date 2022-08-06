package Application;

import FrameWork.CurrentAcc;

public class GsCurrentAcc extends CurrentAcc
{
	public GsCurrentAcc(int accno, String accname, float accBal, boolean deposit)
	{
		super(accno, accname, accBal, deposit);
	}

	public void diposit (float charges)
	{
		System.out.println("Dear custmer your balance:" + "+accountbalance" + "diposit:" + diposit);
	}

	@Override
	public String toString() 
	{
		return "GsCurrentAcc [accountbalance=" + accountbalance + ", accno=" + accno + ", accname=" + accname
				+ ", accBal=" + accBal + "]";
	}

}
	


