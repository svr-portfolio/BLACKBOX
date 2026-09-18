/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

import java.util.ArrayList;

public class AccidentCase {

    private String caseId;
    private String date;
    private String location;
    private String description;

    private ArrayList<Vehicle> vehicles;
    private ArrayList<Evidence> evidenceList;
    private ArrayList<Event> events;

    public AccidentCase(String caseId, String date,
                         String location, String description) {

        this.caseId = caseId;
        this.date = date;
        this.location = location;
        this.description = description;

        vehicles = new ArrayList<>();
        evidenceList = new ArrayList<>();
        events = new ArrayList<>();
    }

    public String getCaseId() {
        return caseId;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public ArrayList<Evidence> getEvidenceList() {
        return evidenceList;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void addVehicle(Vehicle vehicle) {

        vehicles.add(vehicle);
    }

    public void addEvidence(Evidence evidence) {

        evidenceList.add(evidence);
    }

    public void addEvent(Event event) {

        events.add(event);
    }

    public void displayCase() {

        System.out.println("\n========== ACCIDENT CASE ==========");

        System.out.println("Case ID      : " + caseId);
        System.out.println("Date         : " + date);
        System.out.println("Location     : " + location);
        System.out.println("Description  : " + description);

        System.out.println("\nVehicles     : " + vehicles.size());
        System.out.println("Evidence     : " + evidenceList.size());
        System.out.println("Events       : " + events.size());

        System.out.println("===================================");
    }
}