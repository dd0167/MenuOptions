package com.example.menuoptions;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class SecondActivity extends AppCompatActivity {

    LinearLayout linear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        linear=(LinearLayout) findViewById(R.id.linear);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,250,"Blue");
        return true;
    }

    public void back(View view) {
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String st=item.getTitle().toString();
        if (st.equals("Yellow"))
        {
            linear.setBackgroundColor(Color.YELLOW);
        }
        else if (st.equals("Green"))
        {
            linear.setBackgroundColor(Color.GREEN);
        }
        else if (st.equals("Red"))
        {
            linear.setBackgroundColor(Color.RED);
        }
        else if (st.equals("Blue"))
        {
            linear.setBackgroundColor(Color.BLUE);
        }
        return true;
    }
}