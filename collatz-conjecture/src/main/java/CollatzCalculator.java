class CollatzCalculator{   
    
    public int computeStepCount(int number) {
        int cont;
        
        cont = 0;
        if (number > 0) {
            while (number != 1) {            
                cont++;
                if (number % 2 == 0) {
                    number = number / 2;
                }else{
                    number = (number * 3) + 1; 
                }
            }
        }else{
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }
        
        
        return cont;
    }
}