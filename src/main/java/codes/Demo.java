package codes;

/**
 * Created by vikas.kumar1 on 21-07-2017.
 */
public class Demo {
    public static void main(String[] args)
    {
        try
        {
            int i = Integer.parseInt("abc");
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        finally
        {
            System.out.println("This will be always executed");
        }
    }
}
