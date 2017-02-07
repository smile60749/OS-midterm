package com.example.os;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SOActivity extends Activity {
	private TextView textShow,textGrantt1,textGrantt2,textGrantt3,textGrantt4,textProcess,textTime;
	private EditText editTime;
	private  Button btnTime,btnBack;
	int n=1,m;
	int t[]=new int[10];
	int t2[]=new int[11];
	String p[]=new String[10];
	String s,s1,s2,s3,s4,s5="",s6="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sos);
		
		textShow=(TextView)findViewById(R.id.textShow);
		textGrantt1=(TextView)findViewById(R.id.textGrantt1);
		textGrantt2=(TextView)findViewById(R.id.textGrantt2);
		textGrantt3=(TextView)findViewById(R.id.textGrantt3);
		textGrantt4=(TextView)findViewById(R.id.textGrantt4);
		textProcess=(TextView)findViewById(R.id.textProcess);
		textTime=(TextView)findViewById(R.id.textTime);
		btnTime=(Button)findViewById(R.id.btnTime);
		btnBack=(Button)findViewById(R.id.btnBack);
		editTime=(EditText)findViewById(R.id.editTime);
		
		btnTime.setOnClickListener(l);
		btnBack.setOnClickListener(l);
	}

	private Button.OnClickListener l = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
			
				case R.id.btnTime:
				{
					try{
					
						s1="┌──";s2="│";s3="└──";s4="0";
		    	    	t[n-1] = Integer.parseInt(editTime.getText().toString());
		    	    	p[n-1]="P"+n;
		    	    	for(int k=0;k<n-1;k++){
			    	        for(int i=k;i<n-1;i++)
			        	    	for(int j=i+1;j<n;j++)
			    	    	    	if(t[i]>t[j])
			    	    	    	{
			    	    	    		m=t[i];
			    	    	    		t[i]=t[j];
			    	    	    		t[j]=m;
			    	    	    		s=p[i];
			    	    	    		p[i]=p[j];
			    	    	    		p[j]=s;
			    	    	    		i=j;
			    	    	    	}
		    	    	}
		    	    	for(int i=0;i<n;i++)
		    	    	{
		    	    		t2[i+1]=t2[i]+t[i];
		    	    	}
		    	    	if(n>=2)
		    	    	{
		    	    		for(int i=0;i<n-1;i++)
			    	    	{
		    	    			s1=s1+"┬──";
		    	    			s3=s3+"┴──";
			    	    	}
			    	    	for(int i=0;i<n;i++)
			    	    	{
			    	    		s2=s2+p[i]+"│";
			    	    		if(t[i]<10)
			    	    			s4=s4+"     "+t2[i+1];
			    	    		else
			    	    			s4=s4+"    "+t2[i+1];
			    	    	}
		    	    	}
		    	    	else
		    	    	{
		    	    		for(int i=0;i<n;i++)
			    	    	{
			    	    		s2=s2+p[i]+"│";
			    	    		if(t[i]<10)
			    	    			s4=s4+"     "+t2[i+1];
			    	    		else
			    	    			s4=s4+"    "+t2[i+1];
			    	    	}
		    	    	}
		    	    	s5=s5+"P"+n+"\n";
		    	    	s6=s6+Integer.parseInt(editTime.getText().toString())+"\n";
		    	    	
		    	    	textGrantt1.setText(s1+"┐");
		    	    	textGrantt2.setText(s2);
		    	    	textGrantt3.setText(s3+"┘");
		    	    	textGrantt4.setText(s4);
	
		    	    	textProcess.setText(s5);
		    	    	textTime.setText(s6);
		    	    	editTime.setText("");
		    	    	n++;
		    	    	textShow.setText("請輸入行程P"+n+"的分割時間");
						break;
					}catch(Exception e){
				
					}
				}
				case R.id.btnBack:
				{
					finish();
				}

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
