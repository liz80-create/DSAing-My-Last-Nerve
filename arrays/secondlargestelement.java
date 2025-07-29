package arrays;

public class secondlargestelement {
    public static void main(String[] args) {
         int[] numbers = {5, 2, 9, 1, 2400, 6,100}; 
         int max=numbers[0];
         for(int i=0;i<numbers.length;i++){
            
            if(max<numbers[i]){
                max=numbers[i];
            }
         }
         System.out.println("MAX 1 : "+ max);
         int max2=numbers[0];
         for(int i = 0;i<numbers.length;i++){
            
            if(numbers[i] != max && numbers[i] > max2){
                System.out.println("max: "+ max);
                
                max2=numbers[i];
                System.out.println("max2: "+ max2);
            }
           
         }
          System.out.println(max2);
        
    }
}
