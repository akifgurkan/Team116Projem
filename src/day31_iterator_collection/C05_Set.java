package day31_iterator_collection;

import java.util.HashSet;
import java.util.Set;

public class C05_Set {
    public static void main(String[] args) {
        Set<String> sinifList = new HashSet<>();
        sinifList.add("Sara");
        sinifList.add("Sevda");

        System.out.println(sinifList);

        sinifList.add("Sevda");

        System.out.println(sinifList);

    }
}
