import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    ///  does not maintain order of insertion
    /// all sets does not accept duplicates
    /// search with contains is O(1)
    Set<Integer> set1 = new HashSet<>();

    /// sorts the itens
    Set<Integer> set2 = new TreeSet<>();

    ///  maintain order of insertion
    Set<Integer> set3 = new LinkedHashSet<>();

    public void Exercicio() {

        set1.add(10);
        set1.add(20);
        set1.add(20);
        set1.add(30);

        for (Integer i : set1) {
            System.out.println(i);
        }

        set1.add(40);

        for (Integer i : set1) {
            System.out.println(i);
        }



        System.out.println("Working fine");

        set2.add(40);
        set2.add(35);
        set2.add(60);

        for (Integer i : set2) {
            System.out.println(i);
        }

        System.out.println("Working fine");

        set3.add(40);
        set3.add(35);
        set3.add(60);

        for (Integer i : set3) {
            System.out.println(i);
        }

        set3.add(45);

        for (Integer i : set3) {
            System.out.println(i);
        }



    }

}
