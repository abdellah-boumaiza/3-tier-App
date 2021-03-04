package com.boumaiza.myapp.ui;
import com.boumaiza.myapp.utils.*;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.boumaiza.myapp.business.*;
import com.boumaiza.myapp.R;

public class MainActivity extends AppCompatActivity  implements Dialog{
    MyContext context;
    ListView listView;
    private Button addBtn;
    services serv = new services();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = (MyContext)getApplicationContext();
        listView = findViewById(R.id.listV);
        addBtn = findViewById(R.id.addbtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
        Adapter customAdapter = new Adapter(context);
        listView.setAdapter(customAdapter);
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("abdobmz","abdo");
                return false;
            }
        });

    }

    public void openDialog(){
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(),"dialog");
    }

}
