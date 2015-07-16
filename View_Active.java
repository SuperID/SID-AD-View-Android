package com.isnc.adviewdemo;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class View_Active extends RelativeLayout {

	private RelativeLayout mViewrool;
	private TextView mTvfirst;
	private Button mBtnClose;

	public View_Active(Context context) {
		super(context);
		LayoutInflater.from(context).inflate(R.layout.view_active, this, true);
		mViewrool = (RelativeLayout) findViewById(R.id.viewrool);
		mTvfirst = (TextView) findViewById(R.id.tv_first);
		mBtnClose = (Button) findViewById(R.id.btn_close);
		mBtnClose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewrool.setVisibility(View.GONE);
			}
		});
	}

	public void setTitle(String data) {
		String firstWord = "", secondWord = "", thirdWord = "";
		try {
			JSONObject obj = new JSONObject(data);
			String character = obj.optJSONObject("persona").optString("character");
			if (character.equals("reserved")) {
				firstWord = "含蓄";
			} else if (character.equals("lively")) {
				firstWord = "活泼";
			} else if (character.equals("mature")) {
				firstWord = "成熟";
			} else if (character.equals("humorous")) {
				firstWord = "风趣";
			} else if (character.equals("serious")) {
				firstWord = "严肃";
			} else if (character.equals("kindly")) {
				firstWord = "和蔼";
			} else {
				firstWord = "幸运";
			}
			String tags = obj.optJSONObject("persona").optJSONArray("tags").toString();
			if (tags.indexOf("goodLooking") != -1) {
				if (obj.optJSONObject("persona").optString("gender").equals("male")) {
					secondWord = "帅气";
				} else {
					secondWord = "漂亮";
				}
			}else {
				secondWord = "";
			}
			String generation = obj.optJSONObject("persona").optString("generation");
			if (generation.equals("")) {
				thirdWord = "人";
			}else {
				thirdWord = generation.substring(0, 2)+"后";
			}
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		mTvfirst.setText("我是一个"+firstWord+secondWord+"的"+thirdWord);
	}
}


import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.isnc.superiddemo.R;

public class View_Active extends RelativeLayout {

	private RelativeLayout mViewrool;
	private TextView mTvfirst;
	private Button mBtnClose;

	public View_Active(Context context) {
		super(context);
		LayoutInflater.from(context).inflate(R.layout.view_active, this, true);
		mViewrool = (RelativeLayout) findViewById(R.id.viewrool);
		mTvfirst = (TextView) findViewById(R.id.tv_first);
		mBtnClose = (Button) findViewById(R.id.btn_close);
		mBtnClose.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				mViewrool.setVisibility(View.GONE);
			}
		});
	}

	public void setTitle(String data) {
		String firstWord = "", secondWord = "", thirdWord = "";
		try {
			JSONObject obj = new JSONObject(data);
			String character = obj.optJSONObject("persona").optString("character");
			if (character.equals("reserved")) {
				firstWord = "含蓄";
			} else if (character.equals("lively")) {
				firstWord = "活泼";
			} else if (character.equals("mature")) {
				firstWord = "成熟";
			} else if (character.equals("humorous")) {
				firstWord = "风趣";
			} else if (character.equals("serious")) {
				firstWord = "严肃";
			} else if (character.equals("kindly")) {
				firstWord = "和蔼";
			} else {
				firstWord = "幸运";
			}
			String tags = obj.optJSONObject("persona").optJSONArray("tags").toString();
			if (tags.indexOf("goodLooking") != -1) {
				if (obj.optJSONObject("persona").optString("gender").equals("male")) {
					secondWord = "帅气";
				} else {
					secondWord = "漂亮";
				}
			}else {
				secondWord = "";
			}
			String generation = obj.optJSONObject("persona").optString("generation");
			if (generation.equals("")) {
				thirdWord = "人";
			}else {
				thirdWord = generation.substring(0, 2)+"后";
			}
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		mTvfirst.setText("我是一个"+firstWord+secondWord+"的"+thirdWord);
	}
}
