/**
 * 
 */
package mvnjenghubproj1;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.mvnjenghubproj1.HelloWorld.HelloWorld;

/**
 * @author sanja
 *
 */
public class TestHelloWorld {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * Test method for {@link com.mvnjenghubproj1.HelloWorld.HelloWorld#greetings()}.
	 */
	@Test
	public void testGreetings() {
		//fail("Not yet implemented"); // TODO
		HelloWorld hw = new HelloWorld();
		String greet1="Hello World!!";
		String greet = hw.greetings();
		System.out.println ("returned message:" + greet);
		assertEquals("Hello World!!", greet1);
		
	}

}
