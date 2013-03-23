package org.sam.applications.customtitlebar;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class CustomActionBar extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_custom_action_bar);
//		if (android.os.Build.VERSION.SDK_INT >= 11) {
//			ActionBar actionBar = getActionBar();
//			actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_background_normal));
//		} else {
//			getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.drawable.button_background_normal);
//		}
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_custom_action_bar, menu);
		return true;
	}

}
