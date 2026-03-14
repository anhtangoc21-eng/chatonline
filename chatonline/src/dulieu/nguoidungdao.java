package dulieu;

import java.sql.*;
import nguoidung.nguoidungchat;
import java.util.ArrayList;
import java.util.List;

public class nguoidungdao {

    public boolean themnguoidung(nguoidungchat nd){

        try{

            Connection conn = ketnoicsdl.layketnoi();

            String sql =
            "INSERT INTO nguoidung (taikhoan,matkhau) VALUES(?,?)";

            PreparedStatement ps =
            conn.prepareStatement(sql);

            ps.setString(1, nd.gettaikhoan());
            ps.setString(2, nd.getmatkhau());

            ps.executeUpdate();

            return true;

        }catch(Exception e){

            e.printStackTrace();

        }

        return false;
    }
    public void suanguoidung(int id,String tk,String mk){

        try{

        Connection conn = ketnoicsdl.layketnoi();

        String sql =
        "UPDATE nguoidung SET taikhoan=?,matkhau=? WHERE id=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1, tk);
        ps.setString(2, mk);
        ps.setInt(3, id);

        ps.executeUpdate();

    }catch(Exception e){

        e.printStackTrace();

    }
}
    public void xoanguoidung(int id){

        try{

        Connection conn = ketnoicsdl.layketnoi();

        String sql =
        "DELETE FROM nguoidung WHERE id=?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1,id);

        ps.executeUpdate();

    }catch(Exception e){

        e.printStackTrace();

    }
}
    public List<nguoidungchat> laydanhsach(){

    List<nguoidungchat> ds = new ArrayList<>();

    try{

        Connection conn = ketnoicsdl.layketnoi();

        String sql = "SELECT * FROM nguoidung";

        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery(sql);

        while(rs.next()){

            nguoidungchat nd = new nguoidungchat();

            nd.setid(rs.getInt("ID"));
            nd.settaikhoan(rs.getString("TaiKhoan"));
            nd.setmatkhau(rs.getString("MatKhau"));

            ds.add(nd);

        }

    }catch(Exception e){

        e.printStackTrace();

    }

    return ds;
}
}
