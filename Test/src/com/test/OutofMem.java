package com.test;

public class OutofMem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String s="Hello how are you doing hope youare doing good.";
			String s1;
			for(int i=0;;i++)
			{
				s=s+"Hello how are you doing hope youare doing good.";
				s1=s+s+s+s+s+s;
				if(i/100==0)
				{
					System.out.println("i="+i+" size="+s.length());
					System.out.println("s="+s);
				}
			}
		}
		catch(Throwable th)
		{
			th.printStackTrace();
		}
		
		
	}

}
