/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alerts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author EVELYN
 */
public class DbConn {
    String host = "jdbc:derby://localhost:1527/Andela";
    String Username ="Andel";
    String pass = "Andel123" ;
//     AlertTemplates at = new AlertTemplates();
     
    public boolean writeToDB(String query) throws SQLException{
        try{
        Connection c = DriverManager.getConnection(host,Username, pass);
        Statement s = c.createStatement();
        s.execute(query);
        return (true);
        }
        catch(SQLException sql){System.out.println(sql.getMessage()); return false;}}
        
    public ResultSet readFromDB(String query){
        ResultSet set = null ;
        try {
            Connection c = DriverManager.getConnection(host, Username, pass);
            Statement s = c.createStatement();
//        Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            set = s.executeQuery(query);
            
        } catch (SQLException ex) {
          System.out.println(ex.getMessage());
        }
         return set;
    }
    
    
    public boolean updates(String query) throws SQLException{
        try{
        Connection c = DriverManager.getConnection(host,Username, pass);
        Statement s = c.createStatement();
        s.executeUpdate(query);
        return(true);}
        catch(SQLException sql){return(false);}}
    
    
    public  void AddUserError(String error) {
       // instance of jsf facemessage class for display on browser
        FacesMessage message = new FacesMessage("Error Message:"+ error);
        //to append message to the html page
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
   
   
