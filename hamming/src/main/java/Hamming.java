public class Hamming {
    
    String cadena1[];
    String cadena2[];
    int tam;
    int cont;

    Hamming(String leftStrand, String rightStrand) {
        if (check(leftStrand, rightStrand)) {
            cadena1 = leftStrand.split("");
            cadena2 = rightStrand.split("");
            tam = leftStrand.length();
            cont = 0;
        }else{
            throw new IllegalArgumentException();
        }        
    }

    int getHammingDistance() {
        for (int i = 0; i < tam; i++) {
            if (!cadena1[i].equals(cadena2[i])) {
                cont++;
            }
        }
        
        return cont;
    }
    
    boolean check(String cadena1, String cadena2){
        return cadena1.length() == cadena2.length();
    }
}
