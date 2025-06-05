import java.util.Scanner;

public class Student {
    private String FirstName;
    private String LastName;
    private int gradeYear;
    private String StudentID;
    private String courses = "";
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;


//    prompt user to add student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first name:");
        this.FirstName = in.nextLine();

        System.out.println("Enter your last name:");
        this.LastName = in.nextLine();


        System.out.println("1 - Freshman\n2 - Sophmore \n3 - Junior\n4 - Senior\nEnter your class grade level:");
        this.gradeYear = in.nextInt();

        SetStudentID();

    }

//   Generate an Id

    private void SetStudentID(){
        id++;
        this.StudentID = gradeYear + "" + id;


    }

//    Enroll in courses

    public void Enroll(){
        do {
            System.out.print("Enter course to enroll (Q to quit):");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();

            if (!course.equals("Q")){
                courses = courses + "\n  " + course;
                tutionBalance = tutionBalance+costOfCourse;

            }
            else { break; }
        } while ( 1 != 0);



    }


//    View Balance

    public void ViewBalance(){
        System.out.println("Your balance is $"+ tutionBalance);
    }

//    Pay tuition

    public void Payment(){
        ViewBalance();
        System.out.print("Enter amount of payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();

        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $"+payment);
        ViewBalance();
    }

//    show status

    public String ShowInfo(){
        return "\nName: "+FirstName+" "+LastName +
                "\nGrade Level: "+ gradeYear+
                "\nStudent ID: "+ StudentID+
                "\nCourses Enrolled: "+courses +
                "\nBalance: $"+tutionBalance;
    }
}
