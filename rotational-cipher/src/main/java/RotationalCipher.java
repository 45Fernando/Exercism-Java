
import java.util.Arrays;

class RotationalCipher{

    int rot;
    
    public RotationalCipher(int rot) {
        this.rot = rot;
    }
    
    public String rotate(String word){
        char[] lista = word.toCharArray();               
       
        for (int i = 0; i < lista.length; i++) {
            if(lista[i] >= 'a' && lista[i] <= 'z'){                
                lista[i] = (char) returnCodePoint(lista[i], 97);
            }else if(lista[i] >= 'A' && lista[i] <= 'Z'){
                lista[i] = (char) returnCodePoint(lista[i], 65);
            }
        }
        
        return String.valueOf(lista);
    }
    
    int returnCodePoint(char c, int startC){
        int codepoint;
        
        codepoint = (int) c;
        codepoint = (codepoint - startC + rot) % 26;
        codepoint = codepoint + startC;
        
        return codepoint;
    }
    
}