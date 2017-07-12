class Triangle {
    double side1;
    double side2;
    double side3;

    Triangle(double side1, double side2, double side3) throws TriangleException {
        if (side1 > 0 && side2 > 0 && side3 > 0) {
            if (side1 + side2 > side3 && side3 + side2 > side1 && side1 + side3 > side2 ) {
                this.side1 = side1;
                this.side2 = side2;
                this.side3 = side3;            
            }else{
               throw  new TriangleException(); 
            }
        }else{
            throw  new TriangleException();
        }
    }

    TriangleKind getKind() {
        if (side1 != side2 && side2 != side3 && side1 != side3) {
            return TriangleKind.SCALENE;
        }else if (side1 == side2 && side2 == side3) {
            return TriangleKind.EQUILATERAL;
        }else{
            return TriangleKind.ISOSCELES;
        }            
    }

}
