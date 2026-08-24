/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ClinicManager clinic = new ClinicManager();
        ReferralPatient patient = new ReferralPatient();
        
        
        int choice = 0;
        
        //display menu
        while(choice != 13){
            
            System.out.println();
            System.out.println("==============================");
            System.out.println(" MEDICARE CLINIC SYSTEM ");
            System.out.println("==============================");
            
            System.out.println("1. Register Patient");
            System.out.println("2. Search Patient");
            System.out.println("3. Update Patient");
            System.out.println("4. Delete Patient");
            System.out.println("5. Display All Patients");
            System.out.println("6. Sort Patients");
            System.out.println("7. Allocate Consultation Room");
            System.out.println("8. Release Consultation Room");
            System.out.println("9. Display Room Layout");
            System.out.println("10. Display Available Rooms");
            System.out.println("11. Display Occupied Rooms");
            System.out.println("12. Display Reports");
            System.out.println("13. Exit");
            
            //ask for user input
            System.out.println("Please enter your choice: ");
            
            try{
             choice = input.nextInt();
             
             input.nextLine();
             
             if(choice == 1) {
                 registerPatient(input, clinic);
             }else if (choice == 2){
                 searchPatient(input, clinic);
             }else if (choice == 3){
                 updatePatient(input, clinic);
             }else if (choice == 4){
                 deletePatient(inout, clinic);
             }else if(choice == 5){
                 clinic.displayAllPatient()
             }else if(choice == 6){
                 displaySortMenu()
             }else if(choice == 7){
                 allocateRoom(input, clinic);
             }else if (choice == 8){
                 releaseRoom(input, clinic);
             }else if (choice == 9){
                 clinic.displayRoomLayout();
             }else if (choice == 10){
                 clinic.displayAvailableRooms();
             }else if (choice == 11){
                 clinic.displayOccupiedRooms();
             }else if (choice == 12){
                 displayReports(clinic);
             }else if (choice == 13){
                 System.out.println("Thank you for using" + "Medicare Clinic");
                 
             }else {
                 System.out.println("Invalid menu option.");
             }
             
            }catch (Exception e){
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }
        }
        input.close();
        
    }
    //display sort menu
    public static void displaySortMenu(Scanner input, ClinicManager clinic){
        System.out.println();
        System.out.println("SORT PATIENTS BY: ");
        System.out.println("1. Last Name: ");
        System.out.println("2. Patient ID: ");
        
        System.out.println("Please enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        
        if(choice == 1){
            clinic.displaySortedPatients();
        }else if (choice == 2){
            clinic.displayPatientsById();
        }else {
            System.out.println("Invalid choice.");
        }
    }
    
    //register patient 
    public static void registerPatient(Scanner input, ClincManager clinic){
        System.out.println();
        System.out.println("REGISTER PATIENT");
        System.out.println(" ------------------- ");
        
        //fetch patient identification
        System.out.println("Patient ID: ");
        String id = input.nextLine();
        
        //fetch first name
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        
        //fetch surname
        System.out.println("Last Name: ");
        Striing lastName = input.nextLine();
        
        //fetch age
        System.out.println("Age: ");
        int age = input.nextInt();
        
        input.nextLine();
        
        //fetch gender
        System.out.println("Gender: ");
        String gender = input.nextLine();
        
        //fetch medical condition
        System.out.println("Medical Condition: ");
        String medicalCondition = input.nextLine();
        
        //display patient categories
        System.out.println();
        System.out.println("Patient Category");
        System.out.println("1. Regular");
        System.out.println("2. Referral");
        System.out.println("3. Emergency");
        
        //ask for user selection
        System.out.println("Choose category: ");
        int categoryChoice = input.nextInt();
        
        input.nextLine();
        
        //variable to store the categories
        PatientCategory category;
        
        if(categoryChoice == 1){
            category = PatientCategory.REGULAR;
            
        }else if(categoryChoice == 2){
            category = PatientCategory.REFERRAL;
            
        }else if(categoryChoice == 3){
            category = PatientCategory.EMERGENCY;
            
        }
        //create a patient variable
        Patient patient;
        
        if(category == PatientCategory.REFERRAL){
            
            System.out.println("Referring Doctor: ");
            String referringDoctor = input.nextLine();
            
            System.out.println("Referring Hospital: ");
            String referringHospital = input.nextLine();
            
            System.out.println("Referral Date (YYYY-MM-DD): ");
            String referralDate = input.nextLine();
            
            //create referral object
            patient = new ReferralPatient(id, firstName, lastName, age, gender, condition, referringDoctore, referringHospital, referralDate);
            
        }else {
            
            //create normal patient object
            patient = new Patient(id, firstName, lastName, age, gender, condition, category);
            
        }
        clinic.registerPatient(patient);
        
        if(category == PatietCategory.REFERRAL){
            clinic.allocateRoom(id);
        }
    }
    public static void searchPatient(Scanner input, ClinicManager clinic){
        System.out.println("Please Enter Patient ID: ");
        String id = input.nextLine();
        
        Patient patient = clinic.searchPatient(id);
        
        if(patient != null){
            
            patient.displayPatient();
            
            String room = clinic.getPatientRoom(id);
            if(room != null){
                System.out.println("Allocated Room: " + room);
            }
        }else {
            System.out.println("Patient not found.");
        }
    }
    //update patient
    public static void updatePatient(Scanner input, ClinicManager clinic){
        
        System.out.println("Enter Patient ID: ");
        string id = input.nextLine();
        
        if(patient != null){
            
            System.out.println("Enter new first name: ");
            String firstName = input.nextLine();
            
            System.out.println("Enter new last name: ");
            String lastName = input.nextLine();
            
            System.out.println("Enter new age: ");
            int age = input.nextInt();
            
            System.out.println("Enter new gender: ");
            String gender = input.nextLine();
            
            System.out.println("Enter new medical condition: ");
            String condition = input.nextLine();
            
            //update patient information
            clinic.updatePatient(id, firstName, lastName, age, gender, condition);
            
        }else{ 
            System.out.println("Patient not found. ");
        }
    }
    //delete patient
    public static void deletePatient(Scanner input, ClinicManager clinic){
        
        System.out.println("Enter Patient ID: ");
        String id = input.nextLine();
        
        //delete patient
        clinic.deletePatient(id);
        
    }
    
    //allocate room
    public static void allocateRoom(Scanner input, ClinicManager clinic){
        System.out.println("Enter Referral Patient ID: ");
        String patientId = input.nextLine();
        
        //allocate room
        clinic.allocateRoom(PatientId);
    }
    
    //release room
    public static void releaseRoom(Scanner input, ClinicManager clinic){
        
        System.out.println();
        System.out.println("1. Release by Room Number");
        System.out.println("2. Release by Patient ID");
        
        //prompt for user input
        System.out.println("Enter your choice: ");
        int choice = input.nextInt();
        input.nextLine();
        
        if(choice == 1){
            //ask for room number
            System.out.println("Enter Room Number: ");
            String roomNumber = input.nextLine();
            
            clinic.releaseRoom(roomNumber);
            
        }else if(choice == 2){
            System.out.println("Enter Patient ID: ");
            String patientId = input.nextLine();
            
            clinic.releaseRoomByPatientId(patientId);
            
        }else{
            System.out.println("Invalid choice.");
        }
    }
    
    //reports
    public static void displayReports(ClinicManager clinic){
        
        System.out.println();
        System.out.println(" ================================ ");
        System.out.println(" MEDICARE CLINIC REPORT ");
        System.out.println(" ================================ ");
        
        //display total patients
        System.out.println("Total Registered Patients: " + clinic.getTotalPatients());
        
        //display occupied rooms
        System.out.println("Total Occupied Rooms: " + clinic.getOccupiedRooms());
        
        //display available rooms
        System.out.println("Total Avaibale Rooms: " + clinic.getAvaibleRooms());
        
        //display occupancy percentage
        System.out.println("Clinc Occupancy: " + String.format("%.1f", clinic.getOccupancyPercenatage()) + "%");
    }
}
