import java.util.ArrayList;
import java.util.Arrays; 
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class KindergartenGarden{
    
    String plants;
    List<String> students = new ArrayList<>();

    public KindergartenGarden(String plants) {
        this.plants = plants;
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("David");
        students.add("Eve");
        students.add("Fred");
        students.add("Ginny");
        students.add("Harriet");
        students.add("Ileana");
        students.add("Joseph");
        students.add("Kincaid");
        students.add("Larry");
    }
    
    public KindergartenGarden(String plants, String[] students) {
        this.plants = plants;
        this.students = Arrays.asList(students);
        Collections.sort(this.students);
    }    
    
    public List<Plant> getPlantsOfStudent(String student){
        String[] sPlants = plants.split("\n");
        List<Plant> listPlants = new ArrayList<>();
        String temp;
        int studentPosition;              

        for (int i = 0; i < 2; i++) {
            temp = sPlants[i];            
            studentPosition = students.indexOf(student) * 2;
            for (int j = studentPosition; j < studentPosition + 2; j++) {
                listPlants.add(Plant.getPlant(temp.charAt(j)));
            } 
        }        
        
        return listPlants;
    }      
    
}