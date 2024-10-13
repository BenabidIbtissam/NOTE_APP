
package estm.dsic.jee.controllers;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
@Named
@SessionScoped

    public class SignUp implements Serializable{
    private String name;
    private String email;
    private String passwd;
    private String passwd_comf;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPasswd() {
        return passwd;
    }
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    public String getName() {
        return name;
    }
    public String getPasswd_comf() {
        return passwd_comf;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPasswd_comf(String passwd_comf) {
        this.passwd_comf = passwd_comf;
    }
   


  




    
    
}
