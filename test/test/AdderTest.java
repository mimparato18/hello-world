/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

//import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.*;
import org.junit.*;


/**
 *
 * @author marku
 */
public class AdderTest {
    
    public AdderTest() {
        
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("aiutami signore");
        System.out.println("aiutami signore");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
/*
    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
*/
    /**
     * Test of add method, of class Adder.
     */
    @Test
    public void testAdd() {
        Adder a=new Adder();
        assertEquals(7, a.add(4,3));
        assertEquals(5, a.add(10,-5));
    }
    
}
