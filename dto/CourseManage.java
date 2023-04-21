/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session05_Map.dto;

import java.util.*;
import session05_Map.entities.Course;
public class CourseManage {
    TreeMap<String,Course> map;
    Course course;
    public CourseManage() {
        map = new TreeMap<>();
    }
    
    public void addCourse(){
        course = new Course();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code");
        String code = sc.nextLine();
        course.setCode(code);
        System.out.println("Enter name");
        String name = sc.nextLine();
        course.setName(name);
        System.out.println("Enter fee");
        double fee = sc.nextDouble();
        course.setFee(fee);
        
        //Lưu khóa học vào map
        map.put(code, course);
        System.out.println("Create new course completed");
    } 
    
    public void showAll(){
        System.out.println("**********************Course List**********************");
        Set<String> set = map.keySet();
        if(map.isEmpty()){
            System.out.println("Course List is empty");
        }else{
            for (String key : set) {
                System.out.println(map.get(key).toString());
            }
        }
        System.out.println("*******************************************************");
    }
    //search by code
    public void search(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code to search");
        String code = sc.nextLine();
        if(map.containsKey(code)){
            System.out.println("------------------Course LIST------------------");
            System.out.println(map.get(code).toString());
        }else{
            System.out.println("Course not found");
        }
    }
    public void delete(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter code to delete");
        String code = sc.nextLine();
        if(map.containsKey(code)){
            map.remove(code);
            System.out.println("Delete completed");
        }else{
            System.out.println("Course not found");
        }
    }
}
