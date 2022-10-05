/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_resources;

import alerts.DbConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author EVELYN
 */
@ManagedBean
public class Appli_List {
    DbConn db= new DbConn();
    ResultSet rs;
    private final List datalist = new ArrayList<>();
   
    
    
    public List <ExchangeConverter> getDatalist() {
        
        int i = 0  ;
        String query = "select * from Applicants ";
        
        try {
            rs = db.readFromDB(query);
            if(rs.next()){
            
            datalist.add(0,new ExchangeConverter(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),
            rs.getString(7),rs.getString(8), rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17)));
            }i++;
//            else System.out.println("not working");
       
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
       return datalist;
    }
}
   

    