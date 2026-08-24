/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Malcolm
 */
public class ConsultationRoomTest {
    
    public ConsultationRoomTest() {
    }
    
   

    /**
     * Test of getRoomNumber method, of class ConsultationRoom.
     */
    @Test
    public void testGetRoomNumber() {
        System.out.println("getRoomNumber");
        ConsultationRoom instance = new ConsultationRoom("1", false, "");
        String expResult = "";
        String result = instance.getRoomNumber();
        assertEquals("1", result);
       
    }

    /**
     * Test of isOccupied method, of class ConsultationRoom.
     */
    @Test
    public void testIsOccupied() {
        System.out.println("isOccupied");
        ConsultationRoom instance = new ConsultationRoom("1", false, "");
        boolean expResult = false;
        boolean result = instance.isOccupied();
        assertEquals(false, result);
        ConsultationRoom occupied = new ConsultationRoom("1", true, "P001");
        assertEquals(true, occupied.isOccupied());
        
    }

    /**
     * Test of getPatientId method, of class ConsultationRoom.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        ConsultationRoom instance = new ConsultationRoom("1", false, "");
        String expResult = "";
        String result = instance.getPatientId();
        assertEquals("", result);
        
    }

    /**
     * Test of allocateRoom method, of class ConsultationRoom.
     */
    @Test
    public void testAllocateRoom() {
        System.out.println("allocateRoom");
        String patientId = "";
        ConsultationRoom instance = new ConsultationRoom("1", false, "");
        instance.allocateRoom("P001");
        assertEquals("P001", instance.getPatientId());
        instance.allocateRoom(patientId);
        assertTrue(instance.isOccupied());
        
    }

    /**
     * Test of releaseRoom method, of class ConsultationRoom.
     */
    @Test
    public void testReleaseRoom() {
        System.out.println("releaseRoom");
        ConsultationRoom instance = new ConsultationRoom("1", true, "P001");
        instance.releaseRoom();
        assertFalse(instance.isOccupied());
       
    }

    /**
     * Test of displayRoom method, of class ConsultationRoom.
     */
    @Test
    public void testDisplayRoom() {
        System.out.println("displayRoom");
        ConsultationRoom instance = new ConsultationRoom("1", false, "");
        instance.displayRoom();
        assertTrue(true);
        
    }
    
}
