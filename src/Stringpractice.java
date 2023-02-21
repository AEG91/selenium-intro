import dev.failsafe.internal.util.Assert;


public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Anusree Eswarath Ganapathiyadan";
		
		String[] as=s.split(" ");
		for (int i=0;i<as.length;i++)
		{
			System.out.println(as[i]);
			for (int j=as[i].length()-1;j>=0;j--)
			{
			System.out.println(as[i].charAt(j));
			}
		}
	
		
		

	}

}
