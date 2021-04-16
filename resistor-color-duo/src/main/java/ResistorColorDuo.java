class ResistorColorDuo {
	
	private String[] colores = {
			"black",
			"brown",
			"red",
			"orange",
			"yellow",
			"green",
			"blue",
			"violet",
			"grey",
			"white"
	};
	
	private int colorDuo(String color) {
		int i = 0;
		
		while (i < colores.length && color != colores[i]) {
			i++;
		}
		
		return i;
	}
	
    int value(String[] colors) {
    	int response = colorDuo(colors[0]) * 10 + colorDuo(colors[1]);
        
    	return response;    	
    }
}
