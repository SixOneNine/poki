package gdcc.maketubo.activity;

import com.example.poki.R;
import com.example.poki.R.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}
	
	
	public void gameStart(View v) {
	Intent intent = new Intent();
	intent.setClass(MenuActivity.this, GameActivity.class);
	startActivity(intent);
    }


}
