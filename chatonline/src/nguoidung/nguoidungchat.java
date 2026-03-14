package nguoidung;

import java.io.*;
import java.net.Socket;

public class nguoidungchat {

    private int id;
    private String taikhoan;
    private String matkhau;
    Socket socket;
    BufferedReader in;
    PrintWriter out;

    public nguoidungchat(){
        try{
            socket = new Socket("localhost",6000);
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public String nhantin() {
        try {
            return in.readLine();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void guitin(String tin){
        out.println(tin);
    }
    
    public nguoidungchat (String tk,String mk){
        this.taikhoan = tk;
        this.matkhau = mk;
    }
    
    public int getid(){
        return id;
    }
    
    public String gettaikhoan(){
        return taikhoan;
    }

    public String getmatkhau(){
        return matkhau;
    }
    
    public void setid(int id){ 
        this.id = id; 
    }

    public void settaikhoan(String tk){ 
        this.taikhoan = tk; 
    }

    public void setmatkhau(String mk){ 
        this.matkhau = mk; 
    } 
}