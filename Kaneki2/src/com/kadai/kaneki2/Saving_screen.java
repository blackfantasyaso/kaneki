package com.kadai.kaneki2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Saving_screen extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saving_screen);
		
		Button btn = (Button)findViewById(R.id.btn_seni); //ボタンを探してくる
        btn.setOnClickListener(this); //ボタンにリスナーを登録する
		
		
	}//onCreate

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		
		switch(v.getId()){ //どのボタンが押されたか判定
		case R.id.btn_seni: //btn_seniが押された
			// 新画面を起動
			Intent intent = new Intent(Saving_screen.this, Saving_frame_input.class);
			startActivity(intent);
			break;
		}//switch
	}//onClick

}//class
