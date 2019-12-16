package io.github.lizhangqu.sample;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class Main3Activity extends AppCompatActivity {

    AssetFileDescriptor assetFileDescriptor;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ImageView imageView = findViewById(R.id.imageView);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        switch (getIntent().getBundleExtra("tu").getString("tu")) {
            case "a":
                imageView.setImageResource(R.drawable.one);
                player = MediaPlayer.create(this, R.raw.gan);
                player.start();
                break;
            case "b":
                imageView.setImageResource(R.drawable.two);
                player = MediaPlayer.create(this, R.raw.shi);
                player.start();
                break;
            case "c":
                imageView.setImageResource(R.drawable.f);
                player = MediaPlayer.create(this, R.raw.kehuishou);
                player.start();
                break;
            case "d":
                imageView.setImageResource(R.drawable.three);
                player = MediaPlayer.create(this, R.raw.yuhai);
                player.start();
                break;
        }
    }
}
