/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_resources;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import alerts.DbConn;
import java.sql.SQLException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author EVELYN
 */
@ManagedBean
@SessionScoped
public class FormAction{
    private String course;
    private String prev_cert;
    private String dd;
    private String batch;
    private String pro;
    private String year;
    private String fname,lname,odanames,gender,marital,nat,soo,city,address,phn,email;
    DbConn db = new DbConn();
    

    public void data(){
        String query = "insert into Applicants (first_name,last_name,other_names,age,phone,Email,nat,states,city,address,course,"
                + "pastcert, Batch, years, program,gender,marital)values('"+fname+"','"+lname+"','"+odanames+"','"+dd+"',"
                + " '"+phn+"', '"+email+"', '"+nat+"', '"+soo+"', '"+city+"', '"+address+"',"
                + " '"+course+"', '"+prev_cert+"', '"+batch+"', '"+year+"', '"+pro+"', '"+gender+"', '"+marital+"')";
           try {
               if (db.writeToDB(query)){System.out.println("done!");}
               else{
               System.out.println("failed");
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }

    
    public  void AddUserError(String error) {
       // instance of jsf facemessage class for display on browser
        FacesMessage message = new FacesMessage(error);
        //to append message to the html page
        FacesContext.getCurrentInstance().addMessage(null, message);
       
    }


    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getOdanames() {
        return odanames;
    }

    public void setOdanames(String odanames) {
        this.odanames = odanames;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getNat() {
        return nat;
    }

    public void setNat(String nat) {
        this.nat = nat;
    }

    public String getSoo() {
        return soo;
    }

    public void setSoo(String soo) {
        this.soo = soo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCourse() {
        return course;
    }
    

    

    public String getPrev_cert() {
        return prev_cert;
    }

   

    public String getDd() {
        return dd;
    }


    public String getBatch() {
        return batch;
    }

    public String getPro() {
        return pro;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPrev_cert(String prev_cert) {
        this.prev_cert = prev_cert;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }
}

    