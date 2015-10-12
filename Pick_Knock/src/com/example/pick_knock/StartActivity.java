package com.example.pick_knock;

import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;

public class StartActivity extends Activity {

	ImageView img;
	int count = 0;
	int[] a = { R.id.imageView1, R.id.imageView2, R.id.imageView3,
			R.id.imageView4, R.id.imageView5, R.id.imageView6, };

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_main);
		start();
	}

	public void start() {

		new CountDownTimer(2000, 1000) {
			@Override
			public void onTick(long millisUntilFinished) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onFinish() {

				img = (ImageView) findViewById(a[count]);
				img.setImageResource(R.drawable.k);
				count = new Random().nextInt(5);
				img = (ImageView) findViewById(a[count]);
				img.setImageResource(R.drawable.pet);
				start();
			}
		}.start();
	}

}
