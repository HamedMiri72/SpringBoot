package com.example.FirstProject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Scope(value = "prototype")
//by using this it means it will not create an object by default for us

public class Alien {

    //Alien has some attribute or property

    private int aid;
    private String aname;
    private String tech;
    @Autowired
    //it will try to search for the object in the spring continer, it will try to connect,
    //it will search for type not name , by the way the defult name id laptop, the default name for Alien is alien
    //if you want to search by name use Qulifier and then we should change the name in the Component in the corresponding class
    //@Qualifier("Lap1")
    private Laptop laptop;

    public Alien() {
        System.out.println("object created");
    }

    public int getAid() {
        return aid;
    }

    public String getAname() {
        return aname;
    }

    public String getTech() {
        return tech;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show()
    {
        System.out.println("in show");
        laptop.compile();
    }
}
