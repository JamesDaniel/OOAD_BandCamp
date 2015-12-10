/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandcamp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SoftwareDev
 */
public class GenreTest {
    
    public GenreTest() {
    }

    /**
     * Test of values method, of class Genre.
     */
    @Test
    public void testValues() {
        System.out.println("values");
        Genre[] expResult = {Genre.ROCK,Genre.POP,
                             Genre.BLUES,Genre.CLASSICAL,
                             Genre.PUNK,Genre.JAZZ,
                             Genre.COUNTRY,Genre.RNB};
        
        Genre[] result = Genre.values();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of valueOf method, of class Genre.
     */
    @Test
    public void testValueOf() {
        System.out.println("valueOf");
        
        Genre expResult = Genre.ROCK;
        Genre result = Genre.valueOf("ROCK");
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Genre.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Genre instance = Genre.POP;
        String expResult = "Pop";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
