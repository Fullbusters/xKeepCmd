package views;

import models.Teacher;

/**
 * виводдить список вчителів
 */
public class TeacherView {
    /**
     * виводить список студентів
     */
    public void outListTeacher(Teacher[] listTeacher){
        for (Teacher teach: listTeacher){
            System.out.println(teach);
        }
    }

}
