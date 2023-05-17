interface a 
{
    abstract void sayhi();
}

class b
{
    a ob = new a()
    {
        public void sayhi()
         {
            System.out.println("hiii");
        }
    };
}
public class AnnonymusInnerClassD1 {
    public static void main(String args[])
    {
        
    b ob = new b();

    ob.ob.sayhi();
    }

}
