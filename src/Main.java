import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
//        Student s = new Student("ahad", 1234);
//        Undergraduate u = new Undergraduate("bilal", 1234, 1);
//        compare(s,u);

//        Person p = new Person("ahad");
//        Undergraduate u = new Undergraduate();
//        u.setName("ahad");
//        if(p.hasSameName(u))
//            System.out.println("they have same name");
//        else
//            System.out.println("Different names");

//        Student s = new Student();
//        Student other = new Student("joe", 7777);
//        if(s.hasSameName(other))
//            System.out.println("Wow");
//        else
//            System.out.println("Names are different");

//
//        Student joe = new Student("Joe Student", 2001);
//        System.out.println(joe);
        Person[] people = new Person[4];
        people[0] = new Undergraduate("Cotty many", 4910, 1);
        people[1] = new Undergraduate("Kick Anita", 9931, 2);
        people[2] = new Student("Robin", 8812);
        people[3] = new Undergraduate("Bug", 9901, 4);

        for(int i = 0; i<people.length; i++)
        {
           System.out.println(people[i]);

        }







    }
    public static void compare(Student s1, Student s2)
    {
        if(s1.getStudentNumber() == s2.getStudentNumber())
        {
            System.out.println(s1.getName()+" has a same number as "+ s2.getName());
        }
        else
            System.out.println("they are different");
    }
}
