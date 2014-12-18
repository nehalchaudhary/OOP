package wordProcessor;

import junit.framework.TestCase;

public class CharacterFactoryTest extends TestCase {
	
	Character c1,c2,c3;
	
	protected void setUp() throws Exception {
	
	}

	protected void tearDown() throws Exception {
	}

	public final void testGetCharacter() 
	{
		c1 = CharacterFactory.getCharacter('a');
		c2 = CharacterFactory.getCharacter('b');
		c3 = CharacterFactory.getCharacter('a');
	}

}
