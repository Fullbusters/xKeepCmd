package controllers;

import models.GroupName;
import models.Student;
import views.GroupView;

import java.util.Scanner;

/**
 * виводить список студентів групи
 */
public class GroupStudentsController {

    /**
     * Виводить список студентів
     */
    public void listGroup(){
        GroupName groupNames1 = new GroupName("Java Starter", 12);
        GroupName groupNames2 = new GroupName("C# Starter", 12);
        GroupName groupNames3 = new GroupName("JavaScript Starter", 12);
        GroupView groupView = new GroupView();
        GroupName[] lgr = {groupNames1, groupNames2, groupNames3};
        groupView.outGroupName(lgr);
    }

    public void listStudents(){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Введіть назву групи:");
        String cmd = inputDevice.nextLine();
        Student student1 = new Student("Andriy1", "Johnson1", 26);
        Student student2 = new Student("Andriy2", "Johnson2", 27);
        Student student3 = new Student("Andriy3", "Johnson3", 28);
        Student student4 = new Student("Andriy4", "Johnson4", 29);
        GroupView groupView = new GroupView();
        Student[] listStudent = {student1, student2, student3, student4};
        if(cmd.equals("Java Starter")){
            groupView.outListStudents(listStudent);
        }
    }

}
