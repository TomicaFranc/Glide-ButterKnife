package com.atomic.glidebutterknife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.imageView1) ImageView backImage1;
    @Bind(R.id.imageView2) ImageView backImage2;
    @Bind(R.id.imageButton) ImageButton buttonImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        loadImages();
    }

    private void loadImages() {
        Glide.with(this).load("http://goo.gl/gEgYUd").centerCrop().into(backImage1);

        Glide.with(this).load(R.mipmap.ic_launcher).centerCrop().into(backImage2);

        Glide.with(this).load("http://www.dancenews.org/wp-content/uploads/2015/03/next-button-black-2.png").centerCrop().into(buttonImage);
    }

    @OnClick(R.id.imageButton)
    public void click(){
        Toast.makeText(MainActivity.this, "Going to button world", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, ButtonWorld.class);
        startActivity(intent);
    }

}
