package gdcc.maketubo.activity;

import gdcc.maketubo.extra.AdvancedCountdownTimer;
import gdcc.maketubo.extra.MyDialog;

import com.example.poki.R;
import com.example.poki.R.layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends Activity {
	
	TextView tv;
	MyCount mc;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		tv = (TextView)findViewById(R.id.time);
		mc = new MyCount(30000,1000);
		mc.start();
	}
	
	class MyCount extends AdvancedCountdownTimer{

		public MyCount(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onFinish() {
			// TODO Auto-generated method stub
			tv.setText("0");
		}

	//	public void onTick(long millisUntilFinished) {
			// TODO Auto-generated method stub
	//		tv.setText(""+ millisUntilFinished / 1000 +"");
			
	//	}

		@Override
		public void onTick(long millisUntilFinished, int percent) {
			// TODO Auto-generated method stub
			tv.setText(""+ millisUntilFinished / 1000 +"");
		}

		
	}
	
	public void gamePause(View v) throws InterruptedException{  
		 mc.pause();
		 MyDialog.Builder builder = new MyDialog.Builder(this);
		 builder.setContinueButton("¼ÌÐø", new DialogInterface.OnClickListener(){
			 public void onClick(DialogInterface dialog, int which){
				   
			 }
		 });
		 builder.setEscButton("ÍË³ö", new DialogInterface.OnClickListener(){
			 public void onClick(DialogInterface dialog, int which){
				 dialog.dismiss();  
			 }
		 });
		 builder.create().show(); 		 

	}
		 

}
