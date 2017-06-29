import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


class HandshakeCalculator {
    
    private final Signal[] signals = Signal.values();    

    List<Signal> calculateHandshake(int number) {
        String binary;
        List<Signal> lista = new ArrayList<>();
        int j;
        
        binary = Integer.toBinaryString(number);
        binary = String.format("%05d", Integer.parseInt(binary));
        
        j = 0;
        for (int i = 4; i >= 1; i--) {
            if (binary.charAt(i) == '1') {
                lista.add(signals[j]);
            }
            j++;
        }
        
        if (binary.charAt(0) == '1') {
            Collections.reverse(lista);
        }
        
        return lista;                
    }   
}
