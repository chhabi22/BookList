package com.example.booklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity
{

    private ImageView image;
    private TextView name, description;
    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        extras = getIntent().getExtras();

        image = findViewById(R.id.dImage);
        name = findViewById(R.id.dTitle);
        description = findViewById(R.id.dDescription);

        if (extras !=  null){
            image.setImageResource(extras.getInt("image"));
            name.setText(extras.getString("name"));
            description.setText(extras.getString("description"));
        }
    }
}
