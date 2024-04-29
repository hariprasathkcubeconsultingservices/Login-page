package com.HARI.login;

public class Emp {
    private String ename;
    private String passwrd;

    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public String getPasswrd() {
        return passwrd;
    }
    
    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;

    }
    @Override
    public String toString() {
        return "Emp [ename=" + ename + ", passwrd=" + passwrd + "]";
    }
}
