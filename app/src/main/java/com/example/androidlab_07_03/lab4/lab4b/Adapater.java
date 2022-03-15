package com.example.androidlab_07_03.lab4.lab4b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidlab_07_03.R;

import java.util.List;

public class Adapater extends BaseAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<DayCap> dayCaps;

    private ImageView imageCap;
    private TextView txtName;
    private TextView txtPrice;

    public Adapater(Context context, List<DayCap> dayCaps) {
        this.context = context;
        this.dayCaps = dayCaps;
        layoutInflater = LayoutInflater.from(context);//tạo ra 1 layout con từ frame mainActiviy
    }

    @Override
    public int getCount() {
        return dayCaps.size();
    }

    @Override
    public Object getItem(int i) {
        return dayCaps.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
            view = layoutInflater.inflate(R.layout.activity_daycap_item, null); //Khởi tạo frame con có sẵn trong subframe gắn vào convertView
        imageCap = (ImageView) view.findViewById(R.id.imageCap);
        txtName = (TextView) view.findViewById(R.id.capName);
        txtPrice = (TextView) view.findViewById(R.id.capPrice);

        DayCap dc = this.dayCaps.get(i);
        txtName.setText(dc.getNameCap());
        txtPrice.setText(dc.getPriceCap());
        String idImage = dc.getImageCap();
        switch (idImage){
            case "dauchuyendoi":
                imageCap.setImageResource(R.drawable.dauchuyendoi);
                break;
            case "dauchuyendoiipsps2":
                imageCap.setImageResource(R.drawable.dauchuyendoipsps2);
                break;
            case "daynguon":
                imageCap.setImageResource(R.drawable.daynguon);
                break;
            case "giacchuyen":
                imageCap.setImageResource(R.drawable.giacchuyen);
                break;
        }
        return view;
    }
}
