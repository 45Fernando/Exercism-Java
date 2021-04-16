class ReverseString {

    String reverse(String inputString) {
        StringBuilder str = new StringBuilder();
        
        str.append(inputString);
        str.reverse();
        
        return str.toString();
    }
  
}
