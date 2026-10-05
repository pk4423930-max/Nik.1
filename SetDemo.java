import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
    
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); 
        System.out.println("Elements in the set:");
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}