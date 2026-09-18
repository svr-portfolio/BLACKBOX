/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

public class Vehicle {

    private String vehicleNumber;
    private String vehicleType;
    private String driverName;
    private double speed;
    private boolean braking;

    public Vehicle(String vehicleNumber, String vehicleType,
                   String driverName, double speed, boolean braking) {

        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.speed = speed;
        this.braking = braking;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isBraking() {
        return braking;
    }

    public void displayDetails() {

        System.out.println("--------------------------------");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Driver Name    : " + driverName);
        System.out.println("Speed          : " + speed + " km/h");
        System.out.println("Braking        : " + (braking ? "Yes" : "No"));
        System.out.println("--------------------------------");
    }
}