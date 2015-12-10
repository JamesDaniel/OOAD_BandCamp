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
public class SongInventoryTest {
    
    public SongInventoryTest() {
    }
    

    /**
     * Test of addSong method, of class SongInventory.
     */
    @Test
    public void testAddSong() {
        System.out.println("addSong");
        String title = "";
        Member member = null;
        Set<Genre> genre = null;
        SongInventory instance = new SongInventory();
        instance.addSong(title, member, genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSong method, of class SongInventory.
     */
    @Test
    public void testGetSong() {
        System.out.println("getSong");
        int id = 0;
        SongInventory instance = new SongInventory();
        Song expResult = null;
        Song result = instance.getSong(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchForSong method, of class SongInventory.
     */
    @Test
    public void testSearchForSong() {
        System.out.println("SearchForSong");
        String title = "";
        Genre genre = null;
        SongInventory instance = new SongInventory();
        Song expResult = null;
        Song result = instance.SearchForSong(title, genre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewId method, of class SongInventory.
     */
    @Test
    public void testGetNewId() {
        System.out.println("getNewId");
        SongInventory instance = new SongInventory();
        int expResult = 0;
        int result = instance.getNewId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
