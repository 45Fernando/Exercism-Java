class LuhnValidator {   

    boolean isValid(String candidate) {
        candidate = candidate.replace(" ", "");
        
        return check(candidate) && lhun(candidate);
    }
    
    boolean check(String canditate){
        return canditate.matches("[0-9]+") &&  canditate.length() > 1;
    }
    
    boolean lhun(String canditate){
        int size = canditate.length();
        int[] numbers = new int[size];
        
        numbers = toInt(canditate, size);        
        numbers = doubleNum(numbers, size);
        
        return (sum(numbers, size) % 10 == 0);
    }
    
    int[] toInt(String canditate, int tam){
        int[] numbers = new int[tam];
        
        for (int i = 0; i < tam; i++) {
            numbers[i] = Character.getNumericValue(canditate.charAt(i));
        }
        
        return numbers;
    }
    
    int[] doubleNum(int[] numbers, int tam){        
        for (int i = tam - 2 ; i >= 0; i = i - 2) {
            numbers[i] = numbers[i] * 2;
            if (numbers[i] > 9) {
                numbers[i] = numbers[i] - 9;
            }            
        }
        
        return numbers;
    }
    
    int sum(int[] numbers, int tam){
        int tmp = 0;
        
        for (int i = 0; i < tam; i++) {
            tmp += numbers[i];
        }
        
        return tmp;
    }
}
