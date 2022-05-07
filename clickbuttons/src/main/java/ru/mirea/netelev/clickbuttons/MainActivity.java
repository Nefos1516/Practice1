package ru.mirea.netelev.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;     private Button OkBtn;     private Button CancelBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOut = (TextView) findViewById(R.id.tvOut);
        OkBtn = (Button) findViewById(R.id.OkBtn);
        CancelBtn = (Button) findViewById(R.id.CancelBtn);
        @SuppressLint("SetTextI18n") View.OnClickListener oclOkBtn = view -> tvOut.setText("Нажата кнопка OK");
        @SuppressLint("SetTextI18n") View.OnClickListener oclCancelBtn = view -> tvOut.setText("Нажата кнопка Cancel");
        OkBtn.setOnClickListener(oclOkBtn);
        CancelBtn.setOnClickListener(oclCancelBtn);
    }


}