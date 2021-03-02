package com.boumaiza.myapp.dao;

import java.util.List;
import java.util.ArrayList;
import com.boumaiza.myapp.model.*;

public class daoClass implements daoInterface{
    List<model> users;
    Integer max;
    public daoClass() {
        users=new ArrayList<>();
        users.add(new model(1,"abdellah boumaiza",
                "abdobmz","abdellahboumaiza@gmail.com"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(1,"John Doe",
                "jhon.doe@example.com","Jhon1"));
        users.add(new model(2,"Patrick Jane",
                "patrick.jane@example.com","JaneMentalist"));
        users.add(new model(4,"abdo boumaiza",
                "abdobmz","abdellahboumaiza@gmail.com"));
        max=2;
    }

    @Override
    public model addUser(model m) {
        m.setId(++max);
        users.add(m);
        return m;
    }

    @Override
    public model updateUser(model m) {
        for (model x:users)
            if(x.getId()==m.getId())
            {
                x.setName(m.getName());
                x.setEmail(m.getEmail());
                x.setUserName(m.getUserName());
                return x;
            }
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        for(model x:users){
            if(x.getId()==id)
            {
                users.remove(x);
                return true;
            }
        }
        return false;

    }

    @Override
    public model getUser(int id) {
        for (model m:users)
            if(m.getId()==id)
                return m;
        return null;
    }

    @Override
    public List<model> getusers() {
        return users;
    }
}
