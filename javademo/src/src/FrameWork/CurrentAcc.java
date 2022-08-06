package FrameWork;

public class CurrentAcc extends BankAcc
{
public boolean diposit;
	
    public final float accountbalance=0;
    
	public CurrentAcc(int accno, String accname, float accBal, boolean deposit)
	{
		super(accno, accname, accBal, deposit);
	}

	@Override
	public String toString() 
	{
		return "CurrentAcc [accountbalance=" + accountbalance + ", accno=" + accno + ", accname=" + accname
				+ ", accBal=" + accBal + "]";
	}
}

	

	


	


