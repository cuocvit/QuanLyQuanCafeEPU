/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Menu;
import Connect.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author TRI
 */
public class MenuDAO {

    private static MenuDAO instance;

    public MenuDAO() {
    }

    public static MenuDAO getInstance() {
        if (instance == null) {
            instance = new MenuDAO();
        }
        return instance;
    }

    public static void setInstance(MenuDAO instance) {
        MenuDAO.instance = instance;
    }

    public List<Menu> GetListMenuByTableId(int id) {
        List<Menu> list = new ArrayList<Menu>();
        Connection con = Connect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT drinks.name, orders.count, drinks.price, orders.count*drinks.price AS totalPrice FROM orders, invoice, drinks WHERE orders.invoice_ID = invoice.ID AND orders.drinks_ID = drinks.ID AND invoice.status = 0 AND invoice.tables_id = ?");
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Menu menu = new Menu(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4));
                list.add(menu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MenuDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static void main(String[] args) {
        // Gọi phương thức GetListMenuByTableId từ MenuDAO để lấy danh sách menu dựa trên một id bàn cụ thể
        MenuDAO menuDAO = MenuDAO.getInstance();
        int tableId = 2; // Thay thế id bàn tại đây
        List<Menu> menuList = menuDAO.GetListMenuByTableId(tableId);

        // Hiển thị danh sách menu
        if (menuList.isEmpty()) {
            System.out.println("Không có dữ liệu menu.");
        } else {
            System.out.println("Danh sách menu:");
            for (Menu menu : menuList) {
                System.out.println("Tên đồ uống: " + menu.getDrinkName());
                System.out.println("Số lượng: " + menu.getCount());
                System.out.println("Giá: " + menu.getPrice());
                System.out.println("Thành tiền: " + menu.getTotalPrice());
                System.out.println("-----------------------------");
            }
        }
    }
}
