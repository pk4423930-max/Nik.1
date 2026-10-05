import java.util.ArrayList;
public class ArraylistDemo{
    public static void main(String[] args){
    ArrayList<String> nameList = new ArrayList<String>();
    nameList.add ("batman");
    nameList.add ("black panther");
    nameList.add ("Spiderman");


    System.out.println(nameList.get(1));
    for(int i = 0;i<nameList.size();i++){
        System.out.println(nameList.get(i));
    }

    }
}