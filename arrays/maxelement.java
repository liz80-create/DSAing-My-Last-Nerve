package arrays;

public class maxelement {
    
    public static void main(String[] args) {
         int[] numbers = {5, 2, 9, 1, 2400, 6,100}; 
         int max=numbers[0];
         for(int i=0;i<numbers.length;i++){
            
            if(max<numbers[i]){
                max=numbers[i];
            }
         }
         System.out.println(max);
    }
}
