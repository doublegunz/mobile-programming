package com.gungunpriatna.aplikasilatihan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	private TextView txtTulisan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // deklarasi object TextView yang ada di layout activity_main.xml
		txtTulisan = findViewById(R.id.txt_tulisan);

		txtTulisan.setText("selamat belajar.");
    }
}
