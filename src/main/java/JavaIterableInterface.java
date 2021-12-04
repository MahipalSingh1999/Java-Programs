import java.util.*;
public class JavaIterableInterface {
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.forEach(element -> System.out.println(element));

    }

}

