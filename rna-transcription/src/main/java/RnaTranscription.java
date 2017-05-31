public class RnaTranscription {
    String s;

    public RnaTranscription() {
        s = "";
    }
    
    
    public String transcribe(String dnaStrand) {
        String lista[] = dnaStrand.split("");
        int tam = dnaStrand.length();
        
        for (int i = 0; i < tam; i++) {
            switch(lista[i]){
                case "G":  s += "C";
                     break;
                case "C":  s += "G";
                     break;
                case "T":  s += "A";
                     break;
                case "A":  s += "U";
                     break;     
            }
        }
        
        return s;
    }
}