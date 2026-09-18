/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackbox;

import java.util.Scanner;

public class BLACKBOX {

    static Scanner sc = new Scanner(System.in);

    static AccidentCase accidentCase;

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("                 BLACKBOX");
        System.out.println("        Accident Reconstruction Engine");
        System.out.println("==========================================");

        boolean running = true;

        while (running) {

            showMenu();

            System.out.print("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {

                case "1":
                    createCase();
                    break;

                case "2":
                    addVehicle();
                    break;

                case "3":
                    addEvidence();
                    break;

                case "4":
                    addEvent();
                    break;

                case "5":
                    viewCase();
                    break;

                case "6":
                    performAnalysis();
                    break;

                case "7":
                    generateReport();
                    break;

                case "8":
                    running = false;

                    System.out.println(
                            "\nThank you for using BLACKBOX."
                    );

                    System.out.println(
                            "Program closed successfully."
                    );

                    break;

                default:
                    System.out.println(
                            "\nInvalid choice. Please enter 1 to 8."
                    );
            }
        }

        sc.close();
    }

    // ------------------------------------------
    // MAIN MENU
    // ------------------------------------------

    public static void showMenu() {

        System.out.println("\n------------ MAIN MENU ------------");

        System.out.println("1. Create Accident Case");
        System.out.println("2. Add Vehicle");
        System.out.println("3. Add Evidence");
        System.out.println("4. Add Timeline Event");
        System.out.println("5. View Case Information");
        System.out.println("6. Perform Motion Analysis");
        System.out.println("7. Generate Case Report");
        System.out.println("8. Exit");

        System.out.println("-----------------------------------");
    }

    // ------------------------------------------
    // CREATE CASE
    // ------------------------------------------

    public static void createCase() {

        System.out.println(
                "\n========== CREATE ACCIDENT CASE =========="
        );

        System.out.print("Enter Case ID: ");
        String caseId = sc.nextLine();

        System.out.print("Enter Date: ");
        String date = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Accident Description: ");
        String description = sc.nextLine();

        accidentCase =
                new AccidentCase(
                        caseId,
                        date,
                        location,
                        description
                );

        System.out.println(
                "\nAccident case created successfully!"
        );

        accidentCase.displayCase();
    }

    // ------------------------------------------
    // ADD VEHICLE
    // ------------------------------------------

    public static void addVehicle() {

        if (accidentCase == null) {

            System.out.println(
                    "\nPlease create an accident case first."
            );

            return;
        }

        System.out.println(
                "\n========== ADD VEHICLE =========="
        );

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String vehicleType = sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String driverName = sc.nextLine();

        System.out.print("Enter Speed (km/h): ");
        double speed = Double.parseDouble(sc.nextLine());

        System.out.print("Was the vehicle braking? (yes/no): ");
        String brakingInput = sc.nextLine();

        boolean braking =
                brakingInput.equalsIgnoreCase("yes");

        Vehicle vehicle =
                new Vehicle(
                        vehicleNumber,
                        vehicleType,
                        driverName,
                        speed,
                        braking
                );

        accidentCase.addVehicle(vehicle);

        System.out.println(
                "\nVehicle added successfully!"
        );

        vehicle.displayDetails();
    }

    // ------------------------------------------
    // ADD EVIDENCE
    // ------------------------------------------

    public static void addEvidence() {

        if (accidentCase == null) {

            System.out.println(
                    "\nPlease create an accident case first."
            );

            return;
        }

        System.out.println(
                "\n========== ADD EVIDENCE =========="
        );

        int evidenceId =
                accidentCase.getEvidenceList().size() + 1;

        System.out.print("Enter Evidence Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Evidence Description: ");
        String description = sc.nextLine();

        Evidence evidence =
                new Evidence(
                        evidenceId,
                        type,
                        description
                );

        accidentCase.addEvidence(evidence);

        System.out.println(
                "\nEvidence added successfully!"
        );

        evidence.displayDetails();
    }

    // ------------------------------------------
    // ADD TIMELINE EVENT
    // ------------------------------------------

    public static void addEvent() {

        if (accidentCase == null) {

            System.out.println(
                    "\nPlease create an accident case first."
            );

            return;
        }

        System.out.println(
                "\n========== ADD TIMELINE EVENT =========="
        );

        int eventId =
                accidentCase.getEvents().size() + 1;

        System.out.print("Enter Time: ");
        String time = sc.nextLine();

        System.out.print("Enter Event Description: ");
        String description = sc.nextLine();

        Event event =
                new Event(
                        eventId,
                        time,
                        description
                );

        accidentCase.addEvent(event);

        System.out.println(
                "\nTimeline event added successfully!"
        );
    }

    // ------------------------------------------
    // VIEW CASE
    // ------------------------------------------

    public static void viewCase() {

        if (accidentCase == null) {

            System.out.println(
                    "\nNo accident case has been created yet."
            );

            return;
        }

        accidentCase.displayCase();

        System.out.println("\n========== VEHICLES ==========");

        if (accidentCase.getVehicles().isEmpty()) {

            System.out.println("No vehicles added.");

        } else {

            for (Vehicle vehicle :
                    accidentCase.getVehicles()) {

                vehicle.displayDetails();
            }
        }

        System.out.println("\n========== EVIDENCE ==========");

        if (accidentCase.getEvidenceList().isEmpty()) {

            System.out.println("No evidence added.");

        } else {

            for (Evidence evidence :
                    accidentCase.getEvidenceList()) {

                evidence.displayDetails();
            }
        }

        System.out.println("\n========== TIMELINE ==========");

        if (accidentCase.getEvents().isEmpty()) {

            System.out.println("No timeline events added.");

        } else {

            for (Event event :
                    accidentCase.getEvents()) {

                event.displayDetails();
            }
        }
    }

    // ------------------------------------------
    // MOTION ANALYSIS
    // ------------------------------------------

    public static void performAnalysis() {

        if (accidentCase == null) {

            System.out.println(
                    "\nPlease create an accident case first."
            );

            return;
        }

        if (accidentCase.getVehicles().isEmpty()) {

            System.out.println(
                    "\nPlease add at least one vehicle first."
            );

            return;
        }

        System.out.println(
                "\n========== MOTION ANALYSIS =========="
        );

        Vehicle vehicle =
                accidentCase.getVehicles().get(0);

        System.out.println(
                "Analysing vehicle: "
                + vehicle.getVehicleNumber()
        );

        System.out.print(
                "Enter driver reaction time (seconds): "
        );

        double reactionTime =
                Double.parseDouble(sc.nextLine());

        System.out.print(
                "Enter road friction coefficient: "
        );

        double friction =
                Double.parseDouble(sc.nextLine());

        double reactionDistance =
                MotionAnalysis.calculateReactionDistance(
                        vehicle.getSpeed(),
                        reactionTime
                );

        double brakingDistance =
                MotionAnalysis.calculateBrakingDistance(
                        vehicle.getSpeed(),
                        friction
                );

        double stoppingDistance =
                MotionAnalysis.calculateTotalStoppingDistance(
                        vehicle.getSpeed(),
                        reactionTime,
                        friction
                );

        AnalysisResult result =
                new AnalysisResult(
                        reactionDistance,
                        brakingDistance,
                        stoppingDistance
                );

        result.display();
    }

    // ------------------------------------------
    // GENERATE REPORT
    // ------------------------------------------

    public static void generateReport() {

        if (accidentCase == null) {

            System.out.println(
                    "\nPlease create an accident case first."
            );

            return;
        }

        ReportGenerator.generateReport(accidentCase);
    }
}