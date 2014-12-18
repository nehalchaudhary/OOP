package wordProcessor;

import java.awt.Font;
import java.util.HashMap;

public class RunArray {

	private static final HashMap<Integer,Font> runArray = new HashMap<Integer,Font>();
	
	public void addRun(int startIndex, int endIndex,Font font)
	{
		for(int i=startIndex;i<=endIndex;i++)
		{
			runArray.put(i, font);
		}
	}
	
	public void appendRun(int endIndex, Font font)
	{
		int startIndex = runArray.size();
		for(int i=startIndex;i<=endIndex;i++)
		{
			runArray.put(i, font);
		}
	}
	
	public Font getFont(int index)
	{
		return runArray.get(index);
	}
	
	 public static void main(String args[])
	 {
		 	System.out.printf("The size without flyweight is %.1f bytes%n", new SizeofUtil() {
			Character[] ch = null;
			Character ch4;
			Font[] f1;
			@Override
			protected int create() 
			{ 
				ch = new Character[326];
			    f1 = new Font[326];
			    for(int i=0 ;i<326; i++)
			    {
			    	ch[i] = new Character('a');
			    	f1[i] = new Font(Font.SANS_SERIF, Font.BOLD, 10);
			    } 
			    return 1;
			    }
			}.averageBytes());
		   
		 	System.out.printf("The size with flyweight is %.1f bytes%n", new SizeofUtil() {
		
			String data = new String("CS 635 Advanced Object-Oriented Design & Programming\nSpring Semester, 2014\nDoc 19 Facade & Mediator\nApril 24, 2014\nCopyright ©, All rights reserved. 2014 SDSU & Roger Whitney, 5500 \nCampanile Drive, San Diego, CA 92182-7700 USA. OpenContent (http://\nwww.opencontent.org/opl.shtml) license defines the copyright on this \ndocument.");
			Character[] ch1 = null;
			RunArray runArray;
		
			Font[] f1 =null;
			int i = 0;
			protected int create() 
			{
				f1 = new Font[3];
				ch1 =  new Character[326];
				runArray = new RunArray();
				f1[0] = FontFactory.getFont(Font.SANS_SERIF, Font.BOLD , 12);
				f1[1] = FontFactory.getFont(Font.MONOSPACED, Font.ITALIC , 10);
			    f1[2] = FontFactory.getFont(Font.SANS_SERIF, Font.BOLD , 12);
			    runArray.addRun(0, 20, f1[0]);
			    runArray.appendRun(30,f1[1]);	   
			    for(i=0;i<326;i++)
			    {
			    	ch1[i] = CharacterFactory.getCharacter(data.charAt(i));
			    }
			    return 1;
			}
		}.averageBytes()); 
	 }
}
