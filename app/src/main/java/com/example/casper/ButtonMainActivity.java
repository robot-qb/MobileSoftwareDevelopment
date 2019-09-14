package com.example.casper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ButtonMainActivity extends AppCompatActivity {

    private Button buttonHelloEn,buttonHelloCz;
    private TextView textViewHelloWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);

        buttonHelloEn=findViewById(R.id.buttonHelloEn);
        buttonHelloCz=findViewById(R.id.buttonHelloCz);
        textViewHelloWorld=findViewById(R.id.textViewHelloWorld);

        buttonHelloCz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewHelloWorld.setText(buttonHelloCz.getText());
            }
        });
        buttonHelloEn.setOnClickListener(new ButtonOnClick());
    }

    private class ButtonOnClick implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            textViewHelloWorld.setText(((Button)view).getText());
        }
    }
}
