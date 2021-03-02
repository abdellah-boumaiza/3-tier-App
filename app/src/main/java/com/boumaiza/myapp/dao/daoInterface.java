package com.boumaiza.myapp.dao;
import com.boumaiza.myapp.model.*;
import java.util.List;

public interface daoInterface {

    public model addUser(model m);
    public model updateUser(model m);
    public boolean deleteUser(int id);
    public model getUser(int id);
    public List<model> getusers();

}
