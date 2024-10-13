package estm.dsic.jee.services;

import java.sql.SQLException;

import estm.dsic.jee.controllers.Login;
import estm.dsic.jee.controllers.SignUp;
import estm.dsic.jee.dal.UserDao;
import jakarta.enterprise.inject.Model;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Model
@Named("myUserServices")
public class UserServices {
    @Inject FacesContext facesContext; 
    @Inject
    @ManagedProperty(value = "#{login}")
    private Login login;
    @Inject
    private UserDao userDao;
    public String check(){
        if (userDao.auth(login.getEmail(),login.getPasswd())){
            return "app";
        }
        else {
            FacesMessage message=new FacesMessage("login or password incorrect");
            facesContext.addMessage("form_login:id_login", message);
            return "login";
        }
    }



    @Inject
    @ManagedProperty(value = "#{signUp}")
    private SignUp signUp;
    
    public String signup() throws SQLException {
        if (!userDao.emailExists(signUp.getEmail())) {
            if (signUp.getPasswd().equals(signUp.getPasswd_comf())) {
                if (!signUp.getName().isEmpty() && !signUp.getEmail().isEmpty() && !signUp.getPasswd().isEmpty() && !signUp.getPasswd_comf().isEmpty()) {
                    if(userDao.addUser(signUp.getName(), signUp.getEmail(), signUp.getPasswd())) {
                        FacesMessage message = new FacesMessage("User created");
                        facesContext.addMessage(null, message);
                        return "login";
                    } else {
                        FacesMessage message = new FacesMessage("Error creating user");
                        facesContext.addMessage(null, message);
                        return "signup";
                    }
                } else {
                    FacesMessage message = new FacesMessage("All inputs are required");
                    facesContext.addMessage("form_sign:id_sign", message);
                    return "signup";
                }
            } else {
                FacesMessage message = new FacesMessage("Password does not match");
                facesContext.addMessage("form_sign:id_sign", message);
                return "signup";
            }
        } else {
            FacesMessage message = new FacesMessage("User already exists");
            facesContext.addMessage("form_sign:id_sign", message);
            return "signup";
        }
    }
}

