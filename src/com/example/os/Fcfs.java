package com.example.os;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Fcfs extends Activity {

	private EditText p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	private TextView s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
	private Button button1,button2;
	
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fifo);
		
		p1 = (EditText)findViewById(R.id.p1);
		p2 = (EditText)findViewById(R.id.p2);
		p3 = (EditText)findViewById(R.id.p3);
		p4 = (EditText)findViewById(R.id.p4);
		p5 = (EditText)findViewById(R.id.p5);
		p6 = (EditText)findViewById(R.id.p6);
		p7 = (EditText)findViewById(R.id.p7);
		p8 = (EditText)findViewById(R.id.p8);
		p9 = (EditText)findViewById(R.id.p9);
		p10 = (EditText)findViewById(R.id.p10);
		s1 = (TextView)findViewById(R.id.s1);
		s2 = (TextView)findViewById(R.id.s2);
		s3 = (TextView)findViewById(R.id.s3);
		s4 = (TextView)findViewById(R.id.s4);
		s5 = (TextView)findViewById(R.id.s5);
		s6 = (TextView)findViewById(R.id.s6);
		s7 = (TextView)findViewById(R.id.s7);
		s8 = (TextView)findViewById(R.id.s8);
		s9 = (TextView)findViewById(R.id.s9);
		s10 = (TextView)findViewById(R.id.s10);
		
		button1 = (Button)findViewById(R.id.btnend);
		button2 = (Button)findViewById(R.id.button2);	
		button1.setOnClickListener(l);
		button2.setOnClickListener(l);
		
	}

	private Button.OnClickListener l = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
				case R.id.btnend:{
					int oper1 = Integer.parseInt(p1.getText().toString());
					if(p1.getText().toString()=="" || p2.getText().toString()=="" || p3.getText().toString()=="" || p4.getText().toString()=="" || p5.getText().toString()=="" || p6.getText().toString()=="" || p7.getText().toString()=="" || p8.getText().toString()=="" || p9.getText().toString()=="" || p10.getText().toString()=="")
						Toast.makeText(getApplicationContext(), "請完整輸入", Toast.LENGTH_SHORT) .show();
					s1.setText(p1.getText().toString());
					s2.setText(p2.getText().toString());
					s3.setText(p3.getText().toString());
					s4.setText(p4.getText().toString());
					s5.setText(p5.getText().toString());
					s6.setText(p6.getText().toString());
					s7.setText(p7.getText().toString());
					s8.setText(p8.getText().toString());
					s9.setText(p9.getText().toString());
					s10.setText(p10.getText().toString());
					
					
					break;
				}
				case R.id.button2:{
					finish();
					break;
				}

			
			}
		}
		
	};
	
}
