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
public class MemberInventoryTest {
    
    public MemberInventoryTest() {
    }
    
    @Test
    public void testAddMember() {
        System.out.println("addMember");
        String name = "";
        MemberInventory instance = new MemberInventory();
        instance.addMember(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMember method, of class MemberInventory.
     */
    @Test
    public void testGetMember() {
        System.out.println("getMember");
        int id = 0;
        MemberInventory instance = new MemberInventory();
        Member expResult = null;
        Member result = instance.getMember(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SearchForMember method, of class MemberInventory.
     */
    @Test
    public void testSearchForMember() {
        System.out.println("SearchForMember");
        String name = "";
        MemberInventory instance = new MemberInventory();
        Member expResult = null;
        Member result = instance.SearchForMember(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewId method, of class MemberInventory.
     */
    @Test
    public void testGetNewId() {
        System.out.println("getNewId");
        MemberInventory instance = new MemberInventory();
        int expResult = 0;
        int result = instance.getNewId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
