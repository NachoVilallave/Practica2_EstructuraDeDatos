import java.util.*;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class Practica2 {
    public static boolean equivalentes(List<String> l1, List<String> l2) {
        if (l1.size() != l2.size()) {
            return false;
        }
        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            String texto = it.next();
            int c1 = 0;
            Iterator<String> it1 = l1.iterator();
            while (it1.hasNext()) {
                if (it1.next().equals(texto)) {
                    c1++;
                }
            }
            int c2 = 0;
            Iterator<String> it2 = l2.iterator();
            while (it2.hasNext()) {
                if (it2.next().equals(texto)) {
                    c2++;
                }
            }
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static void invierte(ListIterator<String> iter) {
        while (iter.hasPrevious()) {
            iter.previous();
        }

        List<String> aux = new ArrayList<>();
        while (iter.hasNext()) {
            aux.add(iter.next());
        }

        for (int i = 0; i < aux.size(); i++) {
            iter.previous();
            iter.set(aux.get(i));
        }
    }

    public static  List<Integer> ordenar(List<Integer> l1) {
        List<Integer> resultado = new ArrayList<>();

        for (Integer num : l1) {
            int pos = 0;
            while (pos < resultado.size() && resultado.get(pos) <= num) {
                pos++;
            }
            resultado.add(pos, num);
        }

        return resultado;
    }

    public static<T> List<T> detectarAlternancia (ListIterator<T> iter) {
        List<T> resultado = new ArrayList<>();


    }

}
