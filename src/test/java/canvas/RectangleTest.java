/**
 * 
 */
package canvas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sringernature.model.DrawerService;
import com.sringernature.model.DrawerServiceImpl;

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
		DrawerService drawerServiceImpl = new DrawerServiceImpl();
		assertEquals(true, drawerServiceImpl instanceof DrawerService);
	}

}
