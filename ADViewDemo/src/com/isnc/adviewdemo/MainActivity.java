package com.isnc.adviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		RelativeLayout rlLayout = (RelativeLayout) findViewById(R.id.contain);
		View_Active view_Active = new View_Active(this);
		//人脸data数据可以在刷脸登录后获得：String data = Cache.getCached(context, SDKConfig.KEY_APPINFO);
		String data = "{\"gender\":\"male\",\"persona\":{\"tags\":[\"goodLooking\",\"eyeglasses\",\"mustache\"],\"gender\":\"male\",\"generation\":\"90s\",\"character\":\"reserved\"}}";
		view_Active.setTitle(data);
		rlLayout.addView(view_Active);
	}



}
