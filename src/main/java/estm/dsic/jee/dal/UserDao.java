package estm.dsic.jee.dal;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import jakarta.annotation.Resource;
public class UserDao {
    @Resource(name = "jdbc/db_pj")
    private DataSource mydb;
    private Connection cnx;
    private Statement stm;
    private ResultSet rs;
   
    
    public boolean auth(String email,String passwd){
            try {
                cnx=mydb.getConnection();
                stm=cnx.createStatement();
                rs=stm.executeQuery("SELECT * FROM  employee  WHERE email='"+email+"' AND password='"+passwd+"';");
                if(rs.next()) return true;

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return false;

    }


    
    public boolean emailExists(String email) {

        try {
            cnx=mydb.getConnection();
            stm=cnx.createStatement();
            rs=stm.executeQuery("SELECT * FROM  employee  WHERE email='"+email+"'");
            if(rs.next()) return true;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

}
    

public boolean addUser(String name, String email, String password) throws SQLException {
   
    try {
        cnx=mydb.getConnection();
          PreparedStatement pstmt = cnx.prepareStatement(
            "INSERT INTO employee (name, email, password, isManager) VALUES (?, ?, ?, ?)"
        );
        pstmt.setString(1, name);
        pstmt.setString(2, email);
        pstmt.setString(3, password);
        pstmt.setInt(4, 0);
        pstmt.executeUpdate();
        
        return true;
    } catch (Exception e) {
e.printStackTrace();    }
    
  return false ;


}











}
