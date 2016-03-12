package com.atomic.glidebutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;


public class ButtonWorld extends AppCompatActivity {

    @Bind(R.id.button1) Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_world);

        ButterKnife.bind(this);

        btn1.setText("First");

    }

    @OnClick({R.id.button1, R.id.button2, R.id.button3})
    public void clicked(){
        Toast.makeText(ButtonWorld.this, "Button clicked", Toast.LENGTH_SHORT).show();
    }

    @OnLongClick({R.id.button4, R.id.button5, R.id.button6})
    public boolean longClick(){
        Toast.makeText(ButtonWorld.this, "Let me go", Toast.LENGTH_SHORT).show();

        return true;
    }

}

