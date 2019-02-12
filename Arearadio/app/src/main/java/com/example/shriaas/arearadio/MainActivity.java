package com.example.shriaas.arearadio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    EditText et1,et2,et3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.calc);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        rg=findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String option =(String)((RadioButton)findViewById(rg.getCheckedRadioButtonId())).getText();
                if(option.equals("Circle")){
                    et2.setVisibility(View.INVISIBLE);
                    et3.setVisibility(View.INVISIBLE);
                    et1.setVisibility(View.VISIBLE);
                    et1.setText("Enter Radius");
                    btn.setVisibility(View.VISIBLE);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            float radius = Float.parseFloat(et1.getText().toString());
                            double area = 3.14 * radius * radius;
                            Toast.makeText(getApplicationContext(), "Area of circle=" + area, Toast.LENGTH_LONG).show();
                        }
                    });
                }
                else if(option.equals("Rectangle")){
                    et3.setVisibility(View.INVISIBLE);
                    et2.setVisibility(View.VISIBLE);
                    et1.setVisibility(View.VISIBLE);
                    et1.setText("Enter Length");
                    et2.setText("Enter width");
                    btn.setVisibility(View.VISIBLE);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            float length = Float.parseFloat(et1.getText().toString());
                            float width = Float.parseFloat(et2.getText().toString());
                            double area =length*width;
                            Toast.makeText(getApplicationContext(),"Area of rectangle="+area,Toast.LENGTH_LONG).show();
                        }


                });
            }
                else if(option.equals("Triangle")){
                    et3.setVisibility(View.VISIBLE);
                    et2.setVisibility(View.VISIBLE);
                    et1.setVisibility(View.VISIBLE);
                    et1.setText("Enter side1 ");
                    et2.setText("Enter side2");
                    et3.setText("Enter side3");
                    btn.setVisibility(View.VISIBLE);
                    btn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            float s1 = Float.parseFloat(et1.getText().toString());
                            float s2 = Float.parseFloat(et2.getText().toString());
                            float s3 = Float.parseFloat(et3.getText().toString());
                            float semi = (s1+s2+s3)/2;
                            double area = Math.sqrt(semi*(semi-s1)*(semi-s2)*(semi-s3));
                            Toast.makeText(getApplicationContext(),"Area of triangle="+area,Toast.LENGTH_LONG).show();
                        }


                    });
                }

            }
        });
    }
}
