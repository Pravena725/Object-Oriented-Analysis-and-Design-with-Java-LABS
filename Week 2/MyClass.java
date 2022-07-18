import java.util.*;
class IntList
{
    List<Integer> list = new ArrayList<>(5); 
    void add(int n)
    {
        if(list.size() <= 5)
        {
            list.add(n);
        }
        else
        {
            System.out.println("List already FULL !!\n");
        }
        
        
    }
}

class SortedintList extends IntList
{
    //List<Integer> list = new ArrayList<>(10); 
    void add(int n)
    {
        if(list.size() <= 5 )
        {
            list.add(n);
            Collections.sort(list);
        }
        if(list.size() == 5)
        {
            System.out.println("list = " + list);
        }
        
        
    }
}

public class MyClass {
    public static void main(String args[]) {
      Scanner in = new Scanner(System.in);
      SortedintList obj = new SortedintList();
      int n, ch=1;
      do
      {
          System.out.println("enter element\n");
          n = in.nextInt();
          obj.add(n);
          ch=ch+1;
      }while(ch<=5);
      
    }
}