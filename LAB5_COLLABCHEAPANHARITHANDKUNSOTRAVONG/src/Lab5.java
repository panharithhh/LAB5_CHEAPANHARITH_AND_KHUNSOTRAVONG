// LAB 05 - SE GROUP
// Name : course in year 2 program
// Date : 08/1/2025
// Author : Chea panharith
// Modified : 08/1/2025
// Description : This class represents a course subject for Year 2 students, with attributes for name, ID, and score
// Functions: - Constructor: Initializes name, ID, and score.
//            - getName(): Returns the subject name.
//            - getId(): Returns the subject ID.
//            - getScore(): Returns the subject score.
//            - getMaxScore(): give the max score.
//            - Method
//            - Setname() : change the name
// Variables: - name: The name of the subject (final, private).
//            - id: The ID of the subject (final, private).
//            - score: The score of the subject (final, private).

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