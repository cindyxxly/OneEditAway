
public class OneAway {
	int count = 0;
	
	public int same(String a, String b)
	{
		if (a.equals(b))
		{
			count = 0;
		}
		return count;
	}

	public int min (String a, String b)
	{
		if (a.length()<= b.length())
		{
			return a.length();
		}
		else
		{
			return b.length();
		}
	}
	
	
	public int insert(String a, String b)
	{
		int random = 0;
		char[] aline = a.toCharArray();
		char[] bline = b.toCharArray();
		for (int i = 0; i < a.length(); i++)
		{
			for (int z = 0; z<min(a, b); z++)
			{
				if (aline[i] == bline[z])
				{
					random++;
					System.out.println("random" + random);
				
				}
			}
		}
		if (random == b.length() || Math.abs(random-b.length())<=1)
		{
			count +=1;
		}
		else {
			count+= 5;
		}
		return count;
		
		
	}
	
	public int result()
	{
		return count;
	}
	
	public static void main(String[] args)
	{
		OneAway ow = new OneAway();
		String a = "bale";
		String b = "pale";
		ow.min(a, b);
		ow.insert(a, b);

		if (ow.result() == 0)
		{
			System.out.println("zero edit");
		}
		else if (ow.result() == 1)
		{
			System.out.println("One edit");
		}
		else
		{
			System.out.println("More than one edits");
		}
		
				
		
	}

}
