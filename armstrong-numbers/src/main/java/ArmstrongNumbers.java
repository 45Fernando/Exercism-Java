class ArmstrongNumbers {
	
	private int numberOfDigits(int number) {
		int cant = 0;
		
		while(number > 0) {
			number = number / 10;
			cant++;
		}
		
		return cant;
	}
	
	private double sumDig(int number) {
		int cant;
    	double acum = 0;
    	int dig;
    	
    	cant = numberOfDigits(number);
    	
    	while(number > 0) {
    		dig = number % 10;
    		number = number / 10;
    		acum = acum + Math.pow(dig, cant);
    	}
    	
    	return acum;
	}

    boolean isArmstrongNumber(int numberToCheck) {
    	
    	if(numberToCheck == sumDig(numberToCheck)) {
    		return true;
    	} else {
    		return false;
    	}   

    }

}
