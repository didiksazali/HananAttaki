package com.cloudcode.didik.audioplayer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView audio1, audio2, audio3, audio4, audio5, audio6, audio7, audio8, audio9, audio10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audio1 = (CardView)findViewById(R.id.audio1);
        audio2 = (CardView)findViewById(R.id.audio2);
        audio3 = (CardView)findViewById(R.id.audio3);
        audio4 = (CardView)findViewById(R.id.audio4);
        audio5 = (CardView)findViewById(R.id.audio5);
        audio6 = (CardView)findViewById(R.id.audio6);
        audio7 = (CardView)findViewById(R.id.audio7);
        audio8 = (CardView)findViewById(R.id.audio8);
        audio9 = (CardView)findViewById(R.id.audio9);
        audio10 = (CardView)findViewById(R.id.audio10);

        audio1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio1 = new Intent(MainActivity.this, Audio1Activity.class);
                startActivity(intAudio1);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio2 = new Intent(MainActivity.this, Audio2Activity.class);
                startActivity(intAudio2);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio3 = new Intent(MainActivity.this, Audio3Activity.class);
                startActivity(intAudio3);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio4 = new Intent(MainActivity.this, Audio4Activity.class);
                startActivity(intAudio4);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio5 = new Intent(MainActivity.this, Audio5Activity.class);
                startActivity(intAudio5);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio6 = new Intent(MainActivity.this, Audio6Activity.class);
                startActivity(intAudio6);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio7 = new Intent(MainActivity.this, Audio7Activity.class);
                startActivity(intAudio7);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio8 = new Intent(MainActivity.this, Audio8Activity.class);
                startActivity(intAudio8);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio9 = new Intent(MainActivity.this, Audio9Activity.class);
                startActivity(intAudio9);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        audio10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getApplicationContext(), "Selamat", Toast.LENGTH_LONG).show();
                Intent intAudio10 = new Intent(MainActivity.this, Audio10Activity.class);
                startActivity(intAudio10);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(false);
        builder.setMessage("Yakin ingin keluar?");
        builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user pressed "yes", then he is allowed to exit from application
                finish();
            }
        });
        builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //if user select "No", just cancel this dialog and continue with app
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }


}
