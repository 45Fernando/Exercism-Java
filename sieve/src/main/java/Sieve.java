import java.util.ArrayList;
import java.util.List;    

class Sieve {    
    
    private final int maxPrime;
    private final List<Integer> lista = new ArrayList<>();
    
    Sieve(int maxPrime) {
        
        this.maxPrime = maxPrime;
    }

    List<Integer> getPrimes() {
        int i, band, j;
        int [] arrayPrimes = new int[maxPrime + 1];
        
        i = 2;
	band = 0;
        arrayPrimes = createArray();
	while(i <= maxPrime  && band == 0){
            for (j = i + i; j <= maxPrime; j = j + i){			
                    arrayPrimes[j] = 1;
            }		
            i++;
            
            while (i <= maxPrime && arrayPrimes[i] != 0 ){
			i++;
		}
            
            if (Math.pow(i, 2) > maxPrime){
                    band = 1;
            }		
	}
        
        for ( i = 2; i <= maxPrime; i++) {
            if (arrayPrimes[i] == 0) {
                lista.add(i);
            }
        }
        
        return lista;
    }
    
    private int[] createArray(){
        int[] newArray = new int[maxPrime + 1];
        
        for (int i = 1; i <= maxPrime; i++) {
            newArray[i] = 0;
        }
        
        return newArray;
    }
}
