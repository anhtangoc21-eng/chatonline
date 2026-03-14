package dulieu;

import java.sql.Connection;
import java.sql.DriverManager;

public class ketnoicsdl {

    public static Connection layketnoi(){

        try{

            String url =
            "jdbc:sqlserver://localhost:1433;databaseName=chatonline;encrypt=false";

            String user = "sa";
            String password = "123456";

            Connection conn =
            DriverManager.getConnection(url,user,password);
            
            return conn;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}