package com.example.interproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class google_map_location extends AppCompatActivity {
    //Initialize Variable
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_map_location);

        //Assign Variables
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        drawerLayout = findViewById(R.id.googMapLocation_layout);

        //Set Parking Selected
        bottomNavigationView.setSelectedItemId(R.id.parkingNav);

        //Perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.parkingNav:
                        return true;
                    /*case R.id.bookingNav:
                        startActivity(new Intent(getApplicationContext(), Booking.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.walletsNav:
                        startActivity(new Intent(getApplicationContext(), Wallets.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.meNav:
                        startActivity(new Intent(getApplicationContext(), Me.class));
                        overridePendingTransition(0, 0);
                        return true;*/
                }
                return false;
            }
        });
    }

    public void ClickMenu(View view) {
        //Open drawer
        openDrawer(drawerLayout);
    }

    private static void openDrawer(DrawerLayout drawerLayout) {
        //Open drawer Layout
        drawerLayout.openDrawer(GravityCompat.START);
    }

    public void ClickLogo(View view) {
        //Close drawer
        closeDrawer(drawerLayout);
    }

    private static void closeDrawer(DrawerLayout drawerLayout) {
        //Close drawer Layout
        //Check condition
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            //When drawer is open
            //Close drawer
            drawerLayout.closeDrawer(GravityCompat.START);
        }
    }

    public void ClickHome(View view) {
        //Recreate activity
        recreate();
    }

    /*public void ClickDashboard(View view) {
        //Redirect activity to dashboard
        redirectActivity(this,);
    }

    public void ClickAbout(View view) {
        //Redirect activity to About Us
        redirectActivity(this, );
    }*/

    public void ClickLogout(View view) {
        //Redirect activity to Welcome page
        logout(this);
    }

    private static void logout(Activity activity) {
        //Initialize alert dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        //Set Title
        builder.setTitle("Logout");
        //Set Message
        builder.setMessage("Are you sure you want to logout?");
        //Positive Yes Button
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Finish Activity
                activity.finishAffinity();
                //Exit App
                System.exit(0);
            }
        });
        //Negative No Button
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Dismiss Dialog
                dialog.dismiss();
            }
        });
        //Show dialog
        builder.show();
    }

    private static void redirectActivity(Activity activity, Class aClass) {
        //Initialize Intent
        Intent intent = new Intent(activity, aClass);
        //set flag
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        //Start Activity
        activity.startActivity(intent);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Close Drawer
        closeDrawer(drawerLayout);
    }
}