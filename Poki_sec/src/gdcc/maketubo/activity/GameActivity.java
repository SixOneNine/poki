package gdcc.maketubo.activity;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import gdcc.maketubo.dto.GameDto;
import gdcc.maketubo.dto.Poki;
import gdcc.maketubo.extra.MyCount;
import gdcc.maketubo.extra.MyDialog;

import gdcc.maketubo.service.ImageManager;


import com.example.poki.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;
public class GameActivity extends Activity implements OnTouchListener{
	private static Random random = new Random();
	List<ImageView> viewQuite;
	TextView tv,rv;
	MyCount mc;
	ImageView imageView;
	Poki poki;
	private Context context;

	private List<Poki> holeQuite = new ArrayList<Poki>(GameDto.HOLE_COUNT);
	{
		for(int i=0; i<GameDto.HOLE_COUNT; i++){
			holeQuite.add(new Poki());
		}
	}
	private int []imageViews={R.id.hole11,R.id.hole12,R.id.hole13,
			R.id.hole21,R.id.hole22,R.id.hole23,
			R.id.hole31,R.id.hole32,R.id.hole33,
		};
	private MainThread gameThread;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		tv = (TextView)findViewById(R.id.time);
		rv=  (TextView)findViewById(R.id.grade);
	//	mc = (MyCount) new MyCount(30000,1000,tv,this).start();
		ImageManager.init(this);		
		resetGame();
	}
	
    public void gamePause(View v) throws InterruptedException{  
    	mc.pause();
    	
		// gameThread.interrupt();
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("暂停中...");
		builder.setMessage("请选择：");
		builder.setCancelable(false);
		builder.setPositiveButton("继续", new android.content.DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				mc.resume();
				
			}
		});
		
        builder.setNegativeButton("重来", new android.content.DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				return;
				
			}
		});
        
        builder.create().show();
		
   }
	
	public void resetGame() {
//		LayoutInflater inflator = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        view=inflator.inflate(R.layout.activity_game, null);
		viewQuite = new ArrayList<ImageView>(GameDto.HOLE_COUNT);
		{
			for(int i=0; i<GameDto.HOLE_COUNT; i++){
				ImageView temp=(ImageView)findViewById(imageViews[i]);
				temp.setOnTouchListener(this);	
				viewQuite.add(temp);
			}
		}	
		//创建线程
		this.gameThread=new MainThread();
		//启动线程
		this.gameThread.start();
		this.mc = (MyCount) new MyCount(30000,1000,tv,this).start();
	}
	@Override
	public boolean onTouch(View v, MotionEvent event) {
		int buttonId=v.getId();
		 switch (buttonId) {
		   case R.id.hole11:
		     holeQuite.get(0).click();break;
		   case R.id.hole12:
		     holeQuite.get(1).click();break;
		   case R.id.hole13:
			 holeQuite.get(2).click();break;
		   case R.id.hole21:
			 holeQuite.get(3).click();break;
		   case R.id.hole22:
			 holeQuite.get(4).click();break;
		   case R.id.hole23:
			 holeQuite.get(5).click();break;
		   case R.id.hole31:
			 holeQuite.get(6).click();break;
		   case R.id.hole32:
			 holeQuite.get(7).click();break;
		   case R.id.hole33:
			 holeQuite.get(8).click();break;			 
		   }
		   //实现读取图片ID
//		   assert(R.id.someImage == imageView.getId());
//		   Integer integer = (Integer) imageView.getTag();
//		   integer = integer == null ? 0 : integer;
//		   switch(integer) {
//		    case R.drawable.foo:
//		     imageView.setDrawableResource(R.drawable.bar);
//		     imageView.setTag(R.drawable.bar);
//		     break;
//		    case R.drawable.bar:
//		    default:
//		     imageView.setDrawableResource(R.drawable.bule);
//		     imageView.setTag(R.drawable.foo);
		return false;		     		
	}	  			
	
    protected void UpdateUI(){	
		if(((String) tv.getText()).trim()=="0"){
			Log.i("make2", "js");			
			this.gameThread.interrupt();			
			return ;
		}
		
		for(int i=0; i<holeQuite.size(); i++){
			poki = holeQuite.get(i);
			imageView=viewQuite.get(i);
			Log.i("make3", String.valueOf(i));
			Log.i("currentType", String.valueOf(poki.currentType));
			imageView.setImageResource(ImageManager.getResource(poki.currentType));
			poki.toNext();
		}
		
	}	
		
	private class MainThread extends Thread{

		@Override
		public void run(){
			//刷新画面
			UpdateUI();
			while(true){
			try {				
				//TODO 时间随等级增快
				Thread.sleep(500);
//				LinkedList<Poki> temp = new LinkedList<Poki>();
//				for(Poki each : holeQuite){
//					if(each.currentType == Poki.NOTHING){
//						temp.add(each);
//					}
//				}
//				int size = temp.size();
//				Log.i("make", String.valueOf(size));
//				if(size == 1){
//					temp.poll().toShow();
//					UpdateUI();
//				}else if(size > 1){
//					for(int i=0; i<random.nextInt(2) + 1; i++){
//						temp.remove(random.nextInt(temp.size())).toShow();
//				}
				//刷新画面
				UpdateUI();	
//				}
				} catch (Exception e) {
				e.printStackTrace();
				}
			}
	       }
		}
}
