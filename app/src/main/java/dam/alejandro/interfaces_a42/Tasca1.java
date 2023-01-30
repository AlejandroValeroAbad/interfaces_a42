package dam.alejandro.interfaces_a42;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

public class Tasca1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tasca1);

        TabLayout tabs = findViewById(R.id.tabs1);
        tabs.addTab(tabs.newTab().setText("Rojo"));
        tabs.addTab(tabs.newTab().setText("Verde"));
        tabs.addTab(tabs.newTab().setText("Azul"));

        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            TextView tv = findViewById(R.id.tv1);
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        tv.setText("Rojo");
                        tv.setBackgroundColor(Color.RED);
                        break;
                    case 1:
                        tv.setText("Verde");
                        tv.setBackgroundColor(Color.GREEN);
                        break;
                    case 2:
                        tv.setText("Azul");
                        tv.setBackgroundColor(Color.BLUE);
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
