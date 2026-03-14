package maychu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class xulynguoidung extends Thread{
    Socket socket;
    BufferedReader in;
    formhostchat form;
    
    public xulynguoidung(Socket socket, formhostchat form){
        
        this.socket = socket;
        this.form = form;
        
        try{
            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void run(){
        try{
            String msg;
            while((msg = in.readLine()) != null){
                form.txtchat.append("User: " + msg + "\n");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
