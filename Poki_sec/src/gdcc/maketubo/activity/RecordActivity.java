package gdcc.maketubo.activity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.poki.R;
import com.example.poki.R.layout;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SimpleAdapter;

public class RecordActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        SimpleAdapter adapter = new SimpleAdapter(this,getData(),R.layout.activity_record,

                new String[]{"name","cord","level"},

                new int[]{R.id.name,R.id.cord,R.id.level});

        setListAdapter(adapter);
	}
	
	 private List<Map<String, Object>> getData() {

	        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
	        Map<String, Object> map = new HashMap<String, Object>();
	        
	        map.put("name", "G1");
	        map.put("cord", "google 1");
	        map.put("level", "1");
	        list.add(map);
	        
	        return list;

	    }
	
}
