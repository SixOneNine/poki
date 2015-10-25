package gdcc.maketubo.extra;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import gdcc.maketubo.activity.GameActivity;

public class MyCount extends AdvancedCountdownTimer{
	private TextView tv;
	private Context context;
	public MyCount(long millisInFuture, long countDownInterval,TextView tv,Context context) {
		super(millisInFuture, countDownInterval);
		this.tv=tv;
		this.context=context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onFinish() {
		// TODO Auto-generated method stub
		tv.setText("0");
		AlertDialog.Builder builder = new AlertDialog.Builder(context);
		builder.setTitle("你输了");
		builder.setMessage("请重来");
		builder.setCancelable(false);
		builder.setNeutralButton("重来", new android.content.DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				return;
				
			}
		}).show();
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
