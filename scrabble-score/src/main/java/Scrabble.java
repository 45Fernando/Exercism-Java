class Scrabble {
    
    String word;
    int score = 0;

    Scrabble(String word) {
        this.word = word.toLowerCase();
    }

    int getScore() {
        
        for (int i = 0; i < word.length(); i++) {
            switch(word.charAt(i)){
                case 'a': case 'e': case 'i': case 'o':
                case 'u': case 'l': case 'n': case 'r':
                case 's': case 't': 
                    score = score + 1;
                    break;
                case 'd': case 'g':
                    score = score + 2;
                    break;
                case 'b': case 'c': case 'm': case 'p':
                    score = score + 3;
                    break;
                case 'f': case 'h': case 'v': case 'w':
                case 'y':
                    score = score + 4;
                    break;
                case 'k':
                    score = score + 5;
                    break;
                case 'j': case 'x':
                    score = score + 8;
                    break;
                case 'q': case 'z':
                    score = score + 10;
                    break;                    
            }
        }        
        return score;
    }
}
