package com.kadai.kaneki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class TitleAct extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onCreate(savedInstanceState);
		setContentView(R.layout.title);
		
		 // �X�v���b�V����ʂ���A2�b�i2000�~���b)��ɑJ�ڂ���B
        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(TitleAct.this, MainActivity.class);
                startActivity(intent);
  
                // �A�N�e�B�r�e�B���I�������邱�ƂŁA�X�v���b�V����ʂɖ߂邱�Ƃ�h���B
                TitleAct.this.finish();
            }
        }, 2000);
		
		
	}

}
