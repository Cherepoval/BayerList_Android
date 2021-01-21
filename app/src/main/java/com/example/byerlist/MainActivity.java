package com.example.byerlist;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {
    private ListView list;
    private String[] arr;
    private ArrayAdapter<String> adapter;
    private AppBarConfiguration mAppBarConfiguration;
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.listArray);
        arr = getResources().getStringArray(R.array.meat);
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,new ArrayList<String>(Arrays.asList(arr)));
        list.setAdapter(adapter);
        Toolbar toolbar = findViewById(R.id.toolbar);
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
            arr = getResources().getStringArray(R.array.meat);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();
        }
        else if (id == R.id.nav_bread) {
            arr = getResources().getStringArray(R.array.bread);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_fish) {
            arr = getResources().getStringArray(R.array.fish);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_fruit) {
            arr = getResources().getStringArray(R.array.fruits);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_dessert) {
            arr = getResources().getStringArray(R.array.dessert);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_gastr) {
            arr = getResources().getStringArray(R.array.gastronomy);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_grocery) {
            arr = getResources().getStringArray(R.array.grocery);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_water) {
            arr = getResources().getStringArray(R.array.drink);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_milk) {
            arr = getResources().getStringArray(R.array.milk);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_rice) {
            arr = getResources().getStringArray(R.array.groats_pasta);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();

        }else if (id == R.id.nav_spices) {
            arr = getResources().getStringArray(R.array.spices);
            adapter.clear();
            adapter.addAll(arr);
            adapter.notifyDataSetChanged();
        }



            drawer.closeDrawer(GravityCompat.START);
            return true;

    }

    public void click_meat(MenuItem item) {
    }
}
