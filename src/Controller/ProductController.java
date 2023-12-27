package Controller;

import Component.MSG;
import Database.Connecter;
import Model.ProductModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ProductController extends Connecter{
    PreparedStatement ps;
    ResultSet rs;
    public void addProduct(ProductModel product){
        try{
            String sql = "INSERT INTO `tbl_product`(`name`, `qty`, `price`, `total`, `discount`, `payment`, `image`) VALUES (?,?,?,?,?,?,?)";
            ps = connection().prepareStatement(sql);
            ps.setString(1, product.getName());
            ps.setInt(2, product.getQty());
            ps.setDouble(3, product.getPrice());
            ps.setDouble(4, product.getTotal());
            ps.setInt(5, product.getDiscount());
            ps.setDouble(6, product.getPayment());
            ps.setString(7, product.getImage());
            int i = ps.executeUpdate();
            if (i>0) {
                MSG.success("Product added");
            } else {
                MSG.success("Product can't be add");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    public Collection<ProductModel> getData(){
        List<ProductModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM `tbl_product`";
            ps = connection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {                
                ProductModel product = new ProductModel(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getDouble(4),
                        rs.getDouble(5),
                        rs.getInt(6),
                        rs.getDouble(7),
                        rs.getString(8),
                        rs.getString(9)
                );
                list.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}

