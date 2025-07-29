package arrays;

public class arraysortedcheck {
    
   static boolean isSorted(int arr[], int n) {
    for (int i = 1; i < n; i++) {
      if (arr[i] < arr[i - 1])
        return false;
    }

    return true;
  }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,5};
        System.out.println(isSorted(numbers,numbers.length));
        
        }

    }
    

