class PhoneNumber{
    
    String number;

    public PhoneNumber(String number) {
        number = formatNumber(number);
        
        //Verify if the number has 11 digits and start with '1'
        if(number.length() == 11 && number.charAt(0) == '1'){
            number = number.substring(1);                        
        }else if(number.length() == 11){
            throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
        }
        
        //Verify if the number has 10 digits
        if(number.length() != 10){
            throw new IllegalArgumentException("Number must be 10 or 11 digits");
        }
        
        this.number = number;
    }
    
    private String formatNumber(String number){
        StringBuilder tmp = new StringBuilder();
        String result = new String();
        char aux;

        for (int i = 0; i < number.length(); i++) {
            aux = number.charAt(i);
            if(aux >= '0' && aux <= '9'){
                tmp.append(aux);
            }
            if((aux >= 'a' && aux <= 'z') || aux == '@' || aux == ':' || aux == '!'){
                throw new IllegalArgumentException("Illegal character in phone number. Only digits, spaces, parentheses, hyphens or dots accepted.");
            }
        }  
        
        return tmp.toString(); 
    }
    
    public String getNumber(){
        return number;
    }
    
}