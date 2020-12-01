import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
//    two interfaces
 
    public conn(){
    	
        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            c=DriverManager.getConnection("jdbc:mysql:///project2","root","");
        	
    		String url = "jdbc:mysql://localhost:3306/java";
    		String username = "root";
    		String password = "root";
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection c = DriverManager.getConnection(url,username,password);
            s = c.createStatement();
            	
//            System.out.println(5/0); //Checked Exceptions  
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
