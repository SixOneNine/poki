package gdcc.maketubo.service;

import java.util.HashMap;
import java.util.Map;
import com.example.poki.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class ImageManager {
	
	private static Map<Integer,Integer> values = new HashMap<Integer, Integer>();
	public void actionByViewID(){}

	public static int getResource(int index){
		return values.get(index);
	}
	public static void init(Context context) {
	   values.put(new Integer(1), R.drawable.yellow);
	   values.put(new Integer(0), R.drawable.hole);
	   values.put(new Integer(-1), R.drawable.bule);
	}
}
