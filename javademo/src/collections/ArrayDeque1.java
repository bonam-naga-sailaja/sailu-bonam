package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDeque1
{

	public static void main(String[] args) 
	{
		Deque<Integer>de_que = new ArrayDeque<Integer>(10);
		de_que.add(10);
		de_que.add(20);
		de_que.add(30);
		de_que.add(40);
		de_que.add(50);

		
		for (Integer element : de_que)
		{
			
			System.out.println("Element : " + element);
		}

		
		de_que.clear();

	
		de_que.addFirst(564);
		de_que.addFirst(291);

		de_que.addLast(24);
		de_que.addLast(14);

	
		System.out.println("Above elements are deleted");

		
		System.out.println("Elements of deque using Iterator :");

		for (Iterator<Integer> itr = de_que.iterator();
			itr.hasNext();) 
		{
			System.out.println(itr.next());
		}

		System.out.println("Elements of deque in reverse order :");

		for (Iterator<Integer> dItr = de_que.descendingIterator();
			dItr.hasNext();)
		{
			System.out.println(dItr.next());
		}

		
}

}
