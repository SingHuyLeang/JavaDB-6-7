package Controller;

import Database.Connecter;
import Model.UserModel;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController extends Connecter{
    public Boolean signUpWithEmailAndPassword(UserModel user){
        try {
            String sql = "INSERT INTO `authantication`( `email`, `password`) VALUES (?,MD5(?))";
            ps = connection().prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            int i = ps.executeUpdate();
            if (i>0) {
                System.out.println("Sign Up Success");
                return true;
            } else {
                System.out.println("Sign Up not Success");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
    public Boolean signInWithEmailAndPassword(UserModel user){
        try {
            String sql = "SELECT * FROM `authantication` WHERE `email`=? AND `password`=MD5(?)";
            ps = connection().prepareStatement(sql);
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
