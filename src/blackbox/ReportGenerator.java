/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

public class ReportGenerator {

    public static void generateReport(AccidentCase accidentCase) {

        System.out.println("\n");
        System.out.println("==========================================");
        System.out.println("           BLACKBOX CASE REPORT");
        System.out.println("==========================================");

        System.out.println("\nCASE DETAILS");
        System.out.println("------------------------------------------");

        System.out.println("Case ID     : "
                + accidentCase.getCaseId());

        System.out.println("Date        : "
                + accidentCase.getDate());

        System.out.println("Location    : "
                + accidentCase.getLocation());

        System.out.println("Description : "
                + accidentCase.getDescription());

        System.out.println("\nVEHICLES");
        System.out.println("------------------------------------------");

        if (accidentCase.getVehicles().isEmpty()) {

            System.out.println("No vehicles recorded.");

        } else {

            for (Vehicle vehicle :
                    accidentCase.getVehicles()) {

                vehicle.displayDetails();
            }
        }

        System.out.println("\nEVIDENCE");
        System.out.println("------------------------------------------");

        if (accidentCase.getEvidenceList().isEmpty()) {

            System.out.println("No evidence recorded.");

        } else {

            for (Evidence evidence :
                    accidentCase.getEvidenceList()) {

                evidence.displayDetails();
            }
        }

        System.out.println("\nTIMELINE");
        System.out.println("------------------------------------------");

        if (accidentCase.getEvents().isEmpty()) {

            System.out.println("No events recorded.");

        } else {

            for (Event event :
                    accidentCase.getEvents()) {

                event.displayDetails();
            }
        }

        System.out.println("\n==========================================");
        System.out.println("             END OF REPORT");
        System.out.println("==========================================");
    }
}
