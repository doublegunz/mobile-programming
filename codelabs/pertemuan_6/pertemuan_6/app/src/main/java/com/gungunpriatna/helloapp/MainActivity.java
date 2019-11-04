package com.gungunpriatna.helloapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] dataName = {"Adi Firmansyah", "Mugia Rasyida", "Ricky Susanyo Jaya"};
    private String[] dataNim = {"1630511051", "1630511052", "1630511054"};

    private ListView listView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv_list);

        adapter = new MahasiswaAdapter(this);

        listView.setAdapter(adapter);

        addItem();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (mahasiswaList.get(i).isCheck() == true) {
                    mahasiswaList.get(i).setCheck(false);
                    listView.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
                } else {
                    mahasiswaList.get(i).setCheck(true);
                    listView.getChildAt(i).setBackgroundColor(Color.GRAY);
                }


               // Toast.makeText(MainActivity.this, mahasiswaList.get(i).getNama(),
               //         Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void addItem() {
        mahasiswaList = new ArrayList<>();

        for (int i = 0; i < dataName.length; i++) {
            Mahasiswa mahasiswa = new Mahasiswa();
            mahasiswa.setNim(dataNim[i]);
            mahasiswa.setNama(dataName[i]);
            mahasiswa.setCheck(false);

            mahasiswaList.add(mahasiswa);
        }

        adapter.setMahasiswaList(mahasiswaList);
    }


}
