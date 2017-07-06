class Matrix {
    
    String[] matrixAsString;

    public Matrix(String matrixAsString) {
        
        this.matrixAsString = matrixAsString.split("\n"); 
    }
    
    int getRowsCount(){        
        
        return matrixAsString.length;
    }
    
    int getColumnsCount(){
       
        this.matrixAsString = trimSpaces(matrixAsString);
        return matrixAsString[0].length();
    }

    int[] getRow(int number){
        int size = getColumnsCount();
        int[] rowInt = new int[size];
        
        matrixAsString = trimSpaces(matrixAsString);
        
        String row = matrixAsString[number];
        
        for (int i = 0; i < size; i++) {
            rowInt[i] = Integer.parseInt(String.valueOf(row.charAt(i)));
        }
        
        return rowInt;
    }
    
    int[] getColumn(int number){
        int size = getRowsCount();
        int[] columInt = new int[size];
        
        matrixAsString = trimSpaces(matrixAsString);
        
        for (int i = 0; i < size; i++) {
            columInt[i] = Integer.parseInt(String.valueOf(matrixAsString[i].charAt(number)));
        }
        
        return columInt;
    }
    
    String[] trimSpaces(String[] sRows){
        for (int i = 0; i < sRows.length; i++) {
            sRows[i] = sRows[i].replace(" ", "");
        }
        
        return sRows;
    }
    
}