
import java.util.ArrayList;
import java.util.List;

class SumOfMultiples {
    
    int number;
    int[] set;    
    List<Integer> factors = new ArrayList<>();

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;        
    }

    int getSum() {
        int tmp;
        
        for (int i = 0; i < set.length; i++) {
            tmp = set[i];
            while (tmp < this.number) {
                if (!factors.contains(tmp)) {
                    factors.add(tmp);
                }                
                tmp += set[i];
            }    
        }
        
        if (!factors.isEmpty()) {
            return factors.stream().mapToInt(Integer::intValue).sum();
        } else {
            return 0;
        }
    }
}
