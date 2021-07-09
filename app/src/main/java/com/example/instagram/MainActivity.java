package com.example.instagram;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.instagram.fragments.ComposeFragment;
import com.example.instagram.fragments.PostsFragment;
import com.example.instagram.fragments.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    final FragmentManager fragmentManager = getSupportFragmentManager();
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment;
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        // Toast.makeText(MainActivity.this, "Home!", Toast.LENGTH_SHORT).show();
                        fragment = new PostsFragment();
                        break;
                    case R.id.action_create:
                        // Toast.makeText(MainActivity.this, "Create!", Toast.LENGTH_SHORT).show();
                        fragment = new ComposeFragment();
                        break;
                    case R.id.action_profile:
                    default:
                        // TODO: update fragment
                        // Toast.makeText(MainActivity.this, "Profile!", Toast.LENGTH_SHORT).show();
                        fragment = new ProfileFragment();
                        break;
                }
                // replace frame layout with whichever fragment corresponds to the button selected
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit();
                return true;
            }
        });
        // set default selection
        bottomNavigationView.setSelectedItemId(R.id.action_home);

//        Intent i = new Intent(this, FeedActivity.class);
//        startActivity(i);

    }

}