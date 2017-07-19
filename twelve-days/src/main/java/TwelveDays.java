
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwelveDays {
    
    String start = "On the ";
    String end = " day of Christmas my true love gave to me,";
    
    List<String> ordinals = new ArrayList<>(Arrays.asList("first", "second", "third",
    "fourth", "fifth", "sixth", "seventh", "eighth",
    "ninth", "tenth", "eleventh", "twelfth"));
    
    List<String> lista = new ArrayList<>(Arrays.asList(" a Partridge in a Pear Tree.\n", " two Turtle Doves, and", " three French Hens,",
    " four Calling Birds,", " five Gold Rings,", " six Geese-a-Laying,", " seven Swans-a-Swimming,", " eight Maids-a-Milking,",
    " nine Ladies Dancing,", " ten Lords-a-Leaping,", " eleven Pipers Piping,", " twelve Drummers Drumming,"));
    
    String verse(int verseNumber) {
        String result;
        
        result = start + ordinals.get(verseNumber - 1) + end;        
        for (int i = verseNumber - 1; i >= 0 ; i--) {
            result = result + lista.get(i);
        }
        return result;
    }

    String verses(int startVerse, int endVerse) {
        String result;
        
        result = "";
        for (int i = startVerse; i < endVerse ; i++) {
            result = result + verse(i) + "\n";            
        }
        result = result + verse(endVerse);
        
        return result;
    }
    
    String sing() {
        return verses(1, 12);
    }
    
    
}
