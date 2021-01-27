public class main {
    public static void main(String[] args){
        int array[] = {8,2,3,4,1,3,2} ;
        InsertionSort s = new InsertionSort();
        s.sort(array);
        for(int i =0 ; i < array.length ; i++){
            System.out.print(array[i]);
        }
    }
}
