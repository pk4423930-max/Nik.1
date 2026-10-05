
public class Arrays { 
    public static void main(String[] args){ 
        int sum = 0; 
        int num[] = {5, 13, 16, 19, 12, 1}; 
        
        for(int i = 0; i < num.length; i++){ 
            sum += num[i]; 
        } 
    
        System.out.println("Mean is " + ((double)sum / num.length) + "\n" + "sum is " + sum + "\n"); 
    }
}