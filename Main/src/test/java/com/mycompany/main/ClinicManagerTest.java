/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Malcolm
 */
public class ClinicManagerTest {
    
    public ClinicManagerTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    
    /**
     * Test of createRooms method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testCreateRooms() {
        System.out.println("createRooms");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
       
    }

    /**
     * Test of registerPatient method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testRegisterPatient() {
        System.out.println("registerPatient");
        Patient patient = new Patient("P001", "John", "Doe", 25, "Male", "Flu", PatientCategory.REGULAR);
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.registerPatient(patient);
        
    }

    /**
     * Test of searchPatient method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testSearchPatient() {
        System.out.println("searchPatient");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        Patient patient = new Patient("P002", "Jane", "Smith", 30, "Female", "Fracture", PatientCategory.REFERRAL);
        String patientId = "P002";
        Patient result = instance.searchPatient(patientId);
        assertNotNull(result);
        
    }

    /**
     * Test of updatePatient method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        ClinicManager instance = new ClinicManager();
        Patient patient = new Patient("P003", "Bob", "Lee", 40, "Male", "Cold", PatientCategory.REGULAR);
        instance.registerPatient(patient);
        String patientId = "P003";
        String firstName = "Booby";
        String lastName = "Lee";
        int age = 41;
        String gender = "Male";
        String medicalCondition = "Flu";
        instance.updatePatient(patientId, firstName, lastName, age, gender, medicalCondition);
      
    }

    /**
     * Test of deletePatient method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        Patient patient = new Patient("P004", "Ann", "Kim", 23, "Female", "Checkup", PatientCategory.REGULAR);
        String patientId = "P004";
        ClinicManager instance = new ClinicManager();
        instance.deletePatient(patientId);
        
    }

    /**
     * Test of displayAllPatients method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayAllPatients() {
        System.out.println("displayAllPatients");
        ClinicManager instance = new ClinicManager();
        instance.displayAllPatients();
        assertTrue(true);
       
    }

    /**
     * Test of sortPatientsByLastName method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testSortPatientsByLastName() {
        System.out.println("sortPatientsByLastName");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.registerPatient(new Patient("P005", " John", "Zebra", 26, "Male", "Flu", PatientCategory.REGULAR));
        instance.registerPatient(new Patient("P006", "Jane", "Long", 43, "Female", "Blocked nose", PatientCategory.REGULAR));
        instance.sortPatientsByLastName();
        assertEquals("Apple", instance.searchPatient("P006").getLastName());
        
    }

    /**
     * Test of sortPatientsById method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testSortPatientsById() {
        System.out.println("sortPatientsById");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.registerPatient(new Patient("P010", "John", "Doe", 36, "Male", "Flu", PatientCategory.REGULAR));
        instance.registerPatient(new Patient("P001", "Jane", "Smith", 26, "Female", "Cold", PatientCategory.REGULAR));
        instance.sortPatientsById();
        assertNotNull(instance);
        
    }

    /**
     * Test of displaySortedPatients method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testDisplaySortedPatients() {
        System.out.println("displaySortedPatients");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.displaySortedPatients();
        assertTrue(true);
       
    }

    /**
     * Test of displayPatientsById method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayPatientsById() {
        System.out.println("displayPatientsById");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.displayPatientsById();
        assertTrue(true);
       
    }

    /**
     * Test of displayRoomLayout method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayRoomLayout() {
        System.out.println("displayRoomLayout");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.displayRoomLayout();
        assertTrue(true);
    }

    /**
     * Test of displayAvailableRooms method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayAvailableRooms() {
        System.out.println("displayAvailableRooms");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.displayAvailableRooms();
        assertTrue(true);
                
        
    }

    /**
     * Test of displayOccupiedRooms method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testDisplayOccupiedRooms() {
        System.out.println("displayOccupiedRooms");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.displayOccupiedRooms();
        assertTrue(true);
        
    }

    /**
     * Test of allocateRoom method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testAllocateRoom() {
        System.out.println("allocateRoom");
        String patientId = "P005";
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        Patient p = new Patient("P005", "John", "Doe", 16,"Male", "Flu", PatientCategory.REGULAR);
        instance.registerPatient(p);
        instance.allocateRoom(patientId);
        
    }

    /**
     * Test of releaseRoom method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testReleaseRoom() {
        System.out.println("releaseRoom");
        String roomNumber = "1";
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.registerPatient(new Patient("P006", "Rose", "Green", 23, "Female", "Sore Throat", PatientCategory.REGULAR));
        instance.releaseRoom(roomNumber);
        assertTrue(true);
        
    }

    /**
     * Test of releaseRoomByPatientId method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testReleaseRoomByPatientId() {
        System.out.println("releaseRoomByPatientId");
        String patientId = "";
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        
        
    }

    /**
     * Test of getPatientRoom method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testGetPatientRoom() {
        System.out.println("getPatientRoom");
        String patientId = "";
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        instance.registerPatient(new Patient("P008", "Sara", "Gold", 28, "Female", "Female", PatientCategory.REGULAR));
        instance.getPatientRoom("P008");
        String expResult = "";
        String result = instance.getPatientRoom(patientId);
        assertEquals(expResult, result);
        
      
    }

    /**
     * Test of getTotalPatients method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testGetTotalPatients() {
        System.out.println("getTotalPatients");
        ClinicManager instance = new ClinicManager();
        instance.allocateRoom("P008");
        int expResult = 0;
        int result = instance.getTotalPatients();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getOccupiedRooms method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testGetOccupiedRooms() {
        System.out.println("getOccupiedRooms");
        ClinicManager instance = new ClinicManager(); 
        int expResult = 0;
        int result = instance.getOccupiedRooms();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getAvailableRooms method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testGetAvailableRooms() {
        System.out.println("getAvailableRooms");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        int results = instance.getAvailableRooms();
        int expResult = 0;
        assertTrue(results >= 0);
        int result = instance.getAvailableRooms();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getOccupanyPercentage method, of class ClinicManager.
     */
    @org.junit.jupiter.api.Test
    public void testGetOccupanyPercentage() {
        System.out.println("getOccupanyPercentage");
        ClinicManager instance = new ClinicManager();
        instance.createRooms();
        double expResult = 0.0;
        double result = instance.getOccupanyPercentage();
        assertEquals(0.0, result, 0.01);
        
    }
    
}
