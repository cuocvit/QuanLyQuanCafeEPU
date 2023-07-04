package DAO;

import DTO.Ingredients;
import Connect.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IngredientsDAO {
    
    private static IngredientsDAO instance;
    
    public IngredientsDAO() {
    }
    
    public static IngredientsDAO getInstance() {
        if (instance == null) {
            instance = new IngredientsDAO();
        }
        return instance;
    }
    
    public List<Ingredients> LoadListIngredients() {
        List<Ingredients> list = new ArrayList<Ingredients>();
        Connection con = Connect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM ingredients");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Ingredients ingredient = new Ingredients(rs.getInt(1), rs.getString(2), rs.getInt(3));
                list.add(ingredient);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IngredientsDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static void main(String[] args) {
        IngredientsDAO ingredientsDAO = new IngredientsDAO();
        List<Ingredients> ingredientsList = ingredientsDAO.LoadListIngredients();
        for (Ingredients ingredient : ingredientsList) {
            System.out.println(ingredient.getID() + ", " + ingredient.getName() + ", " + ingredient.getCount());
        }
    }

}
