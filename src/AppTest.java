import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 
 
public class AppTest { 
    @Test 
    void testSoma() { 
        int resultado = 2 + 3; 
        assertEquals(5, resultado); 
    } 
    @Test 
    void testMultiplicacao() { 
        int resultado = 2 * 3; 
        assertEquals(6, resultado); 
    } 
    @Test 
    void testSubtracao() { 
        int resultado = 5 - 3; 
        assertEquals(2, resultado); 
    } 
    @Test 
    void testDivisao() { 
        int resultado = 10 / 2; 
        assertEquals(5, resultado); 
    } 
    @Test 
    void testString() { 
        String texto = "JUnit"; 
        assertEquals("JUnit", texto); 
    } 
} 
