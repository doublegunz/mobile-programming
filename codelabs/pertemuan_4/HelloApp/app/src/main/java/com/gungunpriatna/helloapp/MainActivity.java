package com.gungunpriatna.helloapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtPesan;
    private Button btnKirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPesan = findViewById(R.id.edt_pesan);
        btnKirim = findViewById(R.id.btn_send);

        btnKirim.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_send) {
            Toast toast = Toast.makeText(this, "pesan terkirim", Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
