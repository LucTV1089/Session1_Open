package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Bai 1
//        System.out.println("Enter your name : ");
//        String name = scanner.nextLine();
//        System.out.println("Hello : " + name);

        //Bai 2
//        System.out.println("Input USD want to transfer : ");
//        float vnd = Float.parseFloat(scanner.nextLine());// nên dùng kiểu này
//        // nên coi dữ liệu đầu vào là kiểu chuỗi và sẽ convert
//        float usd;
//        usd = vnd * 25000;
//        System.out.println("From USD to VND is : "+ usd);
        //Bai3
//        System.out.println("Input a side of square : ");
//        int side = scanner.nextInt();
//        int area;
//        area = side *side;
//        System.out.println("Area of a square is : " +area);
        // Bai4
//        System.out.println("Input Mark of Mark : ");
//        int math = scanner.nextInt();
//        System.out.println("Input Mark of English :");
//        int english = scanner.nextInt();
//        System.out.println("Input Mark of Literature : ");
//        int literature = scanner.nextInt();
//        float avg;
//        avg = (math + english + literature) /3;
//        System.out.println("Average Mark of 3 Objects : " + avg);
        //Bai 5
//        System.out.println("Input radius of circle : ");
//        int radius = scanner.nextInt();
//        float perimeter,area;
//        perimeter = (float) (radius *2 *3.14);
//        area = (float) (3.14 * radius * radius);
//        System.out.println("Perimeter is : " + perimeter);
//        System.out.println("Area is : " + area);

        float ticketFee =7000F;
        System.out.println("Input your age to calculate ticket fee ");
        float age = Float.parseFloat(String.valueOf(scanner.nextFloat()));
        if(age < 6 || age >60)
        {
            ticketFee = ticketFee - ticketFee;
            System.out.println("Your ticket fee is : " + ticketFee);
        } else if (age >= 6 && age <= 18)
        {
            System.out.println("Your ticket fee is : " +ticketFee/2);
        } else {
            System.out.println("Your ticket fee is : " +ticketFee);
        }

    }
}