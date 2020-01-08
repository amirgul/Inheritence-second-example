public class Undergraduate extends Student
{
    private int level;
    public Undergraduate()
    {
        super();
        level = 1;
    }
    public Undergraduate(String inititalName, int initialStudentNumber, int initialLevel)
    {
        super(inititalName, initialStudentNumber);
        level = initialLevel;
    }
    public void reset(String newName, int newStudentNumber, int newlevel)
    {
        setName(newName);
        setStudentNumber(newStudentNumber);
        setLevel(newlevel);
    }
    public void setLevel(int newLevel)
    {
        if((1 <= newLevel)&&(newLevel <= 4))
        {
            level = newLevel;
        }
        else
        {
            System.out.println("Wrong parameter enter for level");
            System.exit(0);
        }
    }
    public void writeOutput()
    {
        System.out.println("name: " + getName());
        System.out.println("studentNumber: " + getStudentNumber());
        System.out.println("level: " + level);
    }
    public boolean equals(Undergraduate otherUndergraduate)
    {
        return super.equals(otherUndergraduate) &&
        (this.level == otherUndergraduate.level);
    }


}
