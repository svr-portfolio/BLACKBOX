/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

public class MotionAnalysis {

    public static double calculateReactionDistance(
            double speedKmH, double reactionTime) {

        double speedMs = speedKmH / 3.6;

        return speedMs * reactionTime;
    }

    public static double calculateBrakingDistance(
            double speedKmH, double frictionCoefficient) {

        double speedMs = speedKmH / 3.6;

        double gravity = 9.81;

        return (speedMs * speedMs)
                / (2 * frictionCoefficient * gravity);
    }

    public static double calculateTotalStoppingDistance(
            double speedKmH,
            double reactionTime,
            double frictionCoefficient) {

        double reactionDistance =
                calculateReactionDistance(speedKmH, reactionTime);

        double brakingDistance =
                calculateBrakingDistance(speedKmH, frictionCoefficient);

        return reactionDistance + brakingDistance;
    }
}