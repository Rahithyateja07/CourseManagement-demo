package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.models.Courses;
import com.example.demo.models.Institution;

@SpringBootApplication
public class CourseManagementApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(CourseManagementApplication.class, args);
        Institution institute = (Institution) ctx.getBean("institute");

        Scanner sc = new Scanner(System.in);
        List<Courses> list = new ArrayList<Courses>();

        int mainChoice;
        do {
            System.out.println("------MENU------");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            mainChoice = sc.nextInt();
            sc.nextLine();

            switch (mainChoice) {
                case 1:
                    Courses obj = (Courses) ctx.getBean("course");
                    list.add(obj);
                    institute.addCourse(obj);
                    System.out.println("Course added successfully!");
                    break;
                case 2:
                    System.out.print("Enter Course to Update: ");
                    String course = sc.next();
                    for (Courses objToUpdate : list) {
                        if (objToUpdate.getName().equals(course)) {
                            System.out.print("Enter new price: ");
                            objToUpdate.setFees(sc.nextInt());
                            System.out.print("Enter new duration: ");
                            objToUpdate.setDuration(sc.nextFloat());
                            System.out.println("Course updated successfully!");
                        }
                    }
                    break;
                case 3:
                    int subChoice;
                    do {
                        System.out.println("------DISPLAY------");
                        System.out.println("1. Institute Details");
                        System.out.println("2. Courses");
                        System.out.println("3. Exit");
                        System.out.print("Enter Choice: ");
                        subChoice = sc.nextInt();
                        sc.nextLine();
                        switch (subChoice) {
                            case 1:
                                System.out.println("Institute Details:");
                                System.out.println(institute);
                                break;
                            case 2:
                                System.out.println("Courses offered:");
                                for (Courses obj1 : list) {
                                    System.out.println(obj1);
                                }
                                break;
                            case 3:
                                System.out.println("Exiting to the main menu.");
                                break;
                            default:
                                System.out.println("Invalid choice. Please enter a valid option.");
                        }
                    } while (subChoice != 3);
                    break;
                case 4:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (mainChoice != 4);
        sc.close();
    }
}
