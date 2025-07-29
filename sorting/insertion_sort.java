package sorting;
public class insertion_sort{
    public static void main(String[] args) {
         int[] numbers = {5, 2, 9, 1, 6}; 
         for(int i =0;i<numbers.length;i++){
            int current = numbers[i];
            int j=i-1;
           while(j>=0 && numbers[j]>current){
            numbers[j+1]=numbers[j];
            j--;
           
        }
        numbers[j+1]=current;
         }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
/* [5, 2, 9, 1, 6]
2,5,9,1,6
2,5,9,1,6 
2,5,1,9,6
2,1,5,9,6
1,2,5,9,6
1,2,5,6,9
*/