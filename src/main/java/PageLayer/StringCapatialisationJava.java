package PageLayer;

public class StringCapatialisationJava
{

	public static void main(String[] args) {
		String[] abc= {"we","are","natural"};
		int a=abc.length;
		//System.out.println(a);
		
		for(int i=0;i<abc.length;i++)
		{
			String ff=abc[i].substring(0,1).toUpperCase()+abc[i].substring(1);
			System.out.print(ff);
		}

	}

}
