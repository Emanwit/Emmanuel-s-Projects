/**
 * @author Emmanuel Nwite
 * @version 10th May 2024
 * This program will represent the information for the athlete using my application
 */

public class Athlete extends User {
    // Attributes
    //this lets me know the user's activity type, e.g. running.
    private String activityType;
    private double duration;
    private double distance;
    //This attribute lets me know if the user is a professional athlete or not.
    private boolean professional;
    //compliment to motivate the user of my app
    public static final String compliment = "Keep improving!"; 

    // Constructor with all parameters
    public Athlete(String username, String password, String email, int age, double weight, double height, String activityType, double duration, double distance, boolean professional) {
        super(username, password, email, age, weight, height);
        this.activityType = activityType;
        if (duration > 0) {
        	this.duration = duration;

        }
        
        this.distance = distance;
        this.professional = professional;
    }
    //no parameter constructor
    public Athlete(){
    	this("N/A","N/A","N/A", 20, 20.0, 20.0,"N/A", 20.0, 20.0, false );
    }

    // Getters and Setters
    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("Duration must be greater than zero.");
        }
        this.duration = duration;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than zero.");
        }
        this.distance = distance;
    }
     // Custom method to calculate the user's pace (duration per distance)
    public double calculatePace() {
        if (distance <= 0) {
            throw new IllegalArgumentException("Distance must be greater than zero to calculate pace.");
        }
        return duration / distance;
    } 

    // Log activity method to store the athlete's activity
    @Override
   public void logActivity(String activity, double duration, double distance) {
    System.out.printf("Athlete %s logged activity: %s%n Duration: %.2f %n Distance: %.2f%n", 
                      getUsername(), activity, duration, distance);
}


    // toString method
    @Override
    public String toString() {
        return String.format("%s%nAthlete Details:%nActivity Type: %s%nDuration: %.2f%nDistance: %.2f%n Is this athlete a proffessional: %b%nPace: %.2f%n Compliment: %s", 
                          super.toString(), activityType, duration, distance, professional, calculatePace(), compliment);
    }
}