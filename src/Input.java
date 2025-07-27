import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name : ");
        String name = input.nextLine();
        System.out.print("Enter your Age : ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter your Country : ");
        String country = input.nextLine();
        System.out.print("Enter your State : ");
        String state = input.nextLine();
        System.out.print("Enter your City : ");
        String city = input.nextLine();

        System.out.print("Enter your Phone no. : ");
        long phone = input.nextLong();
        input.nextLine();
        System.out.print("Enter your PIN code : ");
        int pin = input.nextInt();
        input.nextLine();
        System.out.print("Are you Student ?");
        boolean student = input.nextBoolean();
        input.nextLine();
        System.out.print("Enter any decimal : ");
        double decimal = input.nextDouble();
            String studentans = "";
        if (student) {
            studentans="Yes I am a Student";
        }
        else{studentans="No I am not a Student";}
        System.out.println("Myself " + name + ". I Am " + age + " year's old. I am from "+ city + ", " + state + ", " + country + " " + pin + ". \nIf you want to contact me then you can call on " + phone + ". \n"+studentans +" and my favourite decimal no is "+decimal+".");


    }
}
