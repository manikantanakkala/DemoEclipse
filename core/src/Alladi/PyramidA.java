package Alladi;

public class PyramidA 
{
	private int PrLen;
	private char PrBrc;
	private int Spl;
	private int Spr;
	
	public void draw()
	{
		
	}
	
	
	
	
	
	
	public void setPrLen(int PrLen)
	{
		this.PrLen=PrLen;
	}

	public void setPrBrc(char PrBrc)
	{
		this.PrBrc=PrBrc;
	}
	public void setSpl(int Spl)
	{
		this.Spl=Spl;
	}
	public void setSpr(int Spr)
	{
		this.Spr=Spr;
	}
	
	public int getPrLen()
	{
		return PrLen;
	}
	public int getPrBrc()
	{
		return PrBrc;
	}
	public int getSpl()
	{
		return Spl;
	}
	public int getSpr()
	{
		return Spr;
	}
	
	
	
	
	public void drawPyramid()
	{
		for(int i=0;i<Spr;i++)
		{
			System.out.println();
		}
		for(int i=0;i<PrLen;i++)
		{			
			for(int j=0;j<PrLen+Spl-i-1;j++)
					
			{
				
				System.out.print(" ");				
			}	
			
			for(int j=0;j<(2*i)-1;j++)
			{
				System.out.print(PrBrc);
			}
     		System.out.println("\n");
		}
		
	
	
	
	
	int k=0,n=PrLen;
	for(int i=0;i<Spr;i++)
	{
		System.out.println();
	}
	for(int i=1;i<=PrLen;i++)
	{
		for(int j=0;j<=Spl+i;j++,k=0)
		{
			System.out.print(" ");
		}
		while(k!=(2*n)-1)
		{
			System.out.print(PrBrc);
			k++;
		}
		n--;
		System.out.println();
		
	}
	
	
	
//	for(int i=0;i<Spl;i++)
//	{
//		System.out.println();
//	}
//	for(int i=1;i<=PrLen;i++)
//	{
//		for(int j=0;j<=Spl;j++,k=0)
//		{
//			System.out.print(" ");
//		}
//		while(k!=(2*i)-1)
//		{
//			System.out.print(PrBrc);
//			k++;
//		}
//		
//		n--;
//		System.out.println();
//		
//	}

	
	
	
	
	
	
}
}
