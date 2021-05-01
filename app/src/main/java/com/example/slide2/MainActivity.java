package com.example.slide2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.yarolegovich.slidingrootnav.SlideGravity;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(" ");
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_launcher_foreground);

        new SlidingRootNavBuilder(this).withToolbarMenuToggle(toolbar).withMenuOpened(false).withMenuLayout(R.layout.test).withGravity(SlideGravity.RIGHT).withDragDistance(250).inject();

        Button btn=findViewById(R.id.View3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MainActivity2.class));

            }
        });


    }

}

//##########################################################
//files required
//        MainActivity.java
//        Activity_main.xml
//        test.xml
//        circle.xml
//        styles.xml
//        grad.xml
//        font -numans.xml
//        build.gradle(:app)
//###########################################################

