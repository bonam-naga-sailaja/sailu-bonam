package collections;

import java.util.Hashtable;

public class HashTable
{

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht1 = new Hashtable<>();
		Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();


		ht1.put(11, "Arun");
		ht1.put(24, "Kiran");
		ht1.put(33, "Sravya");

		ht2.put(40, "Bharathi");
		ht2.put(05, "Pavani");
		ht2.put(16, "Sailaja");

		
		System.out.println("Student ID with Names : " + ht1);
		System.out.println("Student ID with Names : " + ht2);
	}

	}


