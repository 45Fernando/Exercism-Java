class Acronym {
    
    String phrase;
    String acronym;
        
    Acronym(String phrase) {
        this.phrase = phrase;
        acronym = "";
    }

    String get() {        
        return formAcronym();
    }
    
    String sanitize(String phrase){        
        
        phrase = phrase.toUpperCase();
        phrase = phrase.replace("-", " ");
        
        return phrase;
    }
    
    String formAcronym(){ 
        String list[];
        String temp;
        
        temp = this.sanitize(phrase);
        list = temp.split(" ");
        for (String word : list){
            acronym += word.charAt(0);
        }
        
        return acronym;
    }
}
