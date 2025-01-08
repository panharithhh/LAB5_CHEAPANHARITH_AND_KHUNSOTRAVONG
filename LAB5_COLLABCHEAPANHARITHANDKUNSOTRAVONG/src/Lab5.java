// LAB 05 - SE GROUP
// Name : course in year 2 program
// Date : 08/01/2025
// Author : Chea Panharith, Khun Sotravong
// Modified : 08/01/2025
// Description : This class represents a course subject for Year 2 students, with attributes for name, ID, and score.
//               THis class represents study sessions in a day with attributes for startTime and endTime.
//              Includes methods for retrieving and validating attributes.
// Functions: - Constructor: Initializes name, ID, and score.
//            - getName(): Returns the subject name.
//            - getId(): Returns the subject ID.
//            - getScore(): Returns the subject score.
//            - setName(): Validates and updates the subject name.
//            - getMaxScore(): Returns the maximum score constant.
//            - Session Constructor: Initializes startTime and endTime for a study session.
//            - setDuration(): Validates and sets the start and end times for a session.
//            - getStartTime(): Returns the session's start time.
//            - getEndTime(): Returns the session's end time.
//            - toString(): Provides a string representation of the session.
// Variables: - name: The name of the subject (private).
//            - id: The ID of the subject (private).
//            - score: The score of the subject (private).
//            - MAX_SCORE: The maximum possible score (static final, private).
//            - Session.startTime: The start time of the session (private).
//            - Session.endTime: The end time of the session (private).

class Subject{
    private String name;
    final private String id;
    final private double score;
    private static final double MAX_SCORE = 100.0;


    public Subject(String name, String id, double score) {
        
        setName(name);
        this.id = id;
        this.score = score;
    }

    public  String getName() {
        return name;
    } 

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }
    public static double getMaxScore() {
        return MAX_SCORE;
    }
    
    public void setName(String name){
        this.name = name;
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }
}
class Session {
    private int startTime; 
    private int endTime;   

    /**
     * Constructor to initialize a study session.
     *
     * @param startTime 
     * @param endTime   
     * @throws IllegalArgumentException 
     */
    public Session(int startTime, int endTime) {
        setDuration(startTime, endTime);
    }

    /**
     * Sets the duration of the study session.
     *
     * @param startTime 
     * @param endTime   
     * @throws IllegalArgumentException 
     */
    public void setDuration(int startTime, int endTime) {
        if (startTime >= endTime) {
            throw new IllegalArgumentException("Start time must be less than end time.");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * 
     *
     * @return The start time.
     */
    public int getStartTime() {
        return startTime;
    }

    /**
     * 
     *
     * @return The end time.
     */
    public int getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "Session{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}


public class Lab5{
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Subject subject = new Subject("", "20230042" , 90);
        System.out.println(subject.getName());
        System.out.println(subject.getId());
        System.out.println(subject.getScore());
        System.out.println(subject.getMaxScore());

    }
}