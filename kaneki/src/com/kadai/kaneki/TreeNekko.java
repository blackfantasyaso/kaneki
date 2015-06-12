package com.kadai.kaneki;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.graphics.*;

public class TreeNekko extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.treenekko);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	public class Screen extends View {
		
		public Screen(Context context) {
			super(context);
		}
		
		@Override
		protected void onDraw(Canvas c) {
			super.onDraw(c);
			Paint p = new Paint();
			Bitmap img0, img1;
			
			Resources res = this.getContext().getResources();
		}

	}
}
