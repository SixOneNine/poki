package gdcc.maketubo.activity;

import com.example.poki.R;
import com.example.poki.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends Activity {
	

	
	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		 final Button btnstr
		 = (Button)findViewById(R.id.btnstr);
		 
		 final Button btnrec
		 = (Button)findViewById(R.id.btnrec);
		 
		 final Button btnset
		 = (Button)findViewById(R.id.btnset);
		 
		 final Button btnesc
		 = (Button)findViewById(R.id.btnesc);
		
//		btnstr.setOnTouchListener(new View.OnTouchListener() {
//			public boolean onTouch(View view, MotionEvent motionEvent) {
//
//				if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {					
//					btnstr.setBackgroundResource(R.drawable.buttonsmall);
//				}
//				if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
//					btnstr.setBackgroundResource(R.drawable.button);
//				}
//				
//
//			    
//				return false;
//			}
//		});
		
		btnrec.setOnTouchListener(new View.OnTouchListener() {
			public boolean onTouch(View view, MotionEvent motionEvent) {

				if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {					
					btnrec.setBackgroundResource(R.drawable.buttonsmall);
				}
				if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
					btnrec.setBackgroundResource(R.drawable.button);
				}
				
				
				return false;
			}
		});
		
		btnstr.setOnTouchListener(new View.OnTouchListener() {
			public boolean onTouch(View view, MotionEvent motionEvent) {

				if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {					
					btnstr.setBackgroundResource(R.drawable.buttonsmall);
				}
				if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
					btnstr.setBackgroundResource(R.drawable.button);
				}
				return false;
			}
		});
		
		btnesc.setOnTouchListener(new View.OnTouchListener() {
			public boolean onTouch(View view, MotionEvent motionEvent) {

				if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {					
					btnesc.setBackgroundResource(R.drawable.buttonsmall);
				}
				if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
					btnesc.setBackgroundResource(R.drawable.button);
				}
				
				return false;
			}
		});
		

	}
	
	
	public void gameStart(View v) {
		
	    Intent intent = new Intent();
	    intent.setClass(MenuActivity.this, GameActivity.class);
	    startActivity(intent);
    }
	
	public void recordStart(View v) {
		Intent intent = new Intent();
		intent.setClass(MenuActivity.this, RecordActivity.class);
		startActivity(intent);
	    }
	
	public void gameEsc(View v) {
		finish();
	    }
	
	public void helpStart(View v){
		Intent intent = new Intent();
		intent.setClass(MenuActivity.this, HelpActivity.class);
		startActivity(intent);
		finish();
	}

}
