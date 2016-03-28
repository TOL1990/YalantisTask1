package task1.yalantis.com.task1;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadImages();

    }

    private void loadImages() {

        ImageView img1 = (ImageView) findViewById(R.id.image1);
        ImageView img2 = (ImageView) findViewById(R.id.image2);
        Picasso.with(this).load("http://savepic.ru/9117399.png").into(img1);
        Picasso.with(this).load("http://savepic.ru/9172695.png").into(img2);

    }


    @Override
    public void onBackPressed() {

        Toast.makeText(this, "Any control", Toast.LENGTH_SHORT).show();

//       System.exit(0);
    }


}
