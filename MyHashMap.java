import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {
        HashMap value=new HashMap();
        value.put("1","one");
        value.put(2,"two");
        System.out.println(value);
        System.out.println(value.containsValue("two"));
        System.out.println(value.containsKey("1"));
    }
}
