package com.example.byerlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    private String[] arr;
    private ArrayAdapter<String> adapter;
    private DrawerLayout drawer;
    private Toolbar toolbar;
    private final ArrayList<String> arr2;


    public MainActivity(ArrayList<String> arr2) {
        this.arr2 = arr2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = findViewById(R.id.listArray);
        arr = getResources().getStringArray(R.array.meat);
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, new ArrayList<>(Arrays.asList(arr)));
        list.setAdapter(adapter);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.menu_meat);
        setSupportActionBar(toolbar);
        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        navigationView.setNavigationItemSelectedListener(this);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        ListView list2 = findViewById(R.id.list_tobye);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ListView textView = findViewById(R.id.listArray);
                String itemName = textView.getSelectedItem().toString();
                arr2.add(itemName);

            }

        });
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this,
                android.R.layout.simple_expandable_list_item_1, new ArrayList<String>(arr2));
        list2.setAdapter(adapter2);

        Button OutButton = findViewById(R.id.button_out);

        OutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,choised_items_activity.class);
                startActivity(intent);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.nav_meat) {
            toolbar.setTitle(R.string.menu_meat);
            arr = getResources().getStringArray(R.array.meat);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_bread) {
            toolbar.setTitle(R.string.menu_bread);
            arr = getResources().getStringArray(R.array.bread);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_fish) {
            toolbar.setTitle(R.string.menu_fish);
            arr = getResources().getStringArray(R.array.fish);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_fruit) {
            toolbar.setTitle(R.string.menu_fruit);
            arr = getResources().getStringArray(R.array.fruits);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_dessert) {
            toolbar.setTitle(R.string.menu_dessert);
            arr = getResources().getStringArray(R.array.dessert);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_gastr) {
            toolbar.setTitle(R.string.menu_gastr);
            arr = getResources().getStringArray(R.array.gastronomy);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_grocery) {
            toolbar.setTitle(R.string.menu_grocery);
            arr = getResources().getStringArray(R.array.grocery);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_water) {
            toolbar.setTitle(R.string.menu_water);
            arr = getResources().getStringArray(R.array.drink);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_milk) {
            toolbar.setTitle(R.string.menu_milk);
            arr = getResources().getStringArray(R.array.milk);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_rice) {
            toolbar.setTitle(R.string.menu_rice);
            arr = getResources().getStringArray(R.array.groats_pasta);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_spices) {
            toolbar.setTitle(R.string.menu_spices);
            arr = getResources().getStringArray(R.array.spices);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();
        }



            drawer.closeDrawer(GravityCompat.START);
            return true;

    }



}
