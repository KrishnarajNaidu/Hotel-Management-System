/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class Tables {
   public static void main(String[] args) 
   {
   Connection con=null;
   Statement st=null;
   try
   {
   con=ConnectionProvider.getCon();
   st=con.createStatement();
   st.executeUpdate("create table users(Name varchar(200),Email varchar(200),Password varchar(50),SecurityQuestion varchar(500),Answer varchar(200),Address varchar(200),Status varchar(20))");
   st.executeUpdate("create table Room(RoomNo varchar(10),RoomType varchar(200),Bed varchar(200),Price int,Status varchar(20))");
   st.executeUpdate("create table Customer(id int,Name varchar(200),MobileNumber varchar(20),Nationality varchar(50),Gender varchar(50),Email varchar(200),idProof varchar(200),Address varchar(500),CheckIn varchar(50),RoomNO varchar(10),Bed varchar(200),RoomType varchar(200),PricePerDay int(10),NumberOfDaysStay int(10),TotalAmount varchar(200),Checkout varchar(50),Status varchar(20)");
   st.executeUpdate("create table login(email varchar(100),password varchar(50))");
    JOptionPane.showMessageDialog(null,"Table created Successfully");
   }
   catch(Exception e)
   {
       JOptionPane.showMessageDialog(null, e);
   }
   finally
   {
       try
   {
   con.close();
   st.close();
   }
   catch(Exception e)
   {}
   }
       
   }
}
