
package presidio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author malavikamathur
 */
public class GuideTest {
    
    public GuideTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTypeOfGuide method, of class Guide.
     */
    @Test
    public void testGetTypeOfGuide() {
        System.out.println("getTypeOfGuide");
        Guide instance = new Guide(0, "");
        int expResult = 0;
        int result = instance.getTypeOfGuide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setTypeOfGuide method, of class Guide.
     */
    @Test
    public void testSetTypeOfGuide() {
        System.out.println("setTypeOfGuide");
        int typeOfGuide = 1;
        Guide instance = new Guide(0, "");
        instance.setTypeOfGuide(typeOfGuide);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getContent method, of class Guide.
     */
    @Test
    public void testGetContent() {
        System.out.println("getContent");
        Guide instance = new Guide(0, "Content");
        String expResult = "Content";
        String result = instance.getContent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setContent method, of class Guide.
     */
    @Test
    public void testSetContent() {
        System.out.println("setContent");
        String content = "";
        Guide instance = new Guide(0, "insert content");
        instance.setContent(content);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findGuides method, of class Guide.
     */
    @Test
    public void testFindGuides() {
        System.out.println("findGuides");
        Guide instance = new Guide(0, "");
        instance.findGuides();
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
