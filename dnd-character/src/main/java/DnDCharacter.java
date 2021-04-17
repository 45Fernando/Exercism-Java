class DnDCharacter {
	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	private int hitpoints;
	
	public DnDCharacter(){
		strength = sumGreatestRolls();
		dexterity = sumGreatestRolls();
		constitution = sumGreatestRolls();
		intelligence = sumGreatestRolls();
		wisdom = sumGreatestRolls();
		charisma = sumGreatestRolls();
		hitpoints = 10;
		
	}
	
	
	private int posMin(int[] list) {
		int min = list[0];
		int pos = 0;
		
		for(int i = 1; i < 4; i++) {
			if(list[i] < min) {
				min = list[i];
				pos = i;
			}
		}
		
		return pos;
	}
	
	private int[] deletePos(int[] list, int pos) {
		
		for(int i = pos; i < 3; i++) {
			list[i] = list[i + 1];
		}
		
		return list;
	}
	
	
	private int[] rollDices() {
		int[] list = new int[4];
		
		for(int i = 0; i < 4; i++) {
			list[i] = (int) Math.floor(Math.random()*(6 - 1 + 1) + 1);
		}
		
		return list;		
	}
	
	private int sumGreatestRolls() {
		int[] list = rollDices();
		int pos;
		int acum = 0;
		
		pos = posMin(list);
		list = deletePos(list, pos);
		
		for(int i = 0; i < 3; i++) {
			acum = acum + list[i];
		}
		
		return acum;		
	}

    int ability() {
        return sumGreatestRolls();
    }

    int modifier(int input) {
    	return (int) Math.floor((input - 10) / 2.00);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints + modifier(constitution);
    }

}
