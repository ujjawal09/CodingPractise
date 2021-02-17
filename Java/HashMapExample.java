import java.util.*;  
public class showCountForEachFruit{

     public static void main(String []args){
       String[] strArr={"Apple","Orange","Pinapalle","Kiwi","Kiwi","Kiwi","Orange","Orange","Orange","Orange","Orange","Apple","Apple"};
       HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
       for(int i=0;i<strArr.length;i++)
       {
           if(!hashMap.containsKey(strArr[i]))
           {
               hashMap.put(strArr[i],1);
           }
           else
           {
               hashMap.put(strArr[i],hashMap.get(strArr[i])+1);
           }
       }
       Iterator itr= hashMap.entrySet().iterator();
       while(itr.hasNext())
       {
           Map.Entry element=(Map.Entry)itr.next(); 
           System.out.println(element.getKey()+" : "+element.getValue());
       }
     }
}
