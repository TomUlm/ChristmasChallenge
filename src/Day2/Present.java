package Day2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Present {
    /**
     * Mikołaj postanowił w tym roku skorzystać z pomocy nowoczesnych technologii.
     * Zamiast zastanawiać się, komu jaki prezent dostarczyć postanowił skorzystać z programu.
     * Pomoż Mikołajowi!
     * Przygotuj kod, który z listy dostępnych prezentów wylosuje 3 prezenty i wypisze na ekranie.
     * Odpal program kilka razy - sprawdź, czy na pewno losuje za kazdym razem inne prezenty!
     * Wylosowane prezenty wypisz na ekranie. Zadbaj o to, żeby wylosowane prezenty były unikalne.
     */

    public static void main(String[] args) {

        List<String> ideas = List.of(
                "Perfume", "Socks", "Sweater", "Cup",
                "Hat", "Tea", "Coffee", "Clock", "Bag",
                "Book", "Wallet", "Cream", "Earrings");

        var uniqueGifts = getUniqueGifts(ideas);
        System.out.println("Unique gifts: " + uniqueGifts);
    }

    private static List<String> getUniqueGifts(List<String> gifts) {

        Random rand = new Random();
        return rand.ints(0, gifts.size())
                .distinct()
                .limit(3)
                .mapToObj(i -> gifts.get(i))
                .collect(Collectors.toList());
    }
}
