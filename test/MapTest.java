/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package session05_Map.test;
import session05_Map.dto.CourseManage;
import java.util.Scanner;

public class MapTest {
    private static void menu() {
        System.out.println("--------CMS--------");
        System.out.println("1. Add");
        System.out.println("2. Show List");
        System.out.println("3. Search");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("-------------------");
    }
    public static void main(String[] args) {
        int choice;
        CourseManage cm = new CourseManage();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Enter choice:");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    cm.addCourse();
                    break;
                case 2:
                    cm.showAll();
                    break;
                case 3:
                    cm.search();
                    break;
                    case 4:
                    cm.delete();
                    break;
                case 5:
                    System.out.println("Goodbye");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 5);
    }
    

    
}
