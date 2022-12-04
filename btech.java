import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class btech {

    public static Map<String, ArrayList<String>> hma = new HashMap();
    public static Map<String, String> hmb = new HashMap();

    public static void main(String[] args) {

        btech school = new btech();

        // adding subject and faculty
        hmb.put("Maths", "Parvez sir");
        hmb.put("DSA", "Jasmine mam");
        hmb.put("Java", "Hilda mam");
        hmb.put("English", "Meenakshi mam");

        school.regStud(" Raj");
        school.regStud(" Aditya");
        school.regStud(" Arya");

        school.addC("Rose", "Maths");
        school.addC("Rose", "DSA");
        school.addC("Rose", "Java");
        school.addC("Rose", "English");

        school.addC("Monica", "Maths");
        school.addC("Monica", "DSA");
        school.addC("Monica", "Java");

        school.addC("Joey", "Maths");
        school.addC("Joey", "Java");

        System.out.println("displaying the hm1 map ");
        
         for (String name : hma.keySet())  {
             System.out.println("Student: " + name);
             ArrayList<String> list=hma.get(name);
             for(String sub:list) {
                 System.out.println("Subject: " + sub);
             }
        
         }
        System.out.println("displaying the hm2 map ");
        System.out.println("Subject :   faculty : ");
         for (String sub : hmb.keySet())  {
             System.out.println(sub+ " -" +hmb.get(sub));
            
         }

        
        //printing all the details about rose
        System.out.println("Faculties who Teach Rose ");
        ArrayList<String> subjectList=hma.get("Rose");
        for(String sub :subjectList) {
            System.out.println(hma.get(sub));
            
             
        }
        
        // removing student
        school.removeStudent("Rose");
        
        
        System.out.println("displaying the hm1 map  after Rose removed");
         for (String name : hma.keySet())  {
             System.out.println("Student: " + name);
             ArrayList<String> list=hma.get(name);
             for(String sub:list) {
                 System.out.println("Subject: " + sub);
             }
        
         }
    }

    public void regStud(String name) {
        if (hma.get(name) == null) {

            System.out.println("Student" + name + " registered");
            hma.put(name, new ArrayList<String>());
        } else {
            System.out.println("Student already registered under this name, chose another name");
        }

    }

    public void addC(String name, String course) {

        if (hma.get(name) == null) {
            System.out.println("Student not registered");
        } else {
            ArrayList courseList = hma.get(name);
            if (courseList.size() >= 3) {
                System.out.println("Student already registered for max courses");
            } else {
                if (hmb.get(course) == null) {
                    System.out.println("course unavailable");

                } else {
                    courseList.add(course);
                    hma.put(name, courseList);
                    System.out.println("course Registered");
                }

            }
        }

    }

    public void removeStudent(String name) {
        if (hma.get(name) == null) {
            System.out.println("Student not registered");
        } else {

            System.out.println("Student " + name + " removed");
            hma.remove(name);
        }

    }

}