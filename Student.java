import java.util.*;
class Student {
    String name;
    int rollNo;
    public void setValues(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public void displayDetails(){
        System.out.println("Student name is:"+ this.name);
        System.out.println("Student roll number is:"+this.rollNo);
    }
    public void averageMarks(float physics,float maths,float chemistry) {
        float averageScore = physics+maths+chemistry/3;
        float score=physics+maths+chemistry;
        float percentage= (score/300)*100;
            System.out.println("Student Average Marks is:" + averageScore); 
        if (percentage >=50 || percentage <=100){
        	System.out.println("You are passed");
        } else{
        	System.out.println("You are failed");
        }
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name = sc.nextLine();
        System.out.println("Enter Student RollNO:");
        int rollNo = sc.nextInt();
        System.out.println("Enter Physics Marks:");
        float physics =sc.nextFloat();
        System.out.println("Enter Maths Marks:");
        float maths =sc.nextFloat();
        System.out.println("Enter Chemistry Marks:");
        float chemistry =sc.nextFloat();
      
        Student s1 = new Student(); 
        s1.setValues(name, rollNo);
        s1.displayDetails();
        s1.averageMarks(physics,maths,chemistry);
    }
}