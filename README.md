# Common_ArrayList_Usage

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
  public static void main(String[] args)
  {
    OtherClass myObject = new OtherClass();
     System.out.println("Calling insert insertdata");
    myObject.insertdata();
    System.out.println("Outside insertdata");

    for( Object a: myObject.dataList){
      
      System.out.println("Item in arrayList:: "+a);
      
    }
   myObject.mapArrayListToTreeMap();
    
    for (Map.Entry<Integer, Object> entry : myObject.data.entrySet()) {
    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
}
    
  }
}

// you can add other public classes to this editor in any order
public class OtherClass
{
  public List<Object> dataList;
  protected Map<Integer, Object> data;
  
  public OtherClass(){
    dataList = new ArrayList<Object>();
    data = new TreeMap<Integer, Object>();
}
  
  public void insertdata(){
    System.out.println("Inside insertdata");
    String x= "India";
    String y= "Singapore";
 
    dataList.add(x);
    
    dataList.add(y);
  }
  
  public void mapArrayListToTreeMap(){
    
    int i=0;
    
   for( Object a: dataList){
      
      data.put(i, a);
     i++;
      
    } 
  }   
    
    
    
}
