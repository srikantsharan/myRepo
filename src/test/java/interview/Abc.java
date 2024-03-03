package interview;

import java.util.HashMap;
import java.util.Map;

public class Abc {

	public static void main(String[] args) {
		
		String []str={"Apple", "Pomegranate", "Strawberries", "Watermelons","Green Grapes"} ;
        Map<String,Integer>map=new HashMap<String,Integer>();
        for(String a:str)
        {
        	Integer old=map.get(a);
        	if(old==null)
        	{
        		old=0;
        	}
        	map.put(a, old+1);
        }
        
        System.out.println(map);
	}

}
