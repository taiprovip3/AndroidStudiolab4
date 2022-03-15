package com.example.androidlab_07_03.lab4.lab4a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.androidlab_07_03.R;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ListView listView;
    List<DoDung> dodungs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodung_main);

        listView = (ListView) findViewById(R.id.listView);
        dodungs = new ArrayList<>();

        dodungs.add(new DoDung("Ca Nau Lau", "ca nau lau", "ca_nau_lau"));
        dodungs.add(new DoDung("do_choi_dang_mo_hinh", "do_choi_dang_mo_hinh", "do_choi_dang_mo_hinh"));
        dodungs.add(new DoDung("ga_bo_toi", "ga_bo_toi", "ga_bo_toi"));
        dodungs.add(new DoDung("hieu_long_tre_con", "hieu_long_tre_con", "hieu_long_con_tre"));
        dodungs.add(new DoDung("lanh_dao_gian_don", "lanh_dao_gian_don", "lanh_dao_gian_don"));
        dodungs.add(new DoDung("xa_can_cau", "xa_can_cau", "xa_can_cau"));

        Adapter adapter =new Adapter(this, R.layout.activity_dodung_item, dodungs);
        listView.setAdapter(adapter);
    }

}