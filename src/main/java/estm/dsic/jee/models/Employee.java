package estm.dsic.jee.models;

import java.io.Serializable;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
@Named
@SessionScoped
public class Employee implements Serializable{


    private int id;
    private String name ;
    private String email;
    private String passorwd;
    private boolean isManager ;
    private List<Project> projects;
    private List<Task> tasks;
    
    public Employee(int id, String name, String email, String passorwd, boolean isManager, List<Project> projects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passorwd = passorwd;
        this.isManager = isManager;
        this.projects = projects;
    }
    public List<Project> getProjects() {
        return projects;
    }
    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassorwd() {
        return passorwd;
    }
    public void setPassorwd(String passorwd) {
        this.passorwd = passorwd;
    }
    public boolean isManager() {
        return isManager;
    }
    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }


    public Employee(int id, String name, String email, String passorwd, boolean isManager) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.passorwd = passorwd;
        this.isManager = isManager;
    }

    public Employee() {
    }
    public List<Task> getTasks() {
        return tasks;
    }
    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }


   
  
    




}