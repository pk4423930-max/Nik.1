public class vowels {
    public static void main(String[] args){
        vc("Mujbe ek done bro");
    }
    static void vc(String s){
        char a;
        int count = 0;
        for(int i = 0;i < s.length();i++){
            a = s.charAt(i);
            if(a == 'a'|a == 'e'|a == 'i'|a == 'o'|a == 'u'){
                count++;
            }
        }
        System.out.println("total mumber of vowels "+count);
    }
    
}
