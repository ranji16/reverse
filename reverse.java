import java.util.*;
public class reversee
{
    public static void main(String[] s)
    {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        StringBuffer sb=new StringBuffer(a);
        sb.reverse();
        System.out.println(sb);
    }
}
