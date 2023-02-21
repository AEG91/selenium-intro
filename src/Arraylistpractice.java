import java.util.ArrayList;

public class Arraylistpractice {
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<String>list1=new ArrayList<String>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list1.add("Anusree");
		list1.add("Selenium");
		list1.add("Java");
		list1.add("Study");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		for (String a :list1)
		{
			
			if(a.contains("Selenium"))
			{
				System.out.println(a);
			}
			
		}
				
		
	}

}
