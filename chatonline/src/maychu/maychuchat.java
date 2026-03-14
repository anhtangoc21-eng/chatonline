package maychu;

import java.net.ServerSocket;
import java.net.Socket;

public class maychuchat {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(6000);
            System.out.println("Server dang cho ket noi...");
            Socket socket = server.accept();
            formhostchat form = new formhostchat(socket);           
            form.setVisible(true);            
            System.out.println("Da ket noi user");
            xulynguoidung xl = new xulynguoidung(socket, form);
            xl.start();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
