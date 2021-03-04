package com.boumaiza.myapp.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.boumaiza.myapp.R;

public class Dialog extends AppCompatDialogFragment{
    private EditText editTextUsername;
    private EditText editTextName;
    private EditText editTextEmail;
    private DialogListener listener;
    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.add_dialog,null);
        builder.setView(view).setTitle("Ajout").setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        }).setPositiveButton("Ajouter", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String username = editTextUsername.getText().toString();
                String name = editTextName.getText().toString();
                String email = editTextEmail.getText().toString();
                listener.getFields(username, name, email);
            }
        });

        editTextUsername = view.findViewById(R.id.username);
        editTextName = view.findViewById(R.id.name);
        editTextEmail = view.findViewById(R.id.email);

        return builder.create();
    }

}
