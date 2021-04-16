package com.example.ministety;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Animation topAnim ,bassAnim;
   ImageView image ,image2;
   TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bassAnim = AnimationUtils.loadAnimation(this,R.anim.bass_anim);
        image =findViewById(R.id.imageView2);
        image2 =findViewById(R.id.imageView);
        /*text = findViewById(R.id.textView);*/
        image.setAnimation(topAnim );
        image2.setAnimation(bassAnim);
        /*text.setAnimation(bassAnim);*/


    }
}