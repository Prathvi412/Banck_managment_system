
package banck_managment;
import java.sql.*;

public class conn {
    
    Connection c;
    Statement s;
    public conn(){
        try{
            c =DriverManager.getConnection("Jdbc:mysql:///banckmangment","root","Pass@123");
            s =c.createStatement();
            
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
