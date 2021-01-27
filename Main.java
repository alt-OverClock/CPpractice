import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int i =0 ;i < n ; i++){
            int ele  = sc.nextInt();
            arr.add(ele);
        }
        int q = sc.nextInt();
        while(q>0 ){
            String q1 = sc.next();
            if(q1.equals("Insert"))
            {
                int index = sc.nextInt();
                int value = sc.nextInt();
                arr.add(index, value);
            }
            else if (q1.equals("Delete"))
            {
                int in = sc.nextInt();
                arr.remove(in);
            }
            q--;
        }
       for(int i =0 ; i < arr.size() ; i++){
          System.out.print( arr.get(i)+" ");
       }
    }
}
