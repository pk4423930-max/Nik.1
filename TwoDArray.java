public class TwoDArray{
    public static void main(String[] args){
        td();
    }
    static void td(){
        int a[][] = new int [8][8];
        int k = 1;
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                a[i][j] = k;
                System.out.print(a[i][j]+" ");
                k++;
            }
            System.out.println();
        }
    }
    
    
}