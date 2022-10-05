/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_resources;

import alerts.DbConn;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author EVELYN
 */
@ManagedBean(name="mybean")
@RequestScoped
@SessionScoped
public class Login {
//    private AlertTemplates at = new AlertTemplates();
   
    
   private String names;
   private String uname,pwrd;
   
  private String dbuname,dbpword,position,u,p;
   
public void signup(){
     DbConn db = new DbConn();
     String myquery = "insert into Andel.signup(names,usernames,Password)values('"+names+"','"+uname+"','"+pwrd+"')";
//   String myquery = "update SIGNUP set names ='"+names+"', usernames = '"+uname+"',password = '"+pwrd+"'";
        try {
           
            db.writeToDB(myquery);
//            db.updates(myquery);
             if(db.writeToDB(myquery)) System.out.println("success! data =" +uname+ pwrd+ names);else System.out.println("no success");
             
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
}

public String signin(){
    
   DbConn db = new DbConn();
   String myquery = "select * from Signup where usernames = '"+uname+"'";
    ResultSet rs = db.readFromDB(myquery); 
    try {
        rs.next();
            dbuname = rs.getString(2);
            dbpword = rs.getString(3);
            position= rs.getString(4);
        if(uname.equals(dbuname)&&pwrd.equals(dbpword)&&position.equals("student")){ 
           return "student";}
        else if(uname.equals(dbuname)&&pwrd.equals(dbpword)&&position.equals("Admin")){
          return "admin";
        }
        }
        
        catch (SQLException ex) {
        System.out.println(ex.getMessage());
       }
       return null;
        
}

 public  void AddUserError(String error) {
       // instance of jsf facemessage class for display on browser
        FacesMessage message = new FacesMessage("Error Message:"+ error);
        //to append message to the html page
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
   
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }


    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwrd() {
        return pwrd;
    }

    public void setPwrd(String pwrd) {
        this.pwrd = pwrd;
    }

    
}
