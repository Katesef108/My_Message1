package com.example.my_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TextMassege extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_massege);
        textView=findViewById(R.id.textView);
        Bundle bundle=getIntent().getExtras();
        String inputmsg=bundle.getString("name").toString();
        textView.setText(inputmsg);
    }
}
