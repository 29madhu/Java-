public class StudentGrades2 {
    public static void main(String[] args) {
        int[] marks = {90, 91, 92, 93, 92, 93};
        int total = 0;
        for (int mark : marks) total += mark;
        double aggregate = total / 6.0;
        String grade = aggregate > 75 ? "Distinction" : aggregate > 60 ? "First Division" : aggregate > 50 ? "Second Division" : aggregate > 40 ? "Third Division" : "FAIL";
        System.out.println("Total= " + total + "\nAggregate= " + aggregate + "\nClass: " + grade);
    }
}