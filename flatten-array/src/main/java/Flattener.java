
import java.util.ArrayList;
import java.util.List;

class Flattener{
    
   public List<Object> flatten(List<Object> list){       
      List<Object> flatten_list = new ArrayList<>();
      Object element;
      
       for (int i = 0; i < list.size(); i++) {
           element = list.get(i); 
           if (element instanceof List<?>){
               for(Object elem : flatten((List)element)){
                   flatten_list.add(elem);
               }                   
           }else if(element != null){
               flatten_list.add(element);
           }
       }
      
      return flatten_list;      
   }
}