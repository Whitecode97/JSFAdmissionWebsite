/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_resources;

import alerts.DbConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author EVELYN
 */
@ManagedBean(name="ad")
@ViewScoped
@SessionScoped
public class Admission {
    DbConn db = new DbConn();
    private int rid;
    private int fid;
    private String course;
    private String prev_cert;
    private String dd;
    private String batch;
    private String pro;
    private String year;
    private String fname,lname,odanames,gender,marital,nat,soo,city,address,phn,email;
    
    public void check(){
    String query = "select * from Applicants where id = "+fid+"";
     ResultSet rs = db.readFromDB(query);
        try {
            
//            rid= rs.getInt(1);
//            fname = rs.getString(2);
//            lname= rs.getString(3);
//            odanames= rs.getString(4);
//            dd= rs.getString(5);
//            phn= rs.getString(6);
//            email= rs.getString(7);
//            nat= rs.getString(8);
//            soo= rs.getString(9);
//            city= rs.getString(10);
//            address= rs.getString(11);
//            course= rs.getString(12);
//            prev_cert= rs.getString(13);
//            batch= rs.getString(14);
//            year= rs.getString(15);
//            pro= rs.getString(16);
//            gender= rs.getString(17);
//            marital= rs.getString(18);
            while(rs.next()){
            
            String que = "insert into Admission (id,first_name,last_name,other_names,age,phone,Email,nat,states,city,address,course,"
                + "pastcert, Batch, years, program,gender,marital)values("+rid+",'"+fname+"','"+lname+"','"+odanames+"','"+dd+"',"
                + " '"+phn+"', '"+email+"', '"+nat+"', '"+soo+"', '"+city+"', '"+address+"',"
                + " '"+course+"', '"+prev_cert+"', '"+batch+"', '"+year+"', '"+pro+"', '"+gender+"', '"+marital+"')";
            if (db.writeToDB(que)){System.out.println("done!");}
               else{
               System.out.println("failed");
               }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
        
    }
     

   
}
