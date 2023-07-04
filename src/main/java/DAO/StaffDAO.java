/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Connect.Connect;
import DTO.Staff;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class StaffDAO {
    private static StaffDAO instance;
    
    public StaffDAO() {
    }
    
    public static StaffDAO getInstance() {
        if (instance == null) {
            instance = new StaffDAO();
        }
        return instance;
    }
    
    public List<Staff> GetListStaff() {
        List<Staff> list = new ArrayList<>();
        Connection con = Connect.openConnection();
        try {
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM staff");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int ID = rs.getInt("ID");
                String type = rs.getString("type");
                String name = rs.getString("name");
                String sex = rs.getString("sex");
                Date birthday = rs.getDate("birthday");
                String phone_number = rs.getString("phone_number");
                String address = rs.getString("address");
                String email = rs.getString("email");
                
                Staff staff = new Staff(ID, type, name, sex, birthday, phone_number, address, email);
                list.add(staff);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StaffDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    // Các phương thức khác để thêm, cập nhật, xóa nhân viên
    
    public static void main(String[] args) {
        StaffDAO staffDAO = new StaffDAO();
        List<Staff> staffList = staffDAO.GetListStaff();
        for (Staff staff : staffList) {
            System.out.println("ID: " + staff.getID());
            System.out.println("Type: " + staff.getType());
            System.out.println("Name: " + staff.getName());
            System.out.println("Sex: " + staff.getSex());
            System.out.println("Birthday: " + staff.getBirthday());
            System.out.println("Phone Number: " + staff.getPhone_number());
            System.out.println("Address: " + staff.getAddress());
            System.out.println("Email: " + staff.getEmail());
            System.out.println("===============================");
        }
    }
}
