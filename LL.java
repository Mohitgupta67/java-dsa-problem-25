import java.util.LinkedList;

public class LL {
    public static void main(String args[]) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);

        System.out.println(list);

        list.remove(Integer.valueOf(4));

        System.out.println(list);
    }
}