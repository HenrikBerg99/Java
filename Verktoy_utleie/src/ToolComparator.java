import java.util.Comparator;

// En Comparator er et JAva-objekt som brukes til å sammenlikne og sortere objekter etter egne regler.
// Her sammenligner vi Tool-objekter først etter pris, deretter etter navn hvis prisene er like.
// Detter er en template på comparator, som kan brukes i sortering av lister med Tools.
// Eksempel på bruk:

public class ToolComparator implements Comparator<Tool> {

    public int compare(Tool t1, Tool t2) {
        int priceCompare = t2.getDailyPrice().compareTo(t1.getDailyPrice());
        if (priceCompare != 0) {
            return priceCompare; // Sorter på pris først
        }
        return t1.getName().compareTo(t2.getName()); // Hvis pris er lik, sorter på navn
    }

}
