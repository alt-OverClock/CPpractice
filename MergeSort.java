public class MergeSort {
    void merge(int Arr[] , int start , int middle , int end )
    {
        int temp[] = new int[end-start+1];              //temporary array to store
        int i = start , j = middle + 1 , k =0 ;         // crawler for every instance
        while(i<=middle && j <= end)                    // traverse both i and j and put smaller element in temp
        {
            if(Arr[i]<=Arr[j])
            {
                temp[k]=Arr[i];
                k+=1; i+=1;
            }
            else
            {
                temp[k] = Arr[j];
                k+=1 ; j+=1 ;
            }
        }
        while(i<=middle)
        {
            temp[k]=Arr[i];
            k+=1;i+=1 ;
        }
        while (j<=end)
        {
            temp[k]=Arr[j];
            k+=1;j+=1 ;
        }
        for( i = start ; i <=end ; i++){
            Arr[i]= temp[i-start];
        }
    }
    void mergesort(int Arr[], int start , int end )
    {
        if(start<end)
        {
            int middle = (start+end)/2;
            mergesort( Arr , start , middle);
            mergesort(Arr, middle+1 , end );
            merge(Arr , start , middle , end );

        }
    }

}
