package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView helloText;
    Button helloButton;
    ImageView helloImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloText = (TextView) findViewById(R.id.labelHW);
        helloButton = (Button) findViewById(R.id.button);
        helloImage = (ImageView) findViewById(R.id.imageView2);

    }

    public void onHelloClick(View view){
        helloText.setText("Hello There");
        helloImage.setImageResource(R.mipmap.download);
    }
}