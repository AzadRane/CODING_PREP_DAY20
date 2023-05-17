abstract class A 
{
    void f1()
    {
        System.out.println("I am f1");
    }

    abstract void f2();
    abstract void f3();
}

class B extends A 
{
    void f2()
    {
        System.out.println("I am abstract class of A but defination written in B");
    }
    void f3()
    {
        System.out.println("As this class is not abstract this should implement all the abstract methods and if i declare this class as abstrat then it is fine to not implement,.");
    }    

    void f4()
    {
        System.out.println(" i am non abstract method hui hui hui");
    }
}

public class AbstractClassDemo
{
    public static void main(String args[])
    {
        A ob = new B();

        ob.f1();
        ob.f2();
        //ob.f4();  this will not work as reference variable limit is over

        B ob1 = new B();

        ob1.f4();
    }
}