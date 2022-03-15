package com.example.androidlab_07_03.lab4.lab4b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.androidlab_07_03.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daycap_main);


        List<DayCap> dayCapList = new ArrayList<>();
        dayCapList.add(new DayCap("dauchuyendoi","Đầu chuyển Đổi","69.999"));
        dayCapList.add(new DayCap("dauchuyendoipsps2","Đầu chuyển Đổi IpSp2","69.999"));
        dayCapList.add(new DayCap("daynguon", "Đây nguồn Chính hãng", "69.999"));
        dayCapList.add(new DayCap("giacchuyen", "Giắc Chuyên Dụng", "69.999"));
        final GridView gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(new Adapater(this, dayCapList));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = gridView.getItemAtPosition(position);
                DayCap dayCap = (DayCap) o;
                Toast.makeText(MainActivity.this, "Selected :"
                        + " " + dayCap, Toast.LENGTH_LONG).show();
            }
        });

    }
}