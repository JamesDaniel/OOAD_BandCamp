/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandcamp;

import java.util.Set;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SoftwareDev
 */
public class SongTest {
    
    public SongTest() {
    }
    

    /**
     * Test of compareTo method, of class Song.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Song otherSong = null;
        Song instance = null;
        int expResult = 0;
        int result = instance.compareTo(otherSong);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Song.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Song instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Song.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Song instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Song.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Song instance = null;
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Song.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Song instance = null;
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMember method, of class Song.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        Song instance = null;
        Member expResult = null;
        Member result = instance.getMember();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMember method, of class Song.
     */
    @Test
    public void testSetMember() {
        System.out.println("setMember");
        Member member = null;
        Song instance = null;
        instance.setMember(member);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class Song.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Song instance = null;
        Set<Genre> expResult = null;
        Set<Genre> result = instance.getGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenre method, of class Song.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        Set<Genre> genre = null;
        Song instance = null;
        instance.setGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
