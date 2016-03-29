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

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadImages();
        controlsToOnClick();

    }

    private void loadImages() {
        ImageView img1 = (ImageView) findViewById(R.id.image1);
        ImageView img2 = (ImageView) findViewById(R.id.image2);
        Picasso.with(this).load("http://savepic.ru/9117399.png").into(img1);
        Picasso.with(this).load("http://savepic.ru/9172695.png").into(img2);
  }


    @Override
    public void onBackPressed() {

//        Toast.makeText(this, "Any control", Toast.LENGTH_SHORT).show();

//       System.exit(0);
    }
    public void onClick(View v) {
        String toastText ;
        toastText = v.getClass().getSimpleName();
        Toast.makeText(this, toastText, Toast.LENGTH_SHORT).show();
    }
    private void controlsToOnClick() {
        ImageView img1 = (ImageView) findViewById(R.id.image1);
        ImageView img2 = (ImageView) findViewById(R.id.image2);
        TextView creationText = (TextView) findViewById(R.id.creationText);
        TextView dateOfCreation = (TextView) findViewById(R.id.dateOfCreation);
        TextView describe = (TextView) findViewById(R.id.describe);
        TextView executeBeforeDate = (TextView) findViewById(R.id.executeBeforeDate);
        TextView executeBeforeText = (TextView) findViewById(R.id.executeBeforeText);
        TextView organizationType = (TextView) findViewById(R.id.organizationType);
        TextView registrationDate = (TextView) findViewById(R.id.registrationDate);
        TextView registrationText = (TextView) findViewById(R.id.registrationText);
        TextView responsible = (TextView) findViewById(R.id.responsible);
        TextView responsibleText = (TextView) findViewById(R.id.responsibleText);
        TextView workStatus = (TextView) findViewById(R.id.workStatus);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        creationText.setOnClickListener(this);
        dateOfCreation.setOnClickListener(this);
        describe.setOnClickListener(this);
        executeBeforeDate.setOnClickListener(this);
        executeBeforeText.setOnClickListener(this);
        organizationType.setOnClickListener(this);
        registrationDate.setOnClickListener(this);
        registrationText.setOnClickListener(this);
        responsible.setOnClickListener(this);
        responsibleText.setOnClickListener(this);
        workStatus.setOnClickListener(this);

    }

}
