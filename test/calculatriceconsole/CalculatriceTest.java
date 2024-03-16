/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculatriceconsole;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Ramalho(EMF - Fribourg)
 */
public class CalculatriceTest {

    public CalculatriceTest() {
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
     * Test of additionne method, of class Calculatrice.
     */
    @Test
    public void testAdditionne_int_int() {
        System.out.println("testAdditionne_int_int");
        Calculatrice instance = new Calculatrice();

        int result;

        // TEST     nb1      nb2            RESULT
        // ====================================================
        // 1        0        0              0
        // 2        0        -1             -1
        // 3        0        1              1
        // 4        1        2147483647     ArithmeticException
        // 5        -1        -2147483648   ArithmeticException
        // ====================================================
        // 6        12          12          24
        // 7        340         10          350
        // ====================================================
        // 1        0        0              0
        System.out.println("TEST 1        0        0");
        result = instance.additionne(0, 0);
        assertEquals(0, result);
        System.out.println("TEST 1 > OK");

        // 2        0        -1             -1
        System.out.println("TEST 2        0        -1");
        result = instance.additionne(0, -1);
        assertEquals(-1, result);
        System.out.println("TEST 2 > OK");

        // 3        0        1              1
        System.out.println("TEST 3        0        1");
        result = instance.additionne(0, 1);
        assertEquals(1, result);
        System.out.println("TEST 3 > OK");

        // 4        1        2147483647     ArithmeticException
        System.out.println("TEST 4      1        2147483647   ArithmeticException");
        assertThrows(ArithmeticException.class, () -> {
            instance.additionne(1, 2147483647);
        });
        System.out.println("TEST 4 > OK");

        // 5        -1        -2147483648   ArithmeticException
        System.out.println("TEST 5      -1        -2147483648        ArithmeticException");
        assertThrows(ArithmeticException.class, () -> {
            instance.additionne(-1, -2147483648);
        });
        System.out.println("TEST 5 > OK");

        // 6        -1        -2147483648   ArithmeticException
        System.out.println("TEST 6      -1        -2147483648        ArithmeticException");
        assertThrows(ArithmeticException.class, () -> {
            instance.additionne(-1, -2147483648);
        });
        System.out.println("TEST 6 > OK");

        // 7        12          12          24
        System.out.println("TEST 7        12          12          24");
        result = instance.additionne(12, 12);
        assertEquals(24, result);
        System.out.println("TEST 7 > OK");

        // 8        340         10          350
        System.out.println("TEST 8        350         10          340");
        result = instance.additionne(10, 340);
        assertEquals(350, result);
        System.out.println("TEST 8 > OK");

        System.out.println("testAdditionne_int_int > OK");
    }

    /**
     * Test of additionne method, of class Calculatrice.
     */
    @Test
    public void testAdditionne_String_String() {
        System.out.println("testAdditionne_String_String");
        Calculatrice instance = new Calculatrice();

        String result;

        // TEST     nb1      nb2            RESULT
        // ====================================================
        // 1        null     null           "impossible car les nombres ne sont pas convertibles"
        // 2        null     ""             "impossible car les nombres ne sont pas convertibles"
        // 3        null     "12"           "impossible car les nombres ne sont pas convertibles"
        // 4        ""       null           "impossible car les nombres ne sont pas convertibles"
        // 5        ""       ""             "impossible car les nombres ne sont pas convertibles"  
        // 6        ""       "12"           "impossible car les nombres ne sont pas convertibles"
        // 7        "12"     null           "impossible car les nombres ne sont pas convertibles"
        // 8        "12"     ""             "impossible car les nombres ne sont pas convertibles"  
        // 9        "12"     "12"           "24"
        // 10       "1"      "2147483647"   "impossible car les nombres spécifiés produisent une somme trop grande"
        // 11       "-1"     "-2147483648"  "impossible car les nombres spécifiés produisent une somme trop grande"
        // ====================================================
        // 12        "340"    "10"           "350"
        // ====================================================
        // 1        null     null           "impossible car les nombres ne sont pas convertibles"
        System.out.println("TEST 1        null     null           \"impossible car les nombres ne sont pas convertibles\"");
        result = instance.additionne(null, null);
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 1 > OK");

        // 2        null     ""             "impossible car les nombres ne sont pas convertibles"
        System.out.println("TEST 2        null     \"\"             \"impossible car les nombres ne sont pas convertibles\"");
        result = instance.additionne(null, "");
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 2 > OK");

        // 3        null     "12"           "impossible car les nombres ne sont pas convertibles"
        System.out.println("TEST 3        null     \"12\"           \"impossible car les nombres ne sont pas convertibles\"");
        result = instance.additionne(null, "12");
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 3 > OK");

        // 4        ""       null           "impossible car les nombres ne sont pas convertibles"
        System.out.println("TEST 4        \"\"       null           \"impossible car les nombres ne sont pas convertibles\"");
        result = instance.additionne("", null);
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 4 > OK");

        // 5        ""       ""             "impossible car les nombres ne sont pas convertibles"  
        System.out.println("TEST 5        \"\"       \"\"             \"impossible car les nombres ne sont pas convertibles\"  ");
        result = instance.additionne("", "");
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 5 > OK");

        // 6        ""       "12"           "impossible car les nombres ne sont pas convertibles"
        System.out.println("TEST 6        \"\"       \"12\"           \"impossible car les nombres ne sont pas convertibles\"");
        result = instance.additionne("", "12");
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 6 > OK");

        // 7        "12"     null           "impossible car les nombres ne sont pas convertibles"
        System.out.println("TEST 7        \"12\"     null           \"impossible car les nombres ne sont pas convertibles\"");
        result = instance.additionne("12", null);
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 7 > OK");

        // 8        "12"     ""             "impossible car les nombres ne sont pas convertibles"  
        System.out.println("TEST 8        \"12\"     \"\"             \"impossible car les nombres ne sont pas convertibles\"");
        result = instance.additionne("12", "");
        assertEquals("impossible car les nombres ne sont pas convertibles", result);
        System.out.println("TEST 8 > OK");

        // 9        "12"     "12"           "24"
        System.out.println("TEST 9        \"12\"     \"12\"           \"24\"");
        result = instance.additionne("12", "12");
        assertEquals("24", result);
        System.out.println("TEST 9 > OK");

        // 10       "1"      "2147483647"   "impossible car les nombres spécifiés produisent une somme trop grande"
        System.out.println("TEST 10       \"1\"      \"2147483647\"   \"impossible car les nombres spécifiés produisent une somme trop grande\"");
        result = instance.additionne("1", "2147483647");
        assertEquals("impossible car les nombres spécifiés produisent une somme trop grande", result);
        System.out.println("TEST 10 > OK");

        // 11       "-1"     "-2147483648"  "impossible car les nombres spécifiés produisent une somme trop grande"
        System.out.println("TEST 11       \"-1\"     \"-2147483648\"  \"impossible car les nombres spécifiés produisent une somme trop grande\"");
        result = instance.additionne("-1", "-2147483648");
        assertEquals("impossible car les nombres spécifiés produisent une somme trop grande", result);
        System.out.println("TEST 11 > OK");

        // 12        "340"    "10"           "350"
        System.out.println("TEST 12        \"340\"    \"10\"           \"350\"");
        result = instance.additionne("340", "10");
        assertEquals("350", result);
        System.out.println("TEST 12 > OK");

        System.out.println("testAdditionne_String_String > OK");
    }

    /**
     * Test of divise method, of class Calculatrice.
     */
    @Test
    public void testDivise() {
        System.out.println("testDivise");
        Calculatrice instance = new Calculatrice();

        double result;

        // TEST     nb1      nb2            RESULT
        // ====================================================
        // 1        0        0              Double.NaN
        // 2        123      -1             -123
        // 3        123      12             10
        // 4        -123     12             -10
        // 5        -123     -12            10
        // ====================================================
        // 1        0        0              Double.NaN
        System.out.println("TEST 1        0        0              Double.NaN");
        result = instance.divise(0, 0);
        assertEquals(Double.NaN, result,0.01);
        System.out.println("TEST 1 > OK");

        // 2        123      -1             -123
        System.out.println("TEST 2        123      -1             -123");
        result = instance.divise(123, -1);
        assertEquals(-123.0, result,0.01);
        System.out.println("TEST 2 > OK");

        // 3        123      12             10.25
        System.out.println("TEST 3        123      12             10");
        result = instance.divise(123, 12);
        assertEquals(10, result,0.01);
        System.out.println("TEST 3 > OK");

         // 4        -123     12             -10.25
        System.out.println("TEST 4        -123     12             -10");
        result = instance.divise(-123, 12);
        assertEquals(-10, result,0.01);
        System.out.println("TEST 4 > OK");

        // 5        -123     -12            10.25
        System.out.println("TEST 5        -123     -12            10");
        result = instance.divise(-123, -12);
        assertEquals(10, result,0.01);
        System.out.println("TEST 5 > OK");
        
        System.out.println("testDivise > OK");
    }



}
