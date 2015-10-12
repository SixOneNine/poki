package com.example.pick_knock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;

public class MainActivity extends Activity {

	private View popuView = null;
	private PopupWindow popuWin = null;
	private Button button = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	public void start(View v) {
		Intent intent = new Intent();
		intent.setClass(MainActivity.this, StartActivity.class);
		startActivity(intent);

	}

	// public void popuWindow(View v) {
	//
	// LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
	// popuView = inflater.inflate(R.layout.set_popu, null); // 找到布局文件中的View
	// popuWin = new PopupWindow(popuView, 300, 200, true);
	// // 取得弹出界面中的组件
	// Switch music = (Switch) findViewById(R.id.music);
	// Button cancel = (Button) findViewById(R.id.cancel);
	// cancel.setOnClickListener(new OnClickListener() {
	//
	// @Override
	// public void onClick(View v) {
	// // TODO Auto-generated method stub
	// popuWin.dismiss();
	// }
	// });
	// popuWin.showAtLocation(button, Gravity.CENTER, 0, 0);
	// }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
