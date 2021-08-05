package increment;

public class incrementeg {
    public static void main(String arg[])
    {
        int x=6;
        System.out.println(x);
        x++;
        System.out.println(x);
        x=++x;
        System.out.println(x);
        x=x++;
        System.out.println(x);
        x += ++x;
        System.out.println(x);
    }
}
