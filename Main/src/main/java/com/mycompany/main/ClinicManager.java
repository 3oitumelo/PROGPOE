/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;


class ClinicManager {
    private ArrayList<Patient> patients;
    private ConsultationRoom[][] rooms; 
    
    public ClinicManager(){
        patients = new ArrayList<>();
        
       rooms = new ConsultationRoom[4][5];
       createRooms();
       
    }
    
    //create rooms
    public void createRooms(){
        int roomNumber = 1;
        
        for(int row = 0; row < rooms.length; row++){
            for(int colomn = 0; colomn < rooms[row].length; colomn++){
                
                String roomName;
                if(roomNumber < 10){
                    roomName = "R0" + roomNumber;
                    
                }else{
                    roomName = "R" + roomNumber;
                    
                }
                rooms[row][colomn] = new ConsultationRoom(roomName);
                
                roomNumber++;
            }
        }
    }
    
    //register patient
    public void registerPatient(Patient patient){
        
        Patient existing = searchPatient(patient.getPatientId());
        if(existing != null){
            System.out.println("Patient ID already exists!");
            return;
        }
        patients.add(patient);
        
        System.out.println("Patient registered successfully. ");
    }
    //search patient
   for(int i = 0; i < patients.size(); i++){
    Patient patient = patients.get(i);
    
    if(patient.getPatientId().equals(patientId)){
    return patient;
    
}
    
}
   return null;
   
}
public void updatePatient(String patientId, String firstName, String lastName, int age, String gender, String medicalCondition){
    Patient patient = searchPatient(patientId);
    
    if(patient != null){
        
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setAge(age);
        patient.setGender(gender);
        patient.setMedicalCondition(medicalCondition);
        
        System.out.println("Patient updated successfully.");
        
    }else{
        System.out.println("Patient not found.");
    }
}

//delete patient
public void deletePatient(String patientId){
    Patient patient = searchPatient(patientId);
    
    if(patient != null){
        
        releaseRoomByPatientId(patientId);
        
        patient.remove(patient);
        
        System.out.println("Patient deleted sucessfully.");
        
    }else{
        System.out.println("Patient not found.");
    }
}
//display all patients
public void displayAllPatients(){
    
    if(patients.size() == 0){
        System.out.println("No patients registered.");
        
        return;
    }
    for(int i =0; i < patients.size(); i++){
        
        Patient patient = patients.get(i);
        
        patient.displayPatient();
    }
}
//sort patients by last name
public void sortPatientsByLastName(){
    
    //bubble sort
    for(int i = 0; i < patients.size() -1; i++){
        for(int j = 0; j < patients.size() - 1 - i; j++){
            
            Patient p1 = patients.gets(j);
            Patient p2 = patients.get(j + 1);
            
            if(p1.getLastName().compareTo(p2.getLastName()) > 0){
                patients.set(j, p2);
                patients.set(j + 1, p1);
                
            }
        }
    }
}
//sort patients by ID
public void sortPatientsById(){
    
    for(int i = 0; i < patients.size() - 1; i++){
        for(int j = 0; j < patients.size() - 1 - i; j++){
            
            Patient p1 = patients.get(j);
            Patient p2 = patients.get(j + 1);
            
            if(p1.getPatientId().compareTo(p2.getPatientId()) > 0){
                
                patients.set(j, p2);
                patients.set(j + 1, p1);
            }
        }
    }
    
}

//display sorted patients by last name
public void displaySortedPatients(){
    
    sortPatientsByLastName();
    
    System.out.println();
    System.out.println("PATIENTS SORTED BY LAST NAME");
    System.out.println(" ----------------------------------- ");
    
    displayAllPatients();
    
}

//diplay sorted patients by ID

public void displayPatientsById(){
    
    sortPatientsById();
    
    System.out.println();
    System.out.println("PATIENTS SORETD BY ID");
    System.out.println(" ------------------------------------ ");
    
    displayAllPatients();
}

//display room layout

public void displayRoomLayout(){
    System.out.println();
    System.out.println(" MEDICARE CLIINIC ROOM LAYOUT ");
    System.out.println(" ------------------------------------ ");
    
    for(int row = 0; row < rooms.length; row++){
        for(int colomn = 0; colomn < rooms[row].length; colomn++){
            
            ConsultationRoom room = rooms[row][colomn];
            
            if(room.isOccupied()){
                
                System.out.println("[" + room.getRoomNumber() + "OCCUPIED]");
                
            }else{
                System.out.println("[" + room.getRoomNumber() + "AVAILABLE]");
                
            }
        }
        System.out.println();
    }

}
//display availabel rooms
public void displayAvailableRooms(){
    System.out.println();
    System.out.println("AVAILABLE ROOMS");
    System.out.println(" -------------------------------------- ");
    
    boolean found = false;
    
    for(int row = 0; row < rooms.length; row++){
        for(int colomn = 0; colomn < rooms[row].length; colomn++){
            
            ConsultationRoom room = rooms[row][colomn];
            
            if(!room.isOccupied()){
                System.out.println(room.getRoomNumber());
                
                found = true;
            }
        }
    }
    if(!found){
        System.out.println("No available rooms.");
    }
}

//display occupies rooms

public void displayOccupiedRooms(){
    System.out.println();
    System.out.println("OCCUPIED ROOMS");
    System.out.println(" --------------------------------- ");
    
    boolean found = false;
    
    for(int row = 0; row < rooms.length; row++){
        for(int colomn = 0; colomn < rooms[row].length; colomn++){
            
            ConsultationRoom room = rooms[row][colomn];
            
            if(room.isOccupied()){
                
                room.displayRoom();
                
                found = true;
            }
        }
    }
    if(!found){
        System.out.println("No occupied rooms.");
    }
}

//allocate room
public void allocateRoom(String patientId){
    
    Patient patient = searchPatient(patientId);
    searchPatient(patientId);
    
    if(patient == null){
        
        System.out.println("Patient not found.");
        
        return;
    }
    if(patient.getCategory() != PatientCategory.REFERRAL){
        
        System.out.println("Only referral patients " + "can be allocated a room.");
        
        return;
    }
    for(int row = 0; row < rooms.length; row++){
        for(int colomn = 0; colomn < rooms[row].length; colomn++){
            
            ConsultationRoom room = rooms[row][colomn];
            
            if(!room.isOccupied()){
                
                room.allocateRoom(patientId);
                
                System.out.println("Room" + room.getRoomNumber() + "allocated to patient" + patientId);
                
                return;
            }
        }
    }
    System.out.println("No rooms available.");
}

//release room by room number
public void releaseRoom(String roomNumber){
    
    for(int row = 0; row < rooms.length; colomn++){
        
        ConsultationRoom room = rooms[row][colomn];
        
        if(room.getRoomNumber().equals(roomNumber)){
            if(room.isOccupied()){
                
                room.releaseRoom();
                
                System.out.println("Room released successfully.");
                
            }else{
                System.out.println("Room is already available.");
            }
            return;
        }
    }
    
}


