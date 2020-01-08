public class Student extends Person
{
    private int studentNumber;
    public Student()
    {
        super();
        studentNumber = 0;
    }
    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);
        studentNumber = initialStudentNumber;
    }

    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);
        studentNumber = newStudentNumber;
    }
    public void setStudentNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }
    public int getStudentNumber()
    {
        return studentNumber;
    }
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("StudentNumber: " + studentNumber);
    }


    public boolean equals(Object obj)
    {
        boolean isEqual = true;
        if((obj != null)&&(obj instanceof Student))
        {
            Student otherStudent = (Student)obj;
            isEqual = hasSameName(otherStudent)&& this.studentNumber == otherStudent.studentNumber;

        }
        return isEqual;
    }

    public String getName(String title)
    {
        return title + getName();
    }
    public String toString()
    {
        return "name: " + getName() + "\n StudentNumber: " + getStudentNumber();
    }
}
