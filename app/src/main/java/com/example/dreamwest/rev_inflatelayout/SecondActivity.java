package com.example.dreamwest.rev_inflatelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_second;
    private EditText edit_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn_second = (Button) findViewById(R.id.btn_second);
        edit_second = (EditText) findViewById(R.id.edit_second);
        Bundle bundle = getIntent().getExtras();
        String stringFromMain = bundle.getString("main");
        Toast.makeText(this,stringFromMain,Toast.LENGTH_LONG);
        btn_second.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
