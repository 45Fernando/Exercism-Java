
import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {        
        String unicos = new String();         
        Set<Character> conjunto = new HashSet<>();
        
        if(!"".equals(input)) {       
            input = sanitize(input);
            conjunto = armarSet(input);
            unicos = armarString(conjunto);            
            
            return unicos.length() == 26;
        }else{
            return false;
        }
    }
    
    public Set<Character> armarSet(String input){
        char[] cadena;        
        Set<Character> conjunto = new HashSet<>();
        
        cadena = input.toCharArray();
        for (char c : cadena) {
            conjunto.add(c);
        }
            
        return conjunto;
    }
    
    public String armarString(Set<Character> conjunto){
        StringBuilder sbuilder = new StringBuilder();
        
        for (Character character : conjunto) {
            sbuilder.append(character);
        }
        
        return sbuilder.toString();
    }
    
    public String sanitize(String input) {  
        input = input.toLowerCase();        
        input = input.replaceAll("[^a-z]", "");        
        
        return input;
    }
    
      public boolean isPangram2(String input) {
        Set<Character> charSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
                charSet.add(c); 
        }

        input = input.toLowerCase(); 
        for (int i = 0; i < input.length(); i++) {
                charSet.remove(input.charAt(i)); 
        }

        if (charSet.isEmpty()) 
                return true; 
        else 
                return false;
    }

}
