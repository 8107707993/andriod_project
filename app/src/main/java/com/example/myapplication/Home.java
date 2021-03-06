package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        drawerLayout=findViewById(R.id.drawer);
        toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView=findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                Intent intent;
                switch (id)
                {
                    case R.id.home:
                      intent= new Intent(Home.this,Home.class);
                        startActivity(intent);
                        break;

                    case R.id.search:
                      intent= new Intent(Home.this,MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.contact:
                        intent= new Intent(Home.this,MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.calc:
                        intent= new Intent(Home.this,MainActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.setting:
                      intent= new Intent(Home.this,SettingsActivity.class);
                        startActivity(intent);
                        break;
                    default:
                        return true;

                }
                return true;
            }
        });





    }

    public void onClick(View view) {
    }
}