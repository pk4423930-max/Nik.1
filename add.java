
public class add { 
    public static void main(String[] args) { 
        int[] numbers = {10, 20, 30, 40, 50}; 
        int sum = 0; 
        
        System.out.println("Array elements:"); 
        for(int num : numbers){ 
            sum += num; 
            System.out.print(num + " "); 
        } 
        System.out.println("\n\nSum of array elements: " + sum); 
    } 
}
