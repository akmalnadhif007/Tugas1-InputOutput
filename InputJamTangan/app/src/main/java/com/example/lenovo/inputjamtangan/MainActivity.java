package com.example.lenovo.inputjamtangan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eJenis;
    private EditText eWarna;
    private EditText eJumlah;
    private Button bCetak;
    private TextView tOutputjenis;
    private TextView tOutputwarna;
    private TextView tOutputjumlah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eJenis = findViewById(R.id.jenis);
        eWarna = findViewById(R.id.warna);
        eJumlah = findViewById(R.id.jumlah);
        bCetak = findViewById(R.id.idcetak);
        tOutputjenis = findViewById(R.id.outputjenis);
        tOutputwarna = findViewById(R.id.outputwarna);
        tOutputjumlah = findViewById(R.id.outputjumlah);

        bCetak.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String inputJenis = eJenis.getText().toString();
        String inputWarna = eWarna.getText().toString();
        String inputJumlah = eJumlah.getText().toString();

        if (inputJenis.length() == 0) {
            eJenis.setError("Data tidak boleh kosong");
        } else {
            tOutputjenis.setText(inputJenis);
        }
        if (inputWarna.length() == 0) {
            eWarna.setError("Data tidak boleh kosong");
        } else {
            tOutputwarna.setText(inputWarna);
        }
        if (inputJumlah.length() == 0) {
            eJumlah.setError("Data tidak boleh kosong");
        } else {
            tOutputjumlah.setText(inputJumlah);
        }
    }
}
