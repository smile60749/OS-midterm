package com.example.os;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class OsMainActivity extends Activity {
	
	private Button bt1,bt2,bt3,bt4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_os_main);
		
		bt1=(Button)findViewById(R.id.btnfcfs);
		bt2=(Button)findViewById(R.id.btnshort);
		bt3=(Button)findViewById(R.id.btnpri);
		bt4=(Button)findViewById(R.id.btnend);
		
		bt1.setOnClickListener(l);
		bt2.setOnClickListener(l);
		bt3.setOnClickListener(l);
		bt4.setOnClickListener(l);
	}
	private Button.OnClickListener l= new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			if(v.getId()==R.id.btnfcfs)
			{
				Intent intent=new Intent();
				intent.setClass(OsMainActivity.this, Fcfs.class);
				startActivity(intent);
			}
			else if(v.getId()==R.id.btnpri)
			{
				Intent intent=new Intent();
				intent.setClass(OsMainActivity.this, SOSActivity.class);
				startActivity(intent);
			}
			else if(v.getId()==R.id.btnshort)
			{
				Intent intent=new Intent();
				intent.setClass(OsMainActivity.this, SOActivity.class);
				startActivity(intent);
			}
			else if(v.getId()==R.id.btnend)
			{
				finish();
			}
		}
		
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.os_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
