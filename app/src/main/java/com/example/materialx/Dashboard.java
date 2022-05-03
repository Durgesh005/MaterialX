package com.example.materialx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dashboard extends AppCompatActivity {
    CardView statistic_btn, finance_btn, pay_btn, wallet_btn, green_btn, crypto_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        binding();
        statistic_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Statistic.class);
                startActivity(intent);
            }
        });
        finance_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Finance.class);
                startActivity(intent);
            }
        });
        pay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Payer.class);
                startActivity(intent);
            }
        });
        wallet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Blue_Wallet.class);
                startActivity(intent);
            }
        });
        green_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Green_Wallet.class);
                startActivity(intent);
            }
        });
        crypto_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dashboard.this, Crypto.class);
                startActivity(intent);
            }
        });
    }

    void binding() {
        statistic_btn = findViewById(R.id.statistic_btn);
        finance_btn = findViewById(R.id.finance_btn);
        pay_btn = findViewById(R.id.pay_btn);
        wallet_btn = findViewById(R.id.wallet_btn);
        green_btn = findViewById(R.id.green_btn);
        crypto_btn = findViewById(R.id.crypto_btn);
    }

}