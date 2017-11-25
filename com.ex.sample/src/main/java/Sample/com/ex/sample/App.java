package Sample.com.ex.sample;

/**
 * Hello world!
 *
 */
public class App 
{
	public int add(int a, int c) {
		int d=a+c;
		return d;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App a=new App();
        System.out.println(a.add(10, 20));
       
    }
}
