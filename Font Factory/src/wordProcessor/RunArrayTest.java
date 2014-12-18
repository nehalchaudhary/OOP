package wordProcessor;

import static org.junit.Assert.*;

import java.awt.Font;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunArrayTest {
	
	RunArray runArray;
	Font f1;
	Font f2;
	
	public void setUp() throws Exception 
	{
		runArray = new RunArray();
		f1 = FontFactory.getFont(Font.SANS_SERIF, Font.BOLD , 12);
		f2 = FontFactory.getFont(Font.MONOSPACED, Font.BOLD , 12);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetFont() {
		runArray.addRun(0, 20, f1);
		runArray.appendRun(30,f2);
		Font f5 = runArray.getFont(12);
		assertEquals(f1, f5);
	}

}
