package controllers;

import models.Teacher;
import views.TeacherView;

/**
 * виводить список вчителів
 *
 */
public class TeachersController {
    /**
     * виводить список вчителів
     *
     */
    public void listTeacher(){
        Teacher Teacher1=new Teacher("name1","surname1");
        Teacher Teacher2=new Teacher("name2","surname2");
        Teacher Teacher3=new Teacher("name3","surname3");
        Teacher Teacher4=new Teacher("name4","surname4");
        TeacherView teacherView=new TeacherView();
        Teacher[] teach={Teacher1,Teacher2,Teacher3,Teacher4};
        teacherView.outListTeacher(teach);
    }
}
