package studentRegistrationSystem;

import java.util.ArrayList;

public class task4 {

    public static void main(String[] args) {

         course course1=new course("CSE01" ,"Cyber Security",30,"9:00 am -9:30 am");
         course course2=new course("ENG02", "English Composition", 45, "9:30am to 10 am");

         Student stud1=new Student(1,"Alice");
         Student stud2=new Student(2,"John");

         //register students for courses

        stud1.registereCourse(course1);
        stud2.registereCourse(course2);

        System.out.println("Course 2 Code: " + course2.getCode());
        System.out.println("Course 2 Title: " + course2.getTitle());
        System.out.println("Course 2 Available Slots: " + course2.getAvailableSlots());
        System.out.println("Course 2 Schedule: " + course2.getSchedule());

        System.out.println("Student Information:");
        System.out.println("Student 1 ID: " + stud1.getStudentId());
        System.out.println("Student 1 Name: " + stud1.getName());
        System.out.println("Student 1 Registered Courses: " + stud1.getRegisteredCourses());

        System.out.println("Student 2 ID: " + stud2.getStudentId());
        System.out.println("Student 2 Name: " + stud2.getName());
        System.out.println("Student 2 Registered Courses: " + stud2.getRegisteredCourses());
    }
}

class course{
    String code;
    String title;
    String description;
    int capacity;
    String schedule;

    int availableSlots;

    public course(String code, String title,int capacity,String schedule){
        this.code=code;
        this.title=title;
        this.capacity=capacity;
        this.schedule=schedule;
    }

    public String getCode(){
         return code;
    }

    public String getTitle(){
        return title;
    }

    public int getCapacity(){
        return  capacity;
    }
    public String getSchedule(){
        return schedule;
    }

    public int getAvailableSlots(){
        return availableSlots;
    }
    public void decreaseAvailableSlots(){
        availableSlots--;
    }

    public void increaseAvailableSlots(){
        availableSlots++;
    }

}

class Student{
    int studentId;

    String name;

    ArrayList<course>registeredCourses;

    Student(int studentId,String name){
        this.studentId=studentId;
        this.name=name;
        this.registeredCourses=new ArrayList<>();
    }

    public int getStudentId(){
        return studentId;
    }

    public String getName(){
        return name;
    }

    public ArrayList<course>getRegisteredCourses(){
        return registeredCourses;
    }

    public void registereCourse(course course){
     if(course.getAvailableSlots()>0){
       registeredCourses.add(course);
       course.decreaseAvailableSlots();
     }
    }

    public void dropCourse(course course){
        if(registeredCourses.contains(course)){
            registeredCourses.remove(course);
            course.increaseAvailableSlots();
        }
    }



}
