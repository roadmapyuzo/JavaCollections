import java.util.LinkedList;
import java.util.List;

public class Lists {

    public String Exercicio() {

        /// List cannot be of primitive type
        /// Null can exist in List

        ///  Fast seartch by index
        ///  Inserts can be slow
        ///  Can insert duplicate value
        List<Integer> lista = new java.util.ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        lista.remove((Integer) 30);

        int oldIndex = lista.indexOf(40);

        if (oldIndex != -1) {
            lista.set(oldIndex, 45);
        } else {
            System.out.println("There is no 40");
        }

        for (Integer i : lista) {
            System.out.println(i);
        }

        System.out.println(lista.size());

        if (lista.contains((Integer) 20)) {
            System.out.println("There is 20");
        } else {
            System.out.println("There is no 20");
        }


        ///  slow search by index
        ///  fast insert in any position
        List<String> lista2 = new LinkedList<>();

        lista2.add("Hello");
        lista2.add("World");

        lista2.remove("Hello");

        for (String s : lista2) {
            System.out.println(s);
        }

        return "Working fine";

    }

}
