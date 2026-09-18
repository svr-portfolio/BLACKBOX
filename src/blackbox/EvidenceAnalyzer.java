/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

public class EvidenceAnalyzer {

    public static String analyze(AccidentCase accidentCase) {

        StringBuilder result = new StringBuilder();

        result.append("\n========== EVIDENCE ANALYSIS ==========\n");

        if (accidentCase.getEvidenceList().isEmpty()) {

            result.append("No evidence has been added yet.\n");

        } else {

            result.append("Total evidence items: ")
                  .append(accidentCase.getEvidenceList().size())
                  .append("\n");

            for (Evidence evidence :
                    accidentCase.getEvidenceList()) {

                result.append("- ")
                      .append(evidence.getType())
                      .append(": ")
                      .append(evidence.getDescription())
                      .append("\n");
            }
        }

        if (accidentCase.getVehicles().size() >= 2) {

            result.append("\nMultiple vehicles are associated with this case.\n");

        } else if (accidentCase.getVehicles().size() == 1) {

            result.append("\nOne vehicle is currently associated with the case.\n");

        } else {

            result.append("\nNo vehicles have been added yet.\n");
        }

        result.append("=======================================\n");

        return result.toString();
    }
}