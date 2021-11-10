package com.example.animationinlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_alpha, btn_translation, btn_scale, btn_rotate;
    ImageView ivElephant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_alpha = findViewById(R.id.bt_alpha);
        btn_translation = findViewById(R.id.bt_trans);
        btn_rotate = findViewById(R.id.bt_rotate);
        btn_scale = findViewById(R.id.bt_scale);
        ivElephant = findViewById(R.id.iv_animal);

        btn_alpha.setOnClickListener(this);
        btn_translation.setOnClickListener(this);
        btn_scale.setOnClickListener(this);
        btn_rotate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_alpha:
                ivElephant.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha));
                break;
            case R.id.bt_trans:
                ivElephant.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.translate));
                break;
            case R.id.bt_rotate:
                ivElephant.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotate));
                break;
            case R.id.bt_scale:
                ivElephant.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale));
                break;
        }
    }
}