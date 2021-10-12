import java.util.*;

class Main { 
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    Student student2 = new Student();
    student2.setName("Devin Fish");
    student2.setGPA(4.3);
    student2.setMajor("Information Systems");

    student1.print();
    student2.print();

    ArrayList<Double> gpas = new ArrayList<>();
    gpas.add(student1.getGPA());
    gpas.add(student2.getGPA());

    double sumgpas = 0;

    for(int i = 0; i < gpas.size(); i++){
      sumgpas = sumgpas + gpas.get(i);
    }

    System.out.println("The average GPA is " + sumgpas/gpas.size());
  }
}