/*You are conducting a contest at your college. This contest consists of two problems and  participants. You know the problem that a candidate will solve during the contest.

You provide a balloon to a participant after he or she solves a problem. There are only green and purple-colored balloons available in a market. Each problem must have a balloon associated with it as a prize for solving that specific problem. You can distribute balloons to each participant by performing the following operation:

Use green-colored balloons for the first problem and purple-colored balloons for the second problem
Use purple-colored balloons for the first problem and green-colored balloons for the second problem
You are given the cost of each balloon and problems that each participant solve. Your task is to print the minimum price that you have to pay while purchasing balloons.*/
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
