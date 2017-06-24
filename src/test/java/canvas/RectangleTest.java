/**
 * 
 */
package canvas;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sringernature.Canvas;

/**
 * @author admin
 *
 */
public class RectangleTest {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testInstance(){
		int x = 100;
		int y = 50;
		Canvas rectangle = new Canvas(x,y);
		assertEquals(true, rectangle instanceof Canvas);
	}

}
