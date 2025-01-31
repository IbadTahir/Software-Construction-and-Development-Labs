package Lab10;

final class FailedStudent {
 private final int rollNumber;
 private final String subjectCode;
 private final String subjectName;

 public FailedStudent(int rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }

 @Override
 public String toString() {
     return "FailedStudent [Roll Number: " + rollNumber + ", Subject Code: " + subjectCode + ", Subject Name: " + subjectName + "]";
 }
}

class PromotedStudent {
 private int rollNumber;
 private String subjectCode;
 private String subjectName;

 public PromotedStudent(int rollNumber, String subjectCode, String subjectName) {
     this.rollNumber = rollNumber;
     this.subjectCode = subjectCode;
     this.subjectName = subjectName;
 }

 public int getRollNumber() {
     return rollNumber;
 }

 public void setRollNumber(int rollNumber) {
     this.rollNumber = rollNumber;
 }

 public String getSubjectCode() {
     return subjectCode;
 }

 public void setSubjectCode(String subjectCode) {
     this.subjectCode = subjectCode;
 }

 public String getSubjectName() {
     return subjectName;
 }

 public void setSubjectName(String subjectName) {
     this.subjectName = subjectName;
 }

 @Override
 public String toString() {
     return "PromotedStudent [Roll Number: " + rollNumber + ", Subject Code: " + subjectCode + ", Subject Name: " + subjectName + "]";
 }
}

public class Lab10 {
 public static void main(String[] args) {
     FailedStudent failedStudent = new FailedStudent(101, "CS101", "Data Structures");
     System.out.println(failedStudent);

     PromotedStudent promotedStudent = new PromotedStudent(102, "CS102", "Algorithms");
     System.out.println(promotedStudent);

     promotedStudent.setRollNumber(103);
     promotedStudent.setSubjectCode("CS103");
     promotedStudent.setSubjectName("Operating Systems");
     System.out.println("After modification: " + promotedStudent);
 }
}
