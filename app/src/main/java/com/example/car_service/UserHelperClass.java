package com.example.car_service;

public class UserHelperClass {

    String id,full_name,age_get,phone,pass;


    public UserHelperClass() {
    }

    public UserHelperClass(String id,String full_name,String age_get,String phone,String pass){

        this.id=id;
        this.full_name=full_name;
        this.age_get=age_get;
        this.phone=phone;
        this.pass=pass;

    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getAge_get() {
        return age_get;
    }

    public void setAge_get(String age_get) {
        this.age_get = age_get;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}



