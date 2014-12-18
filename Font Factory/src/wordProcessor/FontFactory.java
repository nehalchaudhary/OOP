package wordProcessor;

import java.util.ArrayList;
import java.awt.Font;

public class FontFactory
{
	private static final ArrayList<Font>fonts  = new ArrayList<Font>();
	
	public static Font getFont(String fontName,int fontStyle, int pointSize) 
	{
		Boolean containsFont = false;
		Font currentFont;
		int i;
		
		//Check if font is already present in the array
		for(i=0;i<fonts.size();i++)
		{
			if(fonts.get(i).getFamily().equals(fontName) && fonts.get(i).getSize() == pointSize && fonts.get(i).getStyle() == fontStyle)
			{	
				containsFont = true;
				break;
			}
		}
		
		//If not present then create a new font object else return the existing one
		if(!containsFont)
		{
			currentFont = new Font(fontName,fontStyle,pointSize);
			fonts.add(currentFont);
			return currentFont;
		}
		else
			return fonts.get(i); 	
	}
	
}
