
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix{

    List<List<Integer>> matriz = new ArrayList<>();
    
    public Matrix(List<List<Integer>> matriz) {
        this.matriz = matriz;
    }
    
    public Set<MatrixCoordinate> getSaddlePoints(){
        Set<MatrixCoordinate> saddlepoints = new HashSet<MatrixCoordinate>();
        int row, col, tam;
        
        tam = matriz.size();
        for (int i = 0; i < tam; i++) {
            row = Collections.max(matriz.get(i));
            for (int j = 0; j < tam; j++) {
               col = menCol(j);
               if (row == col){
                saddlepoints.add(new MatrixCoordinate(i, j));
               } 
            }            
        }        
        
        return saddlepoints;
    }
    
    public int menCol(int col){
        int men;
        
        men = matriz.get(0).get(col);
        for (int i = 1; i < matriz.size(); i++) {
            if (matriz.get(i).get(col) <= men) {
                men = matriz.get(i).get(col);
            }
        }
        
        return men;
    }
            
}