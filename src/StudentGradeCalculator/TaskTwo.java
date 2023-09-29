package StudentGradeCalculator;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of maths");
        int Maths=sc.nextInt();
        System.out.println("Enter the marks of English");
        int English= sc.nextInt();
        System.out.println("Enter the marks of Science");
        int Science=sc.nextInt();
        System.out.println("Enter the marks of Hindi");
        int Hindi=sc.nextInt();
        System.out.println("Enter the marks of It");
        int It=sc.nextInt();

        int sum=Maths+English+Science+Hindi+It;
        float AveragePercentage=(sum)/5;
        String grade="";

        if(AveragePercentage<100 && AveragePercentage>=80){
           grade="A";
        }
        if(AveragePercentage<80 && AveragePercentage>=75){
           grade="B";
        }
        if(AveragePercentage<75 && AveragePercentage>=65){
          grade="C";
        }
        if(AveragePercentage<65 && AveragePercentage>=40){
          grade="D";
        }

        //TO PRINT
        System.out.println(sum);
        System.out.println(AveragePercentage);
        System.out.println(grade);




    }
}
