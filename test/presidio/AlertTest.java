
package presidio;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class AlertTest {
    
    public AlertTest() {
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
     * Test of getThreat method, of class Alert.
     */
    @Test
    public void testGetThreat() {
        System.out.println("getThreat");
        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
        String expResult = "Rescue Team";
        String result = instance.getThreat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setThreat method, of class Alert.
     */
    @Test
    public void testSetThreat() {
        System.out.println("setThreat");
        String threat = "Rescue Team";
        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
        instance.setThreat(threat);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getCivilianDetails method, of class Alert.
     */
    @Test
    public void testGetCivilianDetails() {
        System.out.println("getCivilianDetails");
        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
        String expResult = "Civilian Details";
        String result = instance.getCivilianDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setCivilianDetails method, of class Alert.
     */
    @Test
    public void testSetCivilianDetails() {
        System.out.println("setCivilianDetails");
        String civilianDetails = "Civilian";
        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
        instance.setCivilianDetails(civilianDetails);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLocation method, of class Alert.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Location test = new Location();
        Alert instance = new Alert("Rescue Team", "Civilian Details", test);
        Location expResult = test;
        Location result = instance.getLocation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLocation method, of class Alert.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        Location location = new Location();;
        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
        instance.setLocation(location);
        // TODO review the generated test code and remove the default call to fail.
    }

//    /**
//     * Test of getContactNumbers method, of class Alert.
//     */
//    @Test
//    public void testGetContactNumbers() {
//        System.out.println("getContactNumbers");
//        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
//        HashMap<String, String> expResult = null;
//        HashMap<String, String> result = instance.getContactNumbers();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//    }

    /**
     * Test of setContactNumbers method, of class Alert.
     */
    @Test
    public void testSetContactNumbers() {
        System.out.println("setContactNumbers");
        HashMap<String, String> contactNumbers = new HashMap();
        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
        instance.setContactNumbers(contactNumbers);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of determineContact method, of class Alert.
     */
    @Test
    public void testDetermineContact() {
        System.out.println("determineContact");
        Alert instance = new Alert("Rescue Team", "Civilian Details", new Location());
        String expResult = "+2222";
        String result = instance.determineContact();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
