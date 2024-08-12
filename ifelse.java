import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        byte m1 , m2 , m3, m4;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Marks in Eng");
        m1 = sc.nextByte();
        System.out.println("Enter your Marks in Hindi");
        m2= sc.nextByte();
        System.out.println("Enter your Marks in Maths");
        m3 = sc.nextByte();
        System.out.println("Enter your Marks in Sci");
        m4 = sc.nextByte();
        float avg = (m1+m2+m3+m4)/4.0f;
        System.out.println("Your Overall Percent is: "+avg);
        if(avg>=40 && m1>33 && m2>33 && m3>33 && m4>33){
            System.out.println("Your Are Passed");
        }else {
            System.out.println("Your are Fail");
        }
//        int age = sc.nextInt();
//        if (age>18){
//            System.out.println("Yes You Can Drive");
//        }
//        else {
//            System.out.println("You Can't Drive");
//        }

    }
}
