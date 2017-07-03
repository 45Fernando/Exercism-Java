class NaturalNumber {
    
    int number;
    private final Classification[] classification = Classification.values(); 

    public NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
    }
    
    Classification getClassification(){
        if (number == sumDiv()) {
            return classification[1];
        } else if (number < sumDiv()) {
            return classification[2];
        } else {
            return classification[0];
        }        
    }
    
    int sumDiv(){
        int sum = 0;
        
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}
