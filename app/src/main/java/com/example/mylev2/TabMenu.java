package com.example.mylev2;

import android.media.Image;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TabMenu extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_menu);

        tabLayout = findViewById(R.id.tabMenu);
        viewPager = findViewById(R.id.viewPager);

        final PagerAdapter adapter = new PagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        setupIconTab();
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getPosition();
                String titleString = adapter.getPageTitle(tab.getPosition()).toString();
                TextView title = findViewById(R.id.title);
                title.setText(titleString);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setupIconTab(){

        for (int i=0;i<tabLayout.getTabCount();i++){
            int imageTab[] = {R.drawable.fabric, R.drawable.design, R.drawable.tailor, R.drawable.own};
            ImageView imageView = new ImageView(getApplicationContext());
            imageView.setImageResource(imageTab[i]);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(120,120);
            imageView.setLayoutParams(params);
            tabLayout.getTabAt(i).setCustomView(imageView);

        }
    }
}
