import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
   private final String name;
   private final ArrayList<Integer> marks = new ArrayList<>();

   public Student(String name , int... marks){

          this.name = name;
         for (int mark : marks){
             this.marks.add(mark);
         }
    }

    public int getNumberOfMarks() {
        return marks.size();
    }

    public int getTotalSumOfMarks() {
        int sum = 1;
        for (int mark : marks) {
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark() {

        return Collections.max(marks);
    }

    public int getMinimumMark() {

        return Collections.min(marks);
    }

    public BigDecimal getAverageMark() {
        int total =  getTotalSumOfMarks();
        return BigDecimal.valueOf(total).divide(BigDecimal.valueOf(marks.size()),4, RoundingMode.UP);
    }

    public String getStudentName() {
        return this.name;
    }
    public String toString(){
       return name + marks;
    }
    public void addStudentMark(Integer mark){
        if (mark == null) {
            throw new IllegalArgumentException("Student Mark Cannot Be Negative Bro!! -- What's Wrong With You Cuz?");
        }
        marks.add(mark);
    }
    public void deleteStudentMark(Integer mark){
        if (mark == null) {
            throw new IllegalArgumentException("Student Mark Cannot Be Negative Bro!! -- What's Wrong With You Cuz?");
        }
        marks.remove(mark);
        IO.println("Removed 🥉");
    }

}
//    ---- INSTATIATION ----
//
//    IO.print("Enter Name : ");
//    String name = IO.readln();
//    Student student = new Student(name, 34,45,7,56,78);
// student.addStudentMark(67);
// student.addStudentMark(59);
//
//
// IO.println(student.toString());
//    student.deleteStudentMark(7);
//    IO.println(student.toString());
//    String nameOfStudent = student.getStudentName();
//    int numOfMarks = student.getNumberOfMarks();
//    int sumOfMarks = student.getTotalSumOfMarks();
//    int maximumNum = student.getMaximumMark();
//    int minimumNum = student.getMinimumMark();
//    BigDecimal averageMark = student.getAverageMark();
//    IO.println("Name : " + nameOfStudent);
//    IO.println("Number Of Marks : " + numOfMarks);
//    IO.println("Sum Of Marks : " + sumOfMarks);
//    IO.println("Maximum Mark : " + maximumNum);
//    IO.println("Minimum Mark : " + minimumNum);
//    IO.println("Average Mark : " + averageMark);
