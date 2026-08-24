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
public class PatientTest {
    
    public PatientTest() {
    }
    private Patient getInstance(){
        return new Patient("P001", "John", "Doe", 20, "Male", "Fever", PatientCategory.REGULAR);
    }
   

    /**
     * Test of getPatientId method, of class Patient.
     */
    @Test
    public void testGetPatientId() {
        System.out.println("getPatientId");
        Patient instance = getInstance();
        String expResult = "";
        String result = instance.getPatientId();
        assertEquals("P001", instance.getPatientId());
        
    }

    /**
     * Test of getFirstName method, of class Patient.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Patient instance = getInstance();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals("John", instance.getFirstName());
       
    }

    /**
     * Test of getLastName method, of class Patient.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Patient instance = getInstance();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals("Doe", instance.getLastName());
        
    }

    /**
     * Test of getAge method, of class Patient.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        Patient instance = getInstance();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(25, instance.getAge());
        
    }

    /**
     * Test of getGender method, of class Patient.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Patient instance = getInstance();
        String expResult = "";
        String result = instance.getGender();
        assertEquals(PatientCategory.REGULAR, instance.getpatientCategory());
        
    }

    /**
     * Test of getMedicalCondition method, of class Patient.
     */
    @Test
    public void testGetMedicalCondition() {
        System.out.println("getMedicalCondition");
        Patient instance = null;
        String expResult = "";
        String result = instance.getMedicalCondition();
        assertEquals("Fever", instance.getMedicalCondition());
      
    }

    /**
     * Test of getpatientCategory method, of class Patient.
     */
    @Test
    public void testGetpatientCategory() {
        System.out.println("getpatientCategory");
        Patient instance = getInstance();
        PatientCategory expResult = null;
        PatientCategory result = instance.getpatientCategory();
        assertEquals(PatientCategory.REGULAR, instance.getpatientCategory());
        
    }

    /**
     * Test of setPatientId method, of class Patient.
     */
    @Test
    public void testSetPatientId() {
        System.out.println("setPatientId");
        String patientId = "";
        Patient instance = null;
        instance.setPatientId(patientId);
      
    }

    /**
     * Test of setFirstName method, of class Patient.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Patient instance = getInstance();
        instance.setFirstName("Jane");
        assertEquals("Jane", instance.getFirstName());
        instance.setFirstName(firstName);
        
        
    }

    /**
     * Test of setLastName method, of class Patient.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Patient instance = null;
        instance.setLastName("Smith");
        assertEquals("Smith", instance.getLastName());
       
    }

    /**
     * Test of setAge method, of class Patient.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 30;
        Patient instance = getInstance();
        instance.setAge(30);
        assertEquals(30, instance.getAge());
        
    }

    /**
     * Test of setGender method, of class Patient.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        String gender = "";
        Patient instance = getInstance();
        instance.setGender("Female");
        assertEquals("Female", instance.getGender());
        
    }

    /**
     * Test of setMedicalCondition method, of class Patient.
     */
    @Test
    public void testSetMedicalCondition() {
        System.out.println("setMedicalCondition");
        String medicalCondition = "";
        Patient instance = getInstance();
        instance.setMedicalCondition("Cold");
        assertEquals("Cold", instance.getMedicalCondition());
       
    }

    /**
     * Test of setPatientCategory method, of class Patient.
     */
    @Test
    public void testSetPatientCategory() {
        System.out.println("setPatientCategory");
        PatientCategory patientCategory = null;
        Patient instance = null;
        instance.setPatientCategory(patientCategory);
        
    }

    /**
     * Test of displayPatient method, of class Patient.
     */
    @Test
    public void testDisplayPatient() {
        System.out.println("displayPatient");
        Patient instance = getInstance();
        instance.setPatientCategory(PatientCategory.EMERGENCY);
        instance.displayPatient();
        assertEquals(PatientCategory.EMERGENCY , instance.getpatientCategory());
        
    }
    
}
