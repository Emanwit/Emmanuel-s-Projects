FITNESS TRACKER APPLICATION BY EMMANUEL NWITE.
My Fitness Tracker application is a system designed to help track fitness activities for both athletes and coaches. It includes four main classes:

1. User: This is the main class for all users. It includes basic details such as username, password, email, age, weight, and height. The class ensures that these details are valid by checking for positive age, weight, and height, and it has a method to validate email format. Additionally, it can calculate the user's BMI and provide a string representation of the user's information.

2. Athlete: This class extends the User class and adds specific details for athletes. It includes attributes like the type of activity (e.g., running), the duration of the activity, the distance covered, and whether the athlete is a professional. The Athlete class can log activities, calculate the pace (duration per distance), and show detailed information about the athlete. It also includes a compliment message to encourage athletes.

3. Coach: This class also extends the User class and adds specific details for coaches. It includes attributes such as specialisation, years of experience, the number of athletes coached, and the success rate of the coach. The Coach class can log feedback on activities, calculate a success ratio based on the number of athletes coached, and provide detailed information about the coach.

4. FitnessTracker: This is the main system class that manages both athletes and coaches. It can hold arrays of Athlete and Coach objects, add new athletes and coaches to these arrays, and keep track of their counts. The FitnessTracker class provides methods to add athletes and coaches, ensuring that the arrays are not overfilled. It also includes a method to provide a summary of the tracker, including the number of athletes and coaches.

Overall, the Fitness Tracker application helps keep track of fitness data for both athletes and coaches in an organised and efficient manner. It ensures data validity, provides detailed information, and supports the logging of activities and feedback, making it a useful tool for managing the user’s fitness progress.

