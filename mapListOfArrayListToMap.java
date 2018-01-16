
import java.lang.Math; // headers MUST be above the first class
import java.util.*; 
import java.util.List; 
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// one class needs to have a main() method
public class ConvertingArrayListToTreeMap
  // arguments are passed using the text field below this editor
{
  public static void main(String[] args)
  {
    OtherClass myObject = new OtherClass();
     System.out.println("Calling insert insertdata");
    myObject.insertdata();
    System.out.println("Outside insertdata");
    
  myObject.insertdata2();
 System.out.println("Outside insertdata2");
    for( Object a: myObject.ObjectArray){
      
      System.out.println("Item in objectArray:: "+a);
      
    }
   myObject.mapArrayListToTreeMap();
    
    for (Map.Entry<Integer, List<Object>> entry : myObject.data.entrySet()) {
    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
}
  }   
  
}

// you can add other public classes to this editor in any order
public class OtherClass
{
  
  protected Map<Integer, List<Object>> data;
  protected List<List<Object>> ObjectArray;
  
  public OtherClass(){
  
    
    ObjectArray = new ArrayList<List<Object>>();
    
    data = new TreeMap<Integer, List<Object>>();
}
  
  public void insertdata(){
    System.out.println("Inside insertdata");
    String a= "India";
    String b= "Singapore";
   List<Object> dataList= new ArrayList<Object>();
    
    dataList.add(a);
    dataList.add(b);
    
    ObjectArray.add(dataList);
  }
  
  public void insertdata2(){
    System.out.println("Inside insertdata2");
    String x= "Dream";
    String y= "More";
 	
  List<Object> dataList= new ArrayList<Object>();
    dataList.add(x);
    dataList.add(y);
    
     ObjectArray.add(dataList);
  }
  
  public void mapArrayListToTreeMap(){
    
    int i=0;
    
   for( List<Object> a: ObjectArray){
      
      data.put(i, a);
     i++;
      
    } 
  }   
    
    
    
}
