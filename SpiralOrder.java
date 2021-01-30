public class SpiralOrder {
    public static void  spiral(int Arr[][],int m , int n)
    {
        int t =0 , b = m-1 , l =0 , r = n-1 ;
        int dir=0;
        while(t<=b && l <=r )
        {
            if(dir ==0 ){
                for(int k =l ; k <=r ; k++)System.out.print(Arr[t][k]+" ");
                t++;
            }
            else if (dir==1 ){
                for(int k =t ; k <=b; k ++)System.out.print(Arr[k][r]+" ");
                r-- ;
            }
            else if ( dir ==2 )
            {
                for(int k =r ; k>= l ; k--)System.out.print(Arr[b][k]+" ");
                b--;
            }
            else if ( dir == 3 )
            {
                for(int k = b ; k>=t ; k--)System.out.print(Arr[k][l]+" ");
                l++;
            }
           dir = (dir+1)%4;
        }
    }

}
