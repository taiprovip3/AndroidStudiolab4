package com.example.androidlab_07_03.lab4.lab4a;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.androidlab_07_03.R;

import java.util.List;

public class Adapter extends BaseAdapter {
    private Context context;
    private int idLayout;
    private List<DoDung> dodungs;

    private TextView name;
    private TextView des;
    private ImageView imageId;

    private int positionSelect = -1;

    public Adapter(Context context, int layoutInflater, List<DoDung> dodungs) {
        this.context = context;
        this.idLayout = layoutInflater;
        this.dodungs = dodungs;
    }

    @Override
    public int getCount() {
        return dodungs.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view == null)
            view = LayoutInflater.from(viewGroup.getContext()).inflate(idLayout, viewGroup, false);
        name = (TextView) view.findViewById(R.id.txtName);
        des = (TextView) view.findViewById(R.id.txtDes);
        imageId = view.findViewById(R.id.imageId);
        final ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.idView);
        final DoDung doDung = this.dodungs.get(i);

        name.setText("" + doDung.getName());
        des.setText("" + doDung.getDes());
        String imgId = doDung.getImageId();
        switch (imgId){
            case "ca_nau_lau":
                imageId.setImageResource(R.drawable.ca_nau_lau);
                break;
            case "do_choi_dang_mo_hinh":
                imageId.setImageResource(R.drawable.do_choi_dang_mo_hinh);
                break;
            case "ga_bo_toi":
                imageId.setImageResource(R.drawable.ga_bo_toi);
                break;
            case "hieu_long_con_tre":
                imageId.setImageResource(R.drawable.hieu_long_con_tre);
                break;
            case "lanh_dao_gian_don":
                imageId.setImageResource(R.drawable.lanh_dao_gian_don);
                break;
            case "xa_can_cau":
                imageId.setImageResource(R.drawable.xa_can_cau);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + imgId);
        }
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, doDung.getName(), Toast.LENGTH_LONG).show();
                positionSelect = i;
                notifyDataSetChanged();
            }
        });

        if (positionSelect == i) {
            constraintLayout.setBackgroundColor(Color.BLUE);
        } else {
            constraintLayout.setBackgroundColor(Color.WHITE);
        }
        return view;
    }
}
