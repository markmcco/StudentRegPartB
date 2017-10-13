/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.student_reg_partb;

import com.mycompany.student_registration_system.Course;
import com.mycompany.student_registration_system.Module;
import com.mycompany.student_registration_system.Student;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author MMC
 */
public class Driver {
    
    static ArrayList<Module> courseModules = new ArrayList<Module>();
    static ArrayList<Student> courseStudents = new ArrayList<Student>();

    public static void main(String [] Args) {
        
        // add students to modules
        courseStudents.add(new Student("Mick", "14379557"));
        courseStudents.add(new Student("Sean", "14336823"));
        courseStudents.add(new Student("Eoin", "143483778"));
        courseStudents.add(new Student("Josh", "143293683"));

        // add modules to course
        courseModules.add(new Module("ct417"));
        courseModules.add(new Module("ct404"));
        courseModules.add(new Module("ct416"));
        courseModules.add(new Module("ct413"));
        
        DateTime start = new DateTime(2016,10,05,0,0,0);
        DateTime end = new DateTime(2017,12,16,0,0,0);
        
        Course csit;
        csit = new Course("Computer Science & Information Technology", "BCT" , start, end);
        
        csit.setModules(courseModules);

        for(Student s : courseStudents) csit.registerStudent(s);

        for(Student s : courseStudents) {
            System.out.println(
                    "Student Details:\n----------------\n" + s +
                    "\nCourse Details: " + s.getCourse() +
                    "\nModules: " + s.getModules() + "\n"
            );
        }
    }
    
}
