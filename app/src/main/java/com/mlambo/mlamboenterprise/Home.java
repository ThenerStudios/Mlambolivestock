package com.mlambo.mlamboenterprise;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.TextView;
import com.mlambo.mlamboenterprise.Auth.PhoneAuth;
import com.mlambo.mlamboenterprise.Fragments.DashboardFragment;
import com.mlambo.mlamboenterprise.Fragments.HomeFragmant;
import com.mlambo.mlamboenterprise.Fragments.NotificationFragment;

public class Home extends AppCompatActivity {
    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                new HomeFragmant()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            Fragment selectFragment = null;

            switch (item.getItemId())
            {
                case R.id.navigation_home:
                    selectFragment = new HomeFragmant();
                    break;

                case R.id.navigation_dashboard:
                    selectFragment = new DashboardFragment();
                    break;

                case R.id.navigation_notifications:
                    selectFragment = new NotificationFragment();
                    break;

            }

            assert selectFragment != null;
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    selectFragment).commit();

            return true;
        }
    };

    @Override
    protected void onStart() {
        super.onStart();

        //startActivity(new Intent(this, PhoneAuth.class));
    }
}
