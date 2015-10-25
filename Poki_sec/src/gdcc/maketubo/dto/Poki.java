package gdcc.maketubo.dto;

import android.util.Log;

public class Poki {
    public static final int NOTHING = 0;
	
	public static final int UP_ONE = 1;
	
	public static final int DOWN_HIT = -1;
	
	public int currentType = NOTHING;
	
	public void toNext(){
	
		if(currentType > 0)
			currentType --;
		else if(currentType == NOTHING){	
				Log.i("next", "123456");
				currentType=UP_ONE;
		}		
		else if(currentType < 0){
			currentType ++;
//			String temp=((String) PokiView.rv.getText()).trim();
//			PokiView.rv.setText(Integer.parseInt(temp)+100);
		}
	}

	public void toShow() {
		currentType = UP_ONE;
	}
	
	public void click(){
		if(currentType > NOTHING){
			currentType = DOWN_HIT;
		}
	}
}
