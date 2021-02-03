import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while(test!=0)
        {
            int count1=0;
            int count2=0;
            int cost1=0,cost2=0;
            int costpurple =sc.nextInt();
            int costgreen =sc.nextInt();
            int number = sc.nextInt();
            for(int i =0 ; i <number; i++)
            {
                int n1= sc.nextInt();
                int n2 =sc.nextInt();
                cost1=cost1+(n1*costpurple)+(n2*costgreen);
                cost2=cost2+(n1*costgreen)+(n2*costpurple);
            }
            if(cost1<cost2)System.out.println(cost1);
            else System.out.println(cost2);

            test--;

        }
    }
}
