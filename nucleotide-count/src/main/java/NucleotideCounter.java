
import java.util.HashMap;
import java.util.Map;

class NucleotideCounter{

    String nucleo;
    String nucleotides = "ACGT";
    
    public NucleotideCounter(String nucleo) {
        this.nucleo = nucleo;
    }
    
    public int count(char c){
        int cont;
        
        if (nucleotides.indexOf(c) == -1) {
            throw new IllegalArgumentException();
        }
        
        cont = 0;
        for (int i = 0; i < nucleo.length(); i++) {
            if (c == nucleo.charAt(i)) {
                cont++;
            }
        }
        
        return cont;
    }
    
    public Map<Character, Integer> nucleotideCounts(){
        Map<Character, Integer> mapa = new HashMap<>();
        char tmp;
        
        for (int i = 0; i < nucleotides.length(); i++) {
            tmp = nucleotides.charAt(i);
            mapa.put(tmp, count(tmp));
        }
        
        return mapa;
    }
    
}