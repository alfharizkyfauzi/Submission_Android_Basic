package com.example.alfhasubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListdataActivity extends AppCompatActivity {
    TextView name;
    ImageView image;
    TextView detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        name = findViewById(R.id.listdata);
        image = findViewById(R.id.imageView);
        detail = findViewById(R.id.textcontent);

        Intent intent = getIntent();

        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("image",0));
        detail.setText(intent.getStringExtra("detail"));
    }
}
