
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DiamondPrinter{
    
    public List<String> printToList(char letter){
        List<String> lista = new ArrayList<>();       
        char firstLetter = 'A';
        int midspaces, spaces, posiD, posiI, dist;
        String cadena = "";           
       
        dist= (letter - firstLetter) * 2 + 1;
        lista = initLista(dist);
        
        posiD = dist / 2;
        posiI = posiD;
        spaces = 0;
        midspaces = dist - 2;
        
        if (letter != firstLetter) {
            cadena = String.join("", Collections.nCopies(spaces, " ")) + letter + String.join("", Collections.nCopies(midspaces, " ")) + letter + String.join("", Collections.nCopies(spaces, " "));
            spaces = spaces + 1;
            midspaces = midspaces - 2;
            letter = (char) (letter - 1);
            lista.set(posiI, cadena);
        }        
        
        for (int i = letter; i > firstLetter; i--) {            
            cadena = "";
            cadena = String.join("", Collections.nCopies(spaces, " ")) + (char) i + String.join("", Collections.nCopies(midspaces, " ")) + (char) i + String.join("", Collections.nCopies(spaces, " "));
            posiD = posiD + 1;
            posiI = posiI - 1;
            lista.set(posiD, cadena);
            lista.set(posiI, cadena);
            midspaces = midspaces - 2;
            spaces = spaces + 1;
        }
        
        cadena = "";
        cadena = String.join("", Collections.nCopies(spaces, " ")) + (char) firstLetter + String.join("", Collections.nCopies(spaces, " "));
        lista.set(0, cadena);
        lista.set(dist - 1, cadena);     
        
        return lista;
    }
    
    public List<String> initLista(int dist){
        List<String> lista = new ArrayList<>();
        
        for (int i = 0; i < dist; i++) {
            lista.add("");
        }
        
        return lista;
    }
}