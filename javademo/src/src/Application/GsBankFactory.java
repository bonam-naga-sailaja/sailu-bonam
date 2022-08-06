package Application;
import FrameWork.BankFactory;
import FrameWork.CurrentAcc;
import FrameWork.SavingAcc;

public class GsBankFactory implements BankFactory 
{

		public SavingAcc getNewSavingAccount(int accno, String accname, float accBal, boolean withdraw)
		{
			GsSavingAcc gssaving = new GsSavingAcc(accno, accname, accBal, withdraw);
			return null;
		}

		public CurrentAcc getNewCurrentAccount(int accno, String accname, float accBal, boolean deposit) 
		{
			return null;
		}

		public CurrentAcc getNewCurrentAcc(int accno, String accname, float accBal, boolean deposit)
		{
			return null;
		}

	}


		

