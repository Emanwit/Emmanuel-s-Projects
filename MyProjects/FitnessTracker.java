/**
 * @author Emmanuel Nwite
 * @version 10th May 2024
 * This composition class represents the fitness tracker system which manages both athletes and coaches.
 */


import java.util.Scanner;
import java.util.Arrays;
public class FitnessTracker {
    // Attributes
    private Athlete[] athletes;
    private Coach[] coaches;
    private String trackerName;
    private int athleteCount;
    private int coachCount;

    // Constructor with all parameters
    public FitnessTracker(String trackerName, Athlete[] athletes, Coach[] coaches) {
       
        this.trackerName = trackerName;
        this.athletes = athletes;
        this.coaches = coaches;
        this.athleteCount = athletes.length;
        this.coachCount = coaches.length;
    }

    // No-parameter constructor
    public FitnessTracker() {
        this("N/A", new Athlete[10], new Coach[10]);
        this.athleteCount = 0;
        this.coachCount = 0;
    }

    // Getters and Setters
    public Athlete[] getAthletes() {
        return athletes;
    }

    public void setAthletes(Athlete[] athletes) {
        this.athletes = athletes;
        this.athleteCount = athletes.length;
    }

    public Coach[] getCoaches() {
        return coaches;
    }

    public void setCoaches(Coach[] coaches) {
        this.coaches = coaches;
        this.coachCount = coaches.length;
    }

    public String getTrackerName() {
        return trackerName;
    }

    public void setTrackerName(String trackerName) {
       
        this.trackerName = trackerName;
    }

    // Custom method to add an athlete
    public void addAthlete(Athlete athlete) {
        if (athlete == null) {
            throw new IllegalArgumentException("Athlete cannot be empty.");
        }
        if (athleteCount >= athletes.length) {

            athletes = Arrays.copyOf(athletes, athletes.length * 2);
        }
        athletes[athleteCount++] = athlete;
    }

    // Custom method to add a coach
    public void addCoach(Coach coach) {
        if (coach == null) {
            throw new IllegalArgumentException("Coach cannot be empty.");
        }
        if (coachCount >= coaches.length) {

            coaches = Arrays.copyOf(coaches, coaches.length * 2);

        }
        coaches[coachCount++] = coach;
    }

    // toString method
    @Override
    public String toString() {
        return String.format("Fitness Tracker: %s%nNumber of Athletes: %d%nNumber of Coaches: %d", 
                              trackerName, athleteCount, coachCount);
    }
}
