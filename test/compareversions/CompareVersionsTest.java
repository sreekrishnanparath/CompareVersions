/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compareversions;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author sreek
 */
@RunWith(Parameterized.class)
public class CompareVersionsTest {
    private String version1;
    private String version2;
    private int expectedResult;
    
    CompareVersions compareVersions;
    
    public CompareVersionsTest(String version1, String version2, int expectedResult) {
        super();
        this.version1 = version1;
        this.version2 = version2;
        this.expectedResult = expectedResult;
    }
    
    
    @Before
    public void setUp() {
        compareVersions = new CompareVersions();
    }
    
    @After
    public void tearDown() {
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { "1", "1", 0 },
         { "0.1", "1.1", -1 },
         { "1.2", "1.2.9.9.9.9", -1 },
         { "1.3", "1.2.9.9.9.9", 1 },
         { "1.3", "1.3.4", -1 },
         {  "1.10","1.3.4", 1 }
      });
    }
   
    /**
     * Test of CompareUtil method, of class CompareVersions.
     */
    @Test
    public void testCompareUtil() {
        System.out.println("Comparision result is : "+ expectedResult);
        assertEquals(expectedResult, compareVersions.compareUtil(version1, version2));
    }
    
}
