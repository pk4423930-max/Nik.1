public class TryCatchDemo {
    public static void main(String[] args){
        int solution = 0;
        try {
             solution = 2/0;
             System.out.println(solution);
    }
        
        catch(Exception e){
            System.out.println("Exception occured:");
            System.out.println("divide by zero stupid");
        }finally{
            System.out.println("clean up code executed here");
        }
        
    }
}
