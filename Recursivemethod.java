public class Recursivemethod {
    public static void main(String[] args){
        printNums(100);
    }
    static void printNums(int num){
        if(num == 0){
            return;
        }
        printNums(num-1);
        System.out.println(num);
        //printNums(num-1);
    }
    
}
