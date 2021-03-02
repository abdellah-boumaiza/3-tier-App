package com.boumaiza.myapp.utils;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import com.boumaiza.myapp.R;
import com.boumaiza.myapp.model.*;
import com.boumaiza.myapp.dao.*;

public class Adapter extends BaseAdapter{
    List<model> listData;
    MyContext context;
    LayoutInflater layoutInflater;


    public Adapter(MyContext ctx) {
        context = ctx;
        layoutInflater = LayoutInflater.from(ctx);
        listData = ctx.getSer().getusers();
    }

    @Override
    public int getCount() {
        return listData.size();
    }

    @Override
    public Object getItem(int position) {
        return listData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View contactView = layoutInflater.inflate(R.layout.adapter, null);
        model user = listData.get(position);

        TextView nameTextView = contactView.findViewById(R.id.textView1);
        TextView userNameTextView = contactView.findViewById(R.id.textView2);
        TextView emailTextView = contactView.findViewById(R.id.textView3);

        nameTextView.setText(user.getName());
        userNameTextView.setText(user.getUserName());
        emailTextView.setText(user.getEmail());


        return contactView;
    }
}
