/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

public class AnalysisResult {

    private double reactionDistance;
    private double brakingDistance;
    private double stoppingDistance;

    public AnalysisResult(double reactionDistance,
                          double brakingDistance,
                          double stoppingDistance) {

        this.reactionDistance = reactionDistance;
        this.brakingDistance = brakingDistance;
        this.stoppingDistance = stoppingDistance;
    }

    public void display() {

        System.out.println("\n========== MOTION ANALYSIS ==========");

        System.out.printf(
                "Reaction Distance : %.2f m%n",
                reactionDistance
        );

        System.out.printf(
                "Braking Distance  : %.2f m%n",
                brakingDistance
        );

        System.out.printf(
                "Stopping Distance : %.2f m%n",
                stoppingDistance
        );

        System.out.println("=====================================");
    }
}