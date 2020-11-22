 class Credentials 
{ 
    private String userName; 
    private String password; 
  
    public String getPassword()  
    { 
      return password; 
    } 
   
    public String getName()  
    { 
      return userName; 
    } 
    
    public void setName( String userName) 
    { 
      this.userName = userName; 
    } 
   
    public void setPassword(String password) 
    { 
      this.password = password; 
    } 
    
} 

public class Encapsulation {
    public static void main (String[] args)  
    { 
      Credentials obj = new Credentials(); 
          
        obj.setName("Harshit"); 
        obj.setPassword("i12***");
        
        System.out.println("Username: " + obj.getName()); 
        System.out.println("Password: " + obj.getPassword()); 
             
    } 
}
