class ResistorColor {
	String[] colores = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
	
    int colorCode(String color) {
        int i = 0;
        
        while(i < colores.length && color != colores[i]) {
        	i++;
        }
        
        return i;
    }

    String[] colors() {
        return colores;
    }
}
