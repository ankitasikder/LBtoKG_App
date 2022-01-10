package com.example.lbtokg;
/*CREATED BY ANKITA SIKDER
email: ankita.sikder14@gmail.com*/
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText lbIn;
    Button submit;
    TextView kg;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbIn=(EditText) findViewById(R.id.lbIn);
        submit=(Button)findViewById(R.id.button);
        kg=(TextView)findViewById(R.id.output);
        iv=(ImageView)findViewById(R.id.lbImg);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(lbIn.getText().toString().isEmpty()){
                    kg.setText("Empty Input Value\nTry Again");

                }
                else{
                    Log.d("input",lbIn.getText().toString()+"lbs");
                    Log.d("output",(Double.parseDouble(lbIn.getText().toString())*0.453592)+"kg");
                    kg.setText("-: KG VALUE :- \n"+String.format("%.2f",(Double.parseDouble(lbIn.getText().toString())*0.453592))+"kg");
                    iv.setImageResource(R.drawable.pok);
                }

            }
        });

    }
    public void onClickOnKgIn(View view){
        Log.d("Response","Clicked lbs Input Editable Text ");
        iv=(ImageView)findViewById(R.id.lbImg);
        iv.setImageResource(R.drawable.lbpok);
    }
}
