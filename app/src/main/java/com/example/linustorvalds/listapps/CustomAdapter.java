package com.example.linustorvalds.listapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Linus Torvalds on 3/2/2017.
 */

public class CustomAdapter extends BaseAdapter{
    String nama[];
    String kota[];
    String komen[];
    String caption[];
    String like[];
    int gambar[];
    int gambar2[];
    int gambar3[];
    Context context;
    LayoutInflater inflater;

    public CustomAdapter(String[] nama, String[] kota,String[] komen, String[] caption, String[] like, int[] gambar, int[] gambar2,int[] gambar3,Context context) {
        this.nama = nama;
        this.kota = kota;
        this.komen = komen;
        this.caption = caption;
        this.like = like;
        this.gambar = gambar;
        this.gambar2 = gambar2;
        this.gambar3 = gambar3;
        this.context = context;
        inflater = (LayoutInflater.from(context));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_list_detail, viewGroup,false);
        TextView txtNama = (TextView) view.findViewById(R.id.textView2);
        TextView txtKota = (TextView) view.findViewById(R.id.textView5);
        TextView txtKomen = (TextView) view.findViewById(R.id.textView4);
        TextView txtCaption = (TextView) view.findViewById(R.id.textView3);
        TextView txtLike = (TextView) view.findViewById(R.id.textView6);
        ImageView img = (ImageView) view.findViewById(R.id.imageView2);
        ImageView img2= (ImageView) view.findViewById(R.id.imageView3);
        ImageView img3= (ImageView) view.findViewById(R.id.imageView8);

        txtNama.setText(nama[i]);
        txtKota.setText(nama[i]);
        txtKomen.setText(komen[i]);
        txtCaption.setText(caption[i]);
        txtLike.setText(like[i]);
        img.setImageResource(gambar[i]);
        img2.setImageResource(gambar2[i]);
        img3.setImageResource(gambar3[i]);

        return view;
    }

    @Override
    public Object getItem(int i) {
        return nama[i];
    }

    @Override
    public int getCount() {
        return nama.length;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}


