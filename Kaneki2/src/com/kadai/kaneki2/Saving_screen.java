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
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saving_screen);
		
		Button btn = (Button)findViewById(R.id.btn_seni); //�{�^����T���Ă���
        btn.setOnClickListener(this); //�{�^���Ƀ��X�i�[��o�^����
		
		
	}//onCreate

	@Override
	public void onClick(View v) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		switch(v.getId()){ //�ǂ̃{�^���������ꂽ������
		case R.id.btn_seni: //btn_seni�������ꂽ
			// �V��ʂ��N��
			Intent intent = new Intent(Saving_screen.this, Saving_frame_input.class);
			startActivity(intent);
			break;
		}//switch
	}//onClick

}//class
