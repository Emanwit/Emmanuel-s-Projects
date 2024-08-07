/**
 * @author Emmanuel Nwite
 * @version 10th May 2024
 * This will test my fitness tracker application. It will prompt the user to enter infoo for 2 different athletes and coaches.
 */

import java.util.Scanner;

public class FitnessTrackerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting user to enter information for the first athlete
        System.out.println("Enter information for the first athlete:");
        // Username
        System.out.print("Username: ");
        String username1 = input.nextLine();
        // Password
        System.out.print("Password: ");
        String password1 = input.nextLine();
        // Email
        System.out.print("Email: ");
        String email1 = input.nextLine();
        // Age
        System.out.print("Age: ");
        int age1 = input.nextInt();
        // Weight
        System.out.print("Weight(kg): ");
        double weight1 = input.nextDouble();
        // Height
        System.out.print("Height(metres): ");
        double height1 = input.nextDouble();
        input.nextLine(); 
        // Activity Type
        System.out.print("Activity Type: ");
        String activityType1 = input.nextLine();
        // Duration
        System.out.print("Duration(minutes): ");
        double duration1 = input.nextDouble();
        // Distance
        System.out.print("Distance covered(km): ");
        double distance1 = input.nextDouble();
        // Professional
        System.out.print("Is this athlete a professional (true/false): ");
        boolean professional1 = input.nextBoolean();
        input.nextLine(); 

        // Creating the first athlete object
        Athlete athlete1 = new Athlete(username1, password1, email1, age1, weight1, height1, activityType1, duration1, distance1, professional1);

        // Prompting user to enter information for the second athlete
        System.out.println("Enter information for the second athlete:");
        // Username
        System.out.print("Username: ");
        String username2 = input.nextLine();
        // Password
        System.out.print("Password: ");
        String password2 = input.nextLine();
        // Email
        System.out.print("Email: ");
        String email2 = input.nextLine();
        // Information to enter the age of the current user.
        System.out.print("Age: ");
        int age2 = input.nextInt();
        // Weight
        System.out.print("Weight(kg): ");
        double weight2 = input.nextDouble();
        // Height
        System.out.print("Height(metres): ");
        double height2 = input.nextDouble();
        input.nextLine(); 
        // Activity Type
        System.out.print("Activity Type: ");
        String activityType2 = input.nextLine();
        // Duration
        System.out.print("Duration(minutes): ");
        double duration2 = input.nextDouble();
        // Distance
        System.out.print("Distance covered(km): ");
        double distance2 = input.nextDouble();
        // Professional
        System.out.print("Is this athlete a professional (true/false): ");
        boolean professional2 = input.nextBoolean();
        input.nextLine(); // Consume newline left-over

        // Creating the second athlete object
        Athlete athlete2 = new Athlete(username2, password2, email2, age2, weight2, height2, activityType2, duration2, distance2, professional2);

        // Default athlete
        Athlete defaultAthlete = new Athlete();

        // Print out the results of the athletes
        System.out.printf("%nFirst athlete: %n%s%n", athlete1);
        System.out.printf("%nSecond athlete: %n%s%n", athlete2);
        System.out.printf("%nDefault athlete: %n%s%n", defaultAthlete);

        // Testing custom methods and setters/getters for Athlete class
        System.out.printf("Pace of the first athlete: %.2f%n", athlete1.calculatePace());
        athlete1.setDuration(10);
        athlete1.setDistance(2);
        System.out.printf("Updated pace of the first athlete: %.2f%n", athlete1.calculatePace());

        // If the user enters something like athlete1.setDuration(-5), It should throw IllegalArgumentException

        // Prompting user to enter information for the first coach
        System.out.println("Enter information for the first coach:");
        // Username
        System.out.print("Username: ");
        String coachUsername1 = input.nextLine();
        // Password
        System.out.print("Password: ");
        String coachPassword1 = input.nextLine();
        // Email
        System.out.print("Email: ");
        String coachEmail1 = input.nextLine();
        // Age
        System.out.print("Age: ");
        int coachAge1 = input.nextInt();
        // Weight
        System.out.print("Weight(kg): ");
        double coachWeight1 = input.nextDouble();
        // Height
        System.out.print("Height(m): ");
        double coachHeight1 = input.nextDouble();
        input.nextLine(); 
        // Specialization
        System.out.print("Specialization: ");
        String specialization1 = input.nextLine();
        // Experience Years
        System.out.print("Experience Years: ");
        int experienceYears1 = input.nextInt();
        // Number of Athletes
        System.out.print("Number of Athletes trained: ");
        int numberOfAthletes1 = input.nextInt();
        // Success Rate
        System.out.print("Success Rate(percentage): ");
        double successRate1 = input.nextDouble();
        input.nextLine(); 

        // Creating the first coach object
        Coach coach1 = new Coach(coachUsername1, coachPassword1, coachEmail1, coachAge1, coachWeight1, coachHeight1, specialization1, experienceYears1, numberOfAthletes1, successRate1);

        // Prompting user to enter information for the second coach
        System.out.println("Enter information for the second coach:");
        // Username
        System.out.print("Username: ");
        String coachUsername2 = input.nextLine();
        // Password
        System.out.print("Password: ");
        String coachPassword2 = input.nextLine();
        // Email
        System.out.print("Email: ");
        String coachEmail2 = input.nextLine();
        // Age
        System.out.print("Age: ");
        int coachAge2 = input.nextInt();
        // Weight
        System.out.print("Weight(kg): ");
        double coachWeight2 = input.nextDouble();
        // Height
        System.out.print("Height(m): ");
        double coachHeight2 = input.nextDouble();
        input.nextLine(); // Consume newline left-over
        // Specialization
        System.out.print("Specialization: ");
        String specialization2 = input.nextLine();
        // Experience Years
        System.out.print("Experience Years: ");
        int experienceYears2 = input.nextInt();
        // Number of Athletes
        System.out.print("Number of Athletes trained: ");
        int numberOfAthletes2 = input.nextInt();
        // Success Rate
        System.out.print("Success Rate(percentage): ");
        double successRate2 = input.nextDouble();

        // Creating the second coach object
        Coach coach2 = new Coach(coachUsername2, coachPassword2, coachEmail2, coachAge2, coachWeight2, coachHeight2, specialization2, experienceYears2, numberOfAthletes2, successRate2);

        // Default coach
        Coach defaultCoach = new Coach();

        // Print out the results of the coaches
        System.out.printf("%nFirst coach: %n%s%n", coach1);
        System.out.printf("%nSecond coach: %n%s%n", coach2);
        System.out.printf("%nDefault coach: %n%s%n", defaultCoach);

        // Testing custom methods and setters/getters for Coach class
        System.out.printf("Success ratio of the first coach: %.2f%n", coach1.calculateSuccessRatio());
        coach1.setNumberOfAthletes(20);
        coach1.setSuccessRate(75);
        System.out.printf("Updated success ratio of the first coach: %.2f%n", coach1.calculateSuccessRatio());

        // something like coach1.setSuccessRate(110) should throw an IllegalArgumentException.

        // Demonstrate polymorphic behavior
        User[] users = {athlete1, athlete2, coach1, coach2};
        for (User user : users) {
            user.logActivity("Running", 30.0, 5.0);
        }

        // Creating the fitness tracker object
        FitnessTracker fitnessTracker = new FitnessTracker("Emmanuel's Fitness Tracker", new Athlete[]{athlete1, athlete2}, new Coach[]{coach1, coach2});

        // Adding default athlete and coach to the fitness tracker
        fitnessTracker.addAthlete(defaultAthlete);
        fitnessTracker.addCoach(defaultCoach);

        // Print out the fitness tracker details
        System.out.printf("%nFitness Tracker Details: %n%s%n", fitnessTracker);
    }
}
