import java.util.List;

public class ArrayList {

    ///  Rápida busca por index
    ///  Inserções custosas pois precisa criar um novo array
    ///  Pérmite duplicatas

    public String Exercicio() {

        /// List não pode ser de tipo primitivo
        /// Null pode existir em integer
        List<Integer> lista = new java.util.ArrayList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        lista.remove((Integer) 30);

        int indexAntigo = lista.indexOf(40);

        if (indexAntigo != -1) {
            lista.set(indexAntigo, 45);
        } else {
            System.out.println("Não tem 40");
        }

        for (Integer i : lista) {
            System.out.println(i);
        }

        System.out.println(lista.size());

        if (lista.contains((Integer) 20)) {
            System.out.println("tem 20");
        } else {
            System.out.println("Não tem 20");
        }

        return "Rodou tudo";

    }

}
