class IsogramChecker{
    
    public boolean isIsogram(String word){
        int i, j, band, len;
        
        i = 0;
        band = 1;
        word = word.toLowerCase().replaceAll("[- ]+", "");
        len = word.length();        
        while (i < len - 1 && band == 1) {            
            j = i + 1;
            while(j < len && band == 1){
                if (word.charAt(i) == word.charAt(j)) {
                    band = 0;
                }
                j++;
            }
            i++;
        }        
        
        return band == 1;
    }
}