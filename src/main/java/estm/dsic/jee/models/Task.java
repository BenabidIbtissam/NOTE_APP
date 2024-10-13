package estm.dsic.jee.models;

import java.sql.Date;

public class Task {
    private int id ;
    private String name ;
    private Project project;
    private Date start_date;
    private Date end_date;
    private State state ;
    
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
    public Project getProject() {
        return project;
    }
    public void setProject(Project project) {
        this.project = project;
    }
    public Date getStart_date() {
        return start_date;
    }
    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }
    public Date getEnd_date() {
        return end_date;
    }
    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    public State getState() {
        return state;
    }
    public Task() {
    }
    public void setState(State state) {
        this.state = state;
    }
    public Task(int id, String name, Project project, Date start_date, Date end_date, State state) {
        this.id = id;
        this.name = name;
        this.project = project;
        this.start_date = start_date;
        this.end_date = end_date;
        this.state = state;
    }
    
    




    
}
