package com.boumaiza.myapp.business;

import java.util.List;
import com.boumaiza.myapp.model.*;
import com.boumaiza.myapp.dao.*;

public class services implements serv{
    daoClass dao;

    public services() {
        dao = new daoClass();
    }

    @Override
    public model addUser(model m) {
        return dao.addUser(m);
    }

    @Override
    public model updateUser(model m) {
        return dao.updateUser(m);
    }

    @Override
    public boolean deleteUser(int id) {
        return dao.deleteUser(id);
    }

    @Override
    public model getUser(int id) {
        return dao.getUser(id);
    }

    @Override
    public List<model> getusers() {
        return dao.getusers();
    }
}
