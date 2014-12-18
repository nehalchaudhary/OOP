package wordProcessor;

import java.util.ArrayList;


public class CharacterFactory {
	
	private static final ArrayList<Character>characters  = new ArrayList<Character>();
	
	public static Character getCharacter(char newChar) 
	{
		Boolean containsCharacter = false;
		Character currentCharacter;
		int i;
		
		//Check if character is already present in the array
		for(i=0;i<characters.size();i++)
		{
			if(characters.get(i) == newChar)
			{	
				containsCharacter = true;
				break;
			}
		}
		
		//If not present then create a new character object else return the existing one
		if(!containsCharacter)
		{
			currentCharacter = new Character(newChar);
			characters.add(currentCharacter);
			containsCharacter = true;
			return currentCharacter;
		}
		else
			return characters.get(i); 	
	}
	
}
