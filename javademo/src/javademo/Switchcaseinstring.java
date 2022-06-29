package javademo;

public class Switchcaseinstring 
{

	public static void main(String[] args) 
	{
		String name ="te";
		switch
		(name.toLowerCase())
		{
		case "author":
			System.out.println("Vikas");
			break;
		case "team":
			System.out.println("Team java Full Stack");
			break;
		case "editor":
			System.out.println("Vishnu & Krishna");
			break;
		default:
			System.out.println("Invalid entry");
			break;
			
		}	
		}

	}


