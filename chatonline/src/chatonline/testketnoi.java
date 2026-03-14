package chatonline;

import dulieu.ketnoicsdl;
import java.sql.Connection;

public class testketnoi {

    public static void main(String[] args){

        Connection conn = ketnoicsdl.layketnoi();

        if(conn != null){

            System.out.println("Ket noi thanh cong");

        }else{

            System.out.println("Ket noi that bai");

        }
    }
}
