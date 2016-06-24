package com.example.dreamwest.rev_inflatelayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_main;
    private EditText edit_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LayoutInflater inflater = getLayoutInflater();
        RelativeLayout RootView = (RelativeLayout) inflater.inflate(R.layout.activity_main, null);
        FrameLayout frame_container = (FrameLayout) RootView.findViewById(R.id.framelayout_view);
        inflater.inflate(R.layout.overlayout, frame_container, true);
        setContentView(RootView);

        btn_main = (Button) findViewById(R.id.btn_main);
        edit_main = (EditText) findViewById(R.id.edit_main);
        btn_main.setOnClickListener(this);
        //随便改改
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle bundle = new Bundle();
        if (edit_main.getText() != null) {
            bundle.putString("main", String.valueOf(edit_main.getText()));
        }else{
            bundle.putString("main", "null");
        }
        intent.putExtras(bundle);
        startActivityForResult(intent, 10010);
    }
}
