/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

public class Evidence {

    private int evidenceId;
    private String type;
    private String description;

    public Evidence(int evidenceId, String type, String description) {

        this.evidenceId = evidenceId;
        this.type = type;
        this.description = description;
    }

    public int getEvidenceId() {
        return evidenceId;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public void displayDetails() {

        System.out.println("--------------------------------");
        System.out.println("Evidence ID   : " + evidenceId);
        System.out.println("Evidence Type : " + type);
        System.out.println("Description   : " + description);
        System.out.println("--------------------------------");
    }
}