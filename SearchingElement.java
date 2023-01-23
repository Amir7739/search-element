import java.util.Scanner;
public class SearchingElement
{
    int count=0;int se;
    public void show()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array size");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Please enter array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Array elments are");
                for(int i=0;i<a.length;i++)
                {
                    System.out.println(a[i]+" ");
                }
                   System.out.println("Enter searching elments");
                    se = sc.nextInt();
                   for(int i=0;i<a.length;i++)
                   {
                       if(a[i]==se)
                       {
                           count++;
                       }
                   }
                   if(count>0)
                   {
                       System.out.println("Item found"+count+"times");
                   }
                   else
                   {
                    System.out.println("Item Not found");   
                   }
    }
    public static void main(String[] args)
    {
        new SearchingElement().show();
    }
}