class Darts {
	
	double x;
	double y;

    Darts(double a, double b) {
    	x = a;
    	y = b;
    }

    int score() {
    	int points = 0;
    	
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        
        if (distance > 10) {
        	points = 0;
        } else if ( distance <= 10 && distance > 5) {
        	points = 1;
        } else if ( distance <= 5 && distance > 1) {
        	points = 5;
        } else if ( distance <= 1 && distance >= 0 ) {
        	points = 10;
        }
        	
        return points;
    }

}
