package estm.dsic.jee.controllers;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.ExternalContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;
@Named
@SessionScoped
public class Login implements Serializable{
  
    private String email;
    private String passwd;
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
    

    @Inject ExternalContext ec;
    public String logout(){
        ec.invalidateSession();
        return "login";
    }
    
    
}
