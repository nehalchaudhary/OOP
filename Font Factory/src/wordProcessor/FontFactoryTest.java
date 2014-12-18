package wordProcessor;

import static org.junit.Assert.*;

import java.awt.Font;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FontFactoryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetFont() {
		 Font f1 = FontFactory.getFont(Font.SANS_SERIF, Font.BOLD , 12);
		 Font f2 = FontFactory.getFont(Font.MONOSPACED, Font.BOLD , 12);
		 Font f3 = FontFactory.getFont(Font.SANS_SERIF, Font.BOLD , 12);
		 Font f4 = FontFactory.getFont(Font.MONOSPACED, Font.BOLD , 12);
	}

}
