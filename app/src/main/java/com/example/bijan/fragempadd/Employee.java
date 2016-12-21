package com.example.bijan.fragempadd;

/**
 * Created by Bijan on 12/20/2016.
 */

public class Employee {

    String eid,ename,esal;

    public Employee(String eid, String ename, String esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEsal() {
        return esal;
    }

    public void setEsal(String esal) {
        this.esal = esal;
    }
}
