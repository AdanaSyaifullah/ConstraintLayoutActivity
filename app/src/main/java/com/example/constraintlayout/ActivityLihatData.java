package com.example.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Simon":
                tvnama.setText("Simon");
                tvnomor.setText("0812222222222");
                break;
            case "Petrus":
                tvnama.setText("Petrus");
                tvnomor.setText("0812222222223");
                break;
            case "Andreas":
                tvnama.setText("Andreas");
                tvnomor.setText("0812222222224");
                break;
            case "Yakobus":
                tvnama.setText("Yakobus");
                tvnomor.setText("0812222222225");
                break;
            case "Yohanes":
                tvnama.setText("Yohanes");
                tvnomor.setText("0812222222226");
                break;
            case "Filipus":
                tvnama.setText("Filipus");
                tvnomor.setText("081222222227");
                break;
            case "Thomas":
                tvnama.setText("Thomas");
                tvnomor.setText("0812222222228");
                break;
            case "Ali bin Abi thalib":
                tvnama.setText("Ali bin Abi Thalib");
                tvnomor.setText("0812222222229");
                break;
            case "Mehmet":
                tvnama.setText("Mehmet");
                tvnomor.setText("0812222222210");
                break;
            case "Toni":
                tvnama.setText("toni");
                tvnomor.setText("0812222222211");
                break;
    }
}
}