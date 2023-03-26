package com.example.dice;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtone, txttwo, txtsum, txtsub, txtwin;
    ImageView imgone, imgtwo;

    int imgs[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtone = findViewById(R.id.txtone);
        txttwo = findViewById(R.id.txttwo);
        txtsum = findViewById(R.id.txtsum);
        txtsub = findViewById(R.id.txtsub);
        txtwin = findViewById(R.id.txtwin);
        imgone = findViewById(R.id.imgone);
        imgtwo = findViewById(R.id.imgtwo);


        txtsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                int num = random.nextInt(6);
                int num2 = random.nextInt(6);
                setDice(num, num2);


                if (num < num2) {
                    txtwin.setText("B is win");
                } else if (num2 < num) {
                    txtwin.setText("A is win");
                } else {
                    txtwin.setText("Equal");
                }


            }
        });
        imgone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(6);
                int num2 = random.nextInt(6);
                setDice(num,num2);


                if (num < num2) {
                    txtwin.setText("B is win");
                } else if (num2 < num) {
                    txtwin.setText("A is win");
                } else {
                    txtwin.setText("Equal");
                }
            }
        });
        imgtwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int num = random.nextInt(6);
                int num2 = random.nextInt(6);
                setDice(num,num2);


                if (num < num2) {
                    txtwin.setText("B is win");
                } else if (num2 < num) {
                    txtwin.setText("A is win");
                } else {
                    txtwin.setText("Equal");
                }
            }
        });


    }

    private void setDice(int num, int num2) {
        imgone.setImageResource(imgs[num]);
        imgtwo.setImageResource(imgs[num2]);
        int N = num + 1;
        int N2 = num2 + 1;
        txtone.setText("" + N);
        txttwo.setText("" + N2);
        txtsum.setText("sum= " + (N + N2));

    }


}