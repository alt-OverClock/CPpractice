public class main {
    public static void main(String[] args){
        int array[] = {8,2,3,4,1,3,2} ;
        int Arr[] = {14,7,3,12,9,11,6,2 };
        int start = 0 ; end = Arr.length-1;
        InsertionSort s = new InsertionSort();
        MegreSort m = new MergeSort();
        s.sort(array);
        m.mergesort(Arr, start , end);
        System.out.println("Insertion Sort");
        for(int i =0 ; i < array.length ; i++){
            System.out.print(" "+array[i]);
             System.out.println("Merge Sort");
        for(int i =0 ; i < Arr.length ; i++){
            System.out.print(" "+Arr[i]);
        }
    }
}
