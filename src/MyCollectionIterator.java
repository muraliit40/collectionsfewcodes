
 
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class MyCollectionIterator {
 
    public static void main(String a[]){
         
       List <String> newlist= new ArrayList<String>();
       newlist.add("This");
       newlist.add("book");
       newlist.add("belongs");
       newlist.add("to");
       newlist.add("me");
       Iterator <String> stringiterator =  newlist.iterator();
       while(stringiterator.hasNext()) {
    	   System.out.println(stringiterator.next());
       }
        }
    }
