class PigLatinTranslator{
    
    public String translate(String word){
        String[] list = word.split(" ");
        String tmp;
        
        for(int i = 0; i < list.length; i++) {
            if(vowels(list[i])){
                list[i] = list[i] + "ay";
            }else if(consonants3(list[i])){
                list[i] = list[i].substring(3) + list[i].substring(0, 3) + "ay";
            }else if(consonants2(list[i])){
                list[i] = list[i].substring(2) + list[i].substring(0, 2) + "ay";
            }else{
                list[i] = list[i].substring(1) + list[i].substring(0, 1) + "ay";
            } 
        }
        
        tmp = String.join(" ", list);
        return tmp;
    }
    
    public boolean vowels(String word){
        char v;
        String tmp;
        boolean result = false;
        
        v = word.charAt(0);
        switch(v){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                result = true;
                break;
        }
        tmp = word.substring(0, 2);
        switch(tmp){
            case "yt":
            case "xr":            
                result = true;
                break;
        }
        
        return result;
    }
    
    public boolean consonants2(String word){
        char v;
        String tmp;
        boolean result = false;
        
        tmp = word.substring(0, 2);
        switch(tmp){
            case "th":
            case "ch":
            case "qu":            
                result = true;
                break;
        }        
        
        return result;
    }
    
    public boolean consonants3(String word){
        char v;
        String tmp;
        boolean result = false;        
        
        tmp = word.substring(0, 3);
        switch(tmp){
            case "squ":
            case "thr":
            case "sch":            
                result = true;
                break;
        }
        
        return result;
    }
}