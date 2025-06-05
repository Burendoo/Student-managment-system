import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Ask how many students to add

        System.out.println("Enter how many students you want to add: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int n = 0; n<numOfStudents; n++){
            students[n] = new Student();
            students[n].Enroll();
            students[n].Payment();

        }


        for (int n = 0; n<numOfStudents; n++){
            System.out.println(students[n].ShowInfo());

        }



    }
}