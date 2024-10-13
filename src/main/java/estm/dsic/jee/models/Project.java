package estm.dsic.jee.models;

import java.sql.Date;
import java.util.List;

public class Project {
    private int id ;
    private String name ;
    private Date start_date;
    private Date end_date;
    private State state ;
    private Employee projectManager; 
    private List<Employee> empl;
    private List<Task> tasks;
    
    public Project(int id, String name, Date start_date, Date end_date, State state, List<Employee> empl,List<Task> tasks) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.state = state;
        this.empl = empl;
        this.tasks = tasks;
    }
    public List<Employee> getEmpl() {
        return empl;
    }
    public void setEmpl(List<Employee> empl) {
        this.empl = empl;
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
    public void setState(State state) {
        this.state = state;
    }
    public Project(int id, String name, Date start_date, Date end_date, State state) {
        this.id = id;
        this.name = name;
        this.start_date = start_date;
        this.end_date = end_date;
        this.state = state;
    }
    public Project() {
    }

    
    

}
