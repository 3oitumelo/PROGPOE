/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;


public class ReferralPatient extends Patient {
    
    private String referringDoctor;
    private String referringHospital;
    private String referralDate;
    
    //constructor

    public ReferralPatient(String patientId, String firstName, String lastName, int age, String gender, String medicalCondition, PatientCategory patientCategory,String referringDoctor, String referringHospital, String referralDate) {
        super(patientId, firstName, lastName, age, gender, medicalCondition, patientCategory);
        this.referringDoctor = referringDoctor;
        this.referringHospital = referringHospital;
        this.referralDate = referralDate;
    }
      //getters
        public String getReferringDoctor() {
            return referringDoctor;
        }

        public String getReferringHospital() {
            return referringHospital;
        }

        public String getReferralDate() {
            return referralDate;
        }

        public PatientCategory getPatientCategory() {
            return patientCategory;
        }

    //setters

        public void setReferringDoctor(String referringDoctor) {
            this.referringDoctor = referringDoctor;
        }

        public void setReferringHospital(String referringHospital) {
            this.referringHospital = referringHospital;
        }

        public void setReferralDate(String referralDate) {
            this.referralDate = referralDate;
        }

        public void setPatientCategory(PatientCategory patientCategory) {
            this.patientCategory = patientCategory;
        }
        
        
    
@Override
public void displayPatient(){
    
    System.out.println(" ----------------------------------- ");
    System.out.println("REFERRAL PATIENT INFORMATION");
    System.out.println(" ----------------------------------- ");
    
    //fetch information for the parent class
    System.out.println("Patient ID: " + getPatientId());
    System.out.println("First Name: " + getFirstName());
    System.out.println("Last Name: " + getLastName());
    System.out.println("Age: " + getAge());
    System.out.println("Gender: " + getGender());
    System.out.println("Medical Condition: " + getMedicalCondition());
    System.out.println("Category: " + getpatientCategory());
    
    //dsiplay referral for specific information
    System.out.println("Referring Doctor: " + referringDoctor);
    System.out.println("Referring Hospital: " + referringHospital);
    System.out.println("Referral Date: " + referralDate);
    
    System.out.println(" ------------------------------------------- ");
}
        
    }
    
    

