package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    void testsum() {

        assertEquals(8, AverageMethod.sum(4, 2, 2));
    }

    @Test
    void testdivide() {
        assertNotNull(DivideMethod.divide(6, 2));
    }

    @Test

    void testboolean() {
        assertTrue(MethodReturnType.returnBoolean());
    }

    @Test
    void testSame() {

        assertSame("String of text", MethodReturnType.returnString());
    }

    @Test
    void testNotSame() {
        Animal moti = new Animal("Rocky",false);
        assertNotSame("Moti", moti.getName());
    }

}
