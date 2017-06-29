class RaindropConverter {

    String result;
    int factors[] = {3, 5, 7};
    String words[] = {"Pling", "Plang", "Plong"};        
    
    public RaindropConverter() {
        this.result = "";
    }

    
    String convert(int number) {
        int band = 0;
        
        for (int i = 0; i < 3; i++) {
            if (number % factors[i] == 0) {
                band = 1;
                result += words[i];
            }
        }
        
        if (band == 0) {
            result += number;
        }        
        
        return result;
    }
}
