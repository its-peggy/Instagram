package com.example.instagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.parse.FindCallback;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import org.parceler.Parcels;

import java.util.Date;

public class PostDetailActivity extends AppCompatActivity {

    private TextView tvUsername;
    private ImageView ivImage;
    private TextView tvDescription;
    private TextView tvRelativeTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String imageURL = intent.getStringExtra("imageURL");
        String description = intent.getStringExtra("description");
        String timeAgo = intent.getStringExtra("timeAgo");

        // post = (Post) Parcels.unwrap(getIntent().getParcelableExtra(Post.class.getSimpleName()));
        tvUsername = (TextView) findViewById(R.id.tvDetailsUsername);
        ivImage = (ImageView) findViewById(R.id.ivDetailsImage);
        tvDescription = (TextView) findViewById(R.id.tvDetailsDescription);
        tvRelativeTime = (TextView) findViewById(R.id.tvRelativeTime);

        tvDescription.setText(description);
        tvUsername.setText(username);
        Glide.with(this)
                .load(imageURL)
                .into(ivImage);

        tvRelativeTime.setText(timeAgo);
    }


}