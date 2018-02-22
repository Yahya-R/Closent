/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package YahyaRaoIA;

/**
 *
 * @author YahyaRao
 */
public class Article {
//    private Article []clothing = new Article [50];
    private String warmth;
    private String occasion;
    private String comfort;
    private String name;
    public int number;
   
//    private int count; 
//    private Dates frequency [] = new Dates []
    
            
//            String [] all = new String [3];
            
         
//		String all[] = name.split("Roots AdidasHoodie NikeTrainers");
                
                
                
                
                
            
    public Article (String name, String warmth, String occasion, String comfort ){
        this.name = name;
        this.warmth = warmth;
        this.occasion = occasion;
        this.comfort = comfort;
       
        
    }
    
    public String getName() {
        return name; 
    }
    
    public void changeName(String n) {
        name = n;
    }
    
    public String getWarmth(){
        return warmth;
    }
    
    public void changeWarmth(String w) {
        warmth = w;
    }
      public String getOccasion(){
        return occasion;
    }
    
    public void changeOccasion(String w) {
        occasion = w;
    }
    public String getComfort(){
        return comfort;
    }
    
    public void changeComfort(String x) {
        comfort = x;
    }
    
    

    @Override
    public String toString() {
        return "Article{" + "warmth=" + warmth + ", occasion=" + occasion + ", comfort=" + comfort + ", name=" + name + '}';
    }
    
    
   
    
  
   
}





