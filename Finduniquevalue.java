
import java.util.LinkedHashSet;

public class Finduniquevalue {
    public static void main(String[] args) {
        int array[]={10,20,30,20,50,40,40,80};
        LinkedHashSet<Integer> number=new LinkedHashSet();
        for(int c:array){
            number.add(c);
        }
        for(int a:number)
        System.out.println(a);
    }
}
