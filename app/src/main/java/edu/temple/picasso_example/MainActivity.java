package edu.temple.picasso_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private static final String IMAGE_URL =
            "https:\\/\\/images-na.ssl-images-amazon.com\\/images\\/I\\/51eKYoHi9jL.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        Picasso.get().load(IMAGE_URL).into(imageView);
    }

}