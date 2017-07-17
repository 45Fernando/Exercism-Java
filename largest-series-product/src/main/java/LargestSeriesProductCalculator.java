public class LargestSeriesProductCalculator {
    private final String cadena;

    public LargestSeriesProductCalculator(String cadena) {
        checkString(cadena);
        this.cadena = cadena;
    }

    public long calculateLargestProductForSeriesLength(int cantidad){
        long acumulate, mayor;
        int i, j, cont;
        
        checkCantidad(cantidad);
        checkLength(cantidad);
        
        mayor = assignMayor(cantidad);            
        for (i = 0; i < cadena.length(); i++) {
            acumulate = 1;
            cont = 1;                
            j = i;
            while(cont <= cantidad && j < cadena.length()){
                acumulate = acumulate * Character.getNumericValue(cadena.charAt(j));
                j++;
                cont++;
            }
            if(acumulate > mayor && cont - 1 == cantidad){
                mayor = acumulate;
            }
        }
        return mayor;
    }    
    
    private int assignMayor(int cantidad){
        if (cadena.isEmpty() || cantidad == 0) {
            return 1;
        }else{
            return 0;
        }
    }
    
    private void checkCantidad(int cantidad){
        if (cantidad < 0) {
            throw new IllegalArgumentException("Series length must be non-negative.");
        }
    }
    
    private void checkString(String cadena){        
        if (cadena == null) {
            throw new IllegalArgumentException("String to search must be non-null.");
        }
        if (!cadena.matches("[0-9]+") && !cadena.isEmpty()) {
            throw new IllegalArgumentException("String to search may only contains digits.");
        }
    }

    private void checkLength(int cantidad){
        if (cantidad > cadena.length()){
            throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        }
    }
}
