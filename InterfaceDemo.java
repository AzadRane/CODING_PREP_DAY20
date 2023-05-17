interface A 
{
    public int i=0;
    public abstract void display();

}


class B implements A 
{
    public void display()
    {
        System.out.println(i);
    }
}
public class InterfaceDemo {
    public static void main(String args[])
    {
        B ob = new B();
        ob.display();
    }
}
