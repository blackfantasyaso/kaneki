package com.kadai.kaneki;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Saving_frame_input extends Activity implements OnClickListener {

	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.saving_frame_input);
	        
	        Button btn1 = (Button)findViewById(R.id.btn_touroku); //�{�^����T���Ă���
	        btn1.setOnClickListener(this); //�{�^���Ƀ��X�i�[��o�^����
	        
	    }

	@Override
	public void onClick(View v) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
		switch(v.getId()){ //�ǂ̃{�^���������ꂽ������
		case R.id.btn_touroku: //btn_tyokin�������ꂽ
			
			//�G�f�B�b�g�e�L�X�g��T���Ă���
			EditText edit = (EditText)findViewById(R.id.Etext_tyokin);
			//���͂��ꂽ���l���擾
	        String str = edit.getText().toString();
	        //�擾�������l(String)��int�^�ɕϊ�
	        int i = Integer.parseInt(str);
	        
	        //�e�L�X�g�r���[��T���Ă���
	        TextView test = (TextView) findViewById(R.id.test);
	        test.setText(i);
		}
	}
}
