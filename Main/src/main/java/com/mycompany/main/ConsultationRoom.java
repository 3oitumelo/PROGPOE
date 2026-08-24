/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

class ConsultationRoom {
    
    private String roomNumber;
    private boolean Occupied;
    private String patientId;
    
    //constructor

    public ConsultationRoom(String roomNumber, boolean Occupied, String patientId) {
        this.roomNumber = roomNumber;
        this.Occupied = false;
        this.patientId = "";
    }
    
    //getter

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isOccupied() {
        return Occupied;
    }

    public String getPatientId() {
        return patientId;
    }

//allocate room to a patient
public void allocateRoom(String patientId){
    this.patientId = patientId;
    this.Occupied = true;
}    
public void releaseRoom(){
    this.patientId = "";
    this.Occupied = false;
}
//diplay room information
public void displayRoom(){
    
    if(occupied == true){
        
        System.out.println(roomNumber + " - OCCUPIED - Patient: " + patientId);
        
    }else{
        System.out.println(roomNumber + " - AVAILABLE");
    }
}
    
    
}
