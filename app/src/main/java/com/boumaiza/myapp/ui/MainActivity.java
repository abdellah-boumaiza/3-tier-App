package com.boumaiza.myapp.ui;
import com.boumaiza.myapp.utils.*;
import androidx.appcompat.app.AppCompatActivity;
import com.boumaiza.myapp.model.*;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.boumaiza.myapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    MyContext context;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = (MyContext)getApplicationContext();

        listView = findViewById(R.id.listV);

        Adapter customAdapter = new Adapter(context);
        listView.setAdapter(customAdapter);

    }
}
