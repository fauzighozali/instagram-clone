package com.example.linustorvalds.listapps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ListView listView = (ListView) findViewById(R.id.ListView1);

        String data[] = {"fauzighozali","sasmastura","mayaaustin","fabianbagas"};
        String data2[] = {"Bogor","Jakarta","Bandung","Yogyakarta"};
        String data3[] = {"Siluman Ular Cucok","Indahnya Alam","Moment di Perantauan","Sederhana"};
        String data4[] = {"Lihat semua 16 komentar","Lihat semua 24 komentar","Lihat semua 11 komentar","Lihat semua 5 komentar"};
        String data5[] = {"omiholic,sasmastura,fauzighozali dan 47 lainnya","adityaravi,sasmastura,fikrigokil dan 50 lainnya",
                "visitbogor,explorebogor,wartaipb dan 90 lainnya","rimapuspita,saras dan 108 lainnya"};

        int img[]  = {R.drawable.upload, R.drawable.img2, R.drawable.maya, R.drawable.fabian};
        int img2[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};
        int img3[] = {R.drawable.blacklike, R.drawable.blacklike, R.drawable.blacklike, R.drawable.blacklike};

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        //ArrayAdapter adapter = new ArrayAdapter(this, R.layout.activity_list_detail, R.id.textView1, data);

        CustomAdapter adapter = new CustomAdapter(data, data2, data3, data4, data5, img, img2, img3, this);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String value = listView.getItemAtPosition(position).toString();

                Toast.makeText(getApplicationContext(),value,Toast.LENGTH_LONG).show();
            }
        });
    }


}
