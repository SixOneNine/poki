package gdcc.maketubo.activity;

import java.util.ArrayList;

import com.example.poki.R;
import com.example.poki.R.layout;
import com.example.poki.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class PagerActivity extends Activity {

	private ViewPager mViewPager;
	private PagerTitleStrip mPagerTitleStrip;
	private Button startBtn;
	private AlphaAnimation myAnimation_Alpha;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.viewpager_activity);

		mViewPager = (ViewPager)findViewById(R.id.viewpager);
		mPagerTitleStrip = (PagerTitleStrip)findViewById(R.id.pagertitle);
		//��Ҫ��ҳ��ʾ��Viewװ��������
		LayoutInflater mLi = LayoutInflater.from(this);
		View view1 = mLi.inflate(R.layout.viewpager_activity_item1, null);
		View view2 = mLi.inflate(R.layout.viewpager_activity_item2, null);
		View view3 = mLi.inflate(R.layout.viewpager_activity_item3, null);

		//ÿ��ҳ���Title����
		final ArrayList<View> views = new ArrayList<View>();
		views.add(view1);
		views.add(view2);
		views.add(view3);



		//���ViewPager������������
		PagerAdapter mPagerAdapter = new PagerAdapter() {

			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}

			@Override
			public int getCount() {
				return views.size();
			}

			@Override
			public void destroyItem(View container, int position, Object object) {
				((ViewPager)container).removeView(views.get(position));
			}

			@Override
			public CharSequence getPageTitle(int position) {
				return null;
			}

			@Override
			public Object instantiateItem(View container, int position) {
				((ViewPager)container).addView(views.get(position));
				return views.get(position);
			}
		};

		mViewPager.setAdapter(mPagerAdapter);



	}
	public void startbutton(View v) {  
		Intent intent = new Intent();
		intent.setClass(PagerActivity.this,WelcomeActivity.class);
		startActivity(intent);
		this.finish();
		
//	myAnimation_Alpha=new AlphaAnimation(0.1f, 1.0f);	
//	myAnimation_Alpha.setDuration(5000);	
//	
//	myAnimation_Alpha.start();
	
	}  

	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pager, menu);
		return true;
	}
	



}
