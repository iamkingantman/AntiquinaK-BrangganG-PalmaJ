
import java.util.HashMap;


public class IDandPassword {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    IDandPassword(){
     logininfo.put("Karen", "Antiquina"); 
     logininfo.put("John Kharlo", "Palma");
     logininfo.put("Gerald", "Branggan");
    }
    public HashMap getLoginInfo(){
        return logininfo;
    }
}
