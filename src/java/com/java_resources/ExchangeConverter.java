/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java_resources;

import javax.faces.bean.ManagedBean;



/**
 *
 * @author EVELYN
 */
@ManagedBean
public class ExchangeConverter{
   private final String id,fname,lname,oname,age,email,nat,dept,qual,batch,yoa,pro,gen;
  

public ExchangeConverter(String id, String fname, String lname, String oname, String age, String email, String nat, String dept, String qual, String batch, String yoa , String pro, String gen) {
              this.id = id;
              this.fname = fname;
              this.lname =lname;
              this.oname = oname;
              this.age = age;
              this.email = email;
              this.nat = nat;
              this.dept =dept;
              this.qual= qual;
              this.batch=batch;
              this.yoa= yoa;
              this.pro = pro;
              this.gen=gen;
    }

 
    public String getId() {
        return id;
    }

    

    public String getFname() {
        return fname;
    }

   
    public String getLname() {
        return lname;
    }

   

    public String getOname() {
        return oname;
    }

  

    public String getAge() {
        return age;
    }

    

    public String getEmail() {
        return email;
    }

    

    public String getNat() {
        return nat;
    }

    

    public String getDept() {
        return dept;
    }

    

    public String getQual() {
        return qual;
    }

    

    public String getBatch() {
        return batch;
    }

   

    public String getYoa() {
        return yoa;
    }

   

    public String getPro() {
        return pro;
    }

   
    public String getGen() {
        return gen;
    }

   

   
}
