public class Simplecalculator {
    public static void main(String[] args){
        System.err.println(cal('a',2,3));
    }
    static int cal(char a,int b,int c){
        switch (a) {
            case  'a':
                return b+c;
                
            case 's':
                return b-c;
            
            case 'm':
                return b*c;

            case 'd':
                return b/c;

            default:
                System.out.println("enter correctly as mentioned \nAddition--->'a'\nSubtraction--->'s'\nMultiplication--->'m'\nDivision--->'d'");
                return 0;

        }
        
    }

    
    
}
