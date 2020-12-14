class SnakeLadder
{
	public static void main(String args[])
	{
		int position=0,Count=0;
		while(position!=100)
		{
			int dieRoll=1+(int)Math.floor(Math.random()*10)%6;
			Count++;
			System.out.println("Die Rolled:"+dieRoll);
			int optionSelect=1+(int)Math.floor(Math.random()*10)%6;
			if(optionSelect==1)
			{
				System.out.println("**No Play**");
			}
			else if(optionSelect==2)
			{
				System.out.println("$$$$$Hurrah Ladder Comes$$$$");
				if(position+dieRoll<=100)
				{
					position+=dieRoll;
				}
				else if(position+dieRoll>100)
				{
					continue;
				}

			}
			else
			{
				System.out.println("####Opps Snake Comes####");
				if((position-dieRoll)<0)
				{
					position=0;
				}
				else
				{
					position-=dieRoll;
				}
			}
			System.out.println("Die roll count:"+Count);
			System.out.println("Position is:"+position);
			
		}
	}

}
