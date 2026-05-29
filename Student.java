//Encapsulation
class Student
{
    private int id;
    public void SetId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return id;
    }
    public static void main(String args[])
    {
        Student st=new Student();
        st.SetId(5);
        System.out.println(st.getId());
    }
}