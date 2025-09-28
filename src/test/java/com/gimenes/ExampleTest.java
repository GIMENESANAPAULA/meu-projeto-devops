package com.gimenes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void testSoma() {
        Example ex = new Example();
        assertEquals(5, ex.soma(2, 3));
    }
}
