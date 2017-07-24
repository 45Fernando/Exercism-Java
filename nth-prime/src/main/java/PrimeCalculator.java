class PrimeCalculator{
    
    public int nth(int number){
       int cont;
       int nprime;
       
       if (number < 1) {
           throw new IllegalArgumentException();
       }
       
       cont = 1;
       nprime = 2;
       while(cont < number){
           nprime++;
           if (isPrime(nprime)) {
               cont++;
           }
       }
       
       return nprime;
    }
    
    public boolean isPrime(int number){
        int pd;
        
        pd = 2;
        while(pd <= Math.sqrt(number) && number % pd != 0){
            pd++;
        }
        
        return pd > Math.sqrt(number);
    }
}