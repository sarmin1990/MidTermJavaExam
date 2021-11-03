package datastructure;

//import java.util.Collection;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Map;

import java.util.HashMap;

public class CollectionView {

        public static void main(String[] args) {

        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
                HashMap<String,Integer>NameNID=new HashMap<>();
                NameNID.put("Nick",01);
                NameNID.put("Vicki",02);
                NameNID.put("Amy",03);
                NameNID.put("Judy",04);
                for (String a: NameNID.keySet()){
                        System.out.print(a+ " = ");
                        System.out.println(NameNID.get(a));
                }

        }
}
