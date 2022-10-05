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

/**
 *
 * @author EVELYN
 */
@ManagedBean
public class Student {
    DbConn db = new DbConn();
    private String name;
    private String phone;
    private String Email;
    private String row;
    private String cou;
     private String pro;
      private String Batch;
    ResultSet rs;
    
    public  String jav(){
         String query = "Select * from admission  where Email = '"+Email+"'";
         rs = db.readFromDB(query);
        try {
            if(rs.next()){
                System.out.println("done");
                String dbname = rs.getString(2);
                String dbphone = rs.getString(6);
                String dbemail = rs.getString(7);
                String roll = rs.getString(1);
                String dept = rs.getString(12);
                String prog = rs.getString(16);
                String ba = rs.getString(14);
                if(name.equals(dbname)&&phone.equals(dbphone)&&Email.equals(dbemail)){
                    row= " Your Reg_No is"+roll;
                    cou = "Your department is"+dept;
                    pro ="You're studying for a" + prog;
                    Batch="Your Accademic session" + ba;
                return "congrats";
                }else {return "oops";}
                
            }else System.out.println("failed");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getCou() {
        return cou;
    }

    public void setCou(String cou) {
        this.cou = cou;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getBatch() {
        return Batch;
    }

    public void setBatch(String Batch) {
        this.Batch = Batch;
    }

    
}
