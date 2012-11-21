package com.automatedarchitecture;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LeadersActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaders);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_leaders, menu);
        return true;
    }
}
