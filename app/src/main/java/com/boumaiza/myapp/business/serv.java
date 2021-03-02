package com.boumaiza.myapp.business;
import java.util.List;
import com.boumaiza.myapp.model.*;
import com.boumaiza.myapp.*;

public interface serv {
    public model addUser(model m);
    public model updateUser(model m);
    public boolean deleteUser(int id);
    public model getUser(int id);
    public List<model> getusers();
}
