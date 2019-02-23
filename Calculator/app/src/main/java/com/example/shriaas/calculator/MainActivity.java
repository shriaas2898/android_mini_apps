package com.example.shriaas.calculator;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar sb1,sb2,sb3;
    TextView tv1,tv2,tv3,ch;
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sb1 = findViewById(R.id.seekBar);
        tv1 = findViewById(R.id.textView);
        sb2 = findViewById(R.id.seekBar2);
        tv2 = findViewById(R.id.textView2);
        sb3 = findViewById(R.id.seekBar3);
        tv3 = findViewById(R.id.textView3);
        cl = findViewById(R.id.clayout);
        ch = findViewById(R.id.colorhash);
        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv1.setTextColor(Color.rgb(00, sb1.getProgress(), 00));
                setBackground();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv2.setTextColor(Color.rgb(00, 00, sb1.getProgress()));
                setBackground();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                tv3.setTextColor(Color.rgb(sb1.getProgress(), 00, 00));
                setBackground();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
        public void setBackground(){

            cl.setBackgroundColor(Color.rgb(sb3.getProgress(),sb1.getProgress(),sb2.getProgress()));
            String hash;
            hash = " "+sb3.getProgress()+" "+sb1.getProgress()+" "+sb2.getProgress();
            ch.setText("#"+hash);
            ch.setTextColor(Color.rgb((255-sb3.getProgress()),(255-sb1.getProgress()),(255-sb2.getProgress())));
    }


}