/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackbox;

public class Event {

    private int eventId;
    private String time;
    private String description;

    public Event(int eventId, String time, String description) {

        this.eventId = eventId;
        this.time = time;
        this.description = description;
    }

    public int getEventId() {
        return eventId;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public void displayDetails() {

        System.out.println(
                eventId + ". " + time + " - " + description
        );
    }
}