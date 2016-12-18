package me.daveranson;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by daver on 18/12/2016.
 */
@ManagedBean
@SessionScoped
public class Info {

    private String name = "Dave";

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

}
