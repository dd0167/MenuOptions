package com.example.menuoptions;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearl=(LinearLayout) findViewById(R.id.linearl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        if (st.equals("Yellow"))
        {
            linearl.setBackgroundColor(Color.YELLOW);
        }
        else if (st.equals("Green"))
        {
            linearl.setBackgroundColor(Color.GREEN);
        }
        else if (st.equals("Red"))
        {
            linearl.setBackgroundColor(Color.RED);
        }
        return true;
    }

    public void start(View view) {
        Intent in=new Intent(this,SecondActivity.class);
        startActivity(in);
    }
}