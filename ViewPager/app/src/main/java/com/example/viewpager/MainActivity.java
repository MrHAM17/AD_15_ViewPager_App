package com.example.viewpager;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

//    Note:  Entire codebase is for only --> ViewPager with Fragments
//           BUT
//           3 steps mentioned here in this file are for --> ViewPager with Fragments & Tabs (for respective fragment)
    ViewPager2 viewpager ;
    MyViewPagerAdapter myAdapter ;

//    Step 1: Add UI code for TabLayout in XML file
//    Step 2.1: Declare variable @ TabLayout
    TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


//    Step 2.2: Define variable @ TabLayout
        tabLayout = findViewById(R.id.tablayout);

        myAdapter = new MyViewPagerAdapter(
                getSupportFragmentManager(),
                getLifecycle()
        );

        // Adding Fragments to the list in the Adapter Class
        myAdapter.addFragment(new Fragment_1());
        myAdapter.addFragment(new Fragment_2());
        myAdapter.addFragment(new Fragment_3());

        // Set the orientation in ViewPager2
        viewpager = findViewById(R.id.viewPager2);
        viewpager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        // Connecting the Adapter with ViewPager2
        viewpager.setAdapter(myAdapter);

//    Step 3: Connecting TabLayout with ViewPager
        new TabLayoutMediator(
                tabLayout,
                viewpager,
                new TabLayoutMediator.TabConfigurationStrategy(){
                    @Override
                    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                        tab.setText("Fragment" +(position+1));
                    }
                }
        ).attach();
    }
}