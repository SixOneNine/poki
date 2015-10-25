package gdcc.maketubo.activity;

import java.util.Timer;
import java.util.TimerTask;



import com.example.poki.R;
import com.example.poki.R.layout;
import com.example.poki.R.menu;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class WelcomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		 new Handler().postDelayed(run, 2000);
//		final Intent intent = new Intent(this, MenuActivity.class);
//		
//		Timer time = new Timer();
//		TimerTask task = new TimerTask(){
//			public void run(){
//				startActivity(intent);
//			}
//		};
//		
//		time.schedule(task, 1000*2);
			
	}
	
	Runnable run = new Runnable(){
		public void run(){
		Intent intent = new Intent();
		intent.setClass(WelcomeActivity.this, MenuActivity.class);
		startActivity(intent);
		finish();
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.welcome, menu);
		return true;
	}

}
