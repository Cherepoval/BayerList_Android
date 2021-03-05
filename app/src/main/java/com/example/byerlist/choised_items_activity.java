package com.example.byerlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class choised_items_activity extends AppCompatActivity implements ListView.OnClickListener {
    private String[] selected_arr;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.byer_list);
        receiveIntent();


        ListView list2 = findViewById(R.id.list_tobye);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, selected_arr);
        list2.setAdapter(adapter2);


    }

    private void receiveIntent() {
        Intent i = getIntent();
        if (i != null) {
            selected_arr = (String[])i.getStringArrayExtra("selected");
            if (selected_arr == null) throw new AssertionError();
        }
    }

    @Override
    public void onClick(View v) {

    }
}



