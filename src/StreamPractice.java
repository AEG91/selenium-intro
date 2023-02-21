import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPractice {
	public static void main(String[] args)
	{
		/*ArrayList<String> s= new ArrayList();
		s.add("Anusree");
		s.add("Deepu");
		s.add("Anu");
		s.add("Sree");
		s.add("Valsala");
		s.add("Aman");
		String n;
		int count=0;
		for(String name:s)
		{
			if(name.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		newStreamMethod();
		listMethod();*/
		learnMap();
		
	}
	
	public static void newStreamMethod()
	{
		ArrayList<String> name= new ArrayList();
		name.add("Anusree");
		name.add("Deepu");
		name.add("Anu");
		name.add("Sree");
		name.add("Valsala");
		name.add("Aman");
		long c=name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	}
	
	public static void listMethod()
	{
		List<Integer> numbers=Arrays.asList(1,2,4,6,8,54,67,12,34,5,2);
		numbers.stream().sorted().distinct().forEach(s->System.out.println(s));
		List<Integer> newList=numbers.stream().filter(s-> s<10).collect(Collectors.toList());
		System.out.println(newList);
		
	}
	
	public static void learnMap()
	{
		String[] array= {"Anusree","Deepu","Sreerag","Dhanya","Valsala","Padmanabhan"};
		List<String> lis=Arrays.asList(array);
		lis.stream().limit(5).map(s->s.toUpperCase()).filter(s->s.startsWith("V")).forEach(s->System.out.println(s));
	}

}
