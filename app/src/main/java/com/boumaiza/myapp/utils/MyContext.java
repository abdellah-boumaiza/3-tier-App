package com.boumaiza.myapp.utils;
import android.app.Application;
import android.app.Service;
import com.boumaiza.myapp.model.*;

import com.boumaiza.myapp.dao.*;
import com.boumaiza.myapp.business.*;

import java.util.ArrayList;

public class MyContext extends Application {
    serv service;
    public MyContext(){
        service = new services();
    }

    public serv getSer() {
        return service;
    }

}
