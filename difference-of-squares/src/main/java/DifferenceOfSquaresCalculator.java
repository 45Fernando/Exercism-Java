class DifferenceOfSquaresCalculator{

    int computeSquareOfSumTo(int number){
        int i;
        int sum;
        
        sum = 0;
        for (i = 1; i <= number; i++){
            sum += i;
        }
        
        return sum * sum;
    }
    
    int computeSumOfSquaresTo(int number){
        int i;
        int sum;
        
        sum = 0;
        for (i = 1; i <= number; i++){
            sum += (i * i);
        }
        
        return sum;
    }

    int computeDifferenceOfSquares(int number){
                
        return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
    }
}