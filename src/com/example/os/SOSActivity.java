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

public class SOSActivity extends Activity {
	private TextView textShow,textshow2,textGrantt1,textGrantt2,textGrantt3,textGrantt4,textProcess,textTime,textprio;
	private EditText editTime,editpri;
	private  Button btnTime,btnb;
	int n=1,m,m1;
	int t[]=new int[10];
	int t2[]=new int[11];
	int pri[]=new int[10];
	String p[]=new String[10];
	String m2,s1,s2,s3,s4,s5="",s6="",s7="";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_os);
		
		textShow=(TextView)findViewById(R.id.textShow);
		textshow2=(TextView)findViewById(R.id.textshow2);
		textGrantt1=(TextView)findViewById(R.id.textGrantt1);
		textGrantt2=(TextView)findViewById(R.id.textGrantt2);
		textGrantt3=(TextView)findViewById(R.id.textGrantt3);
		textGrantt4=(TextView)findViewById(R.id.textGrantt4);
		textProcess=(TextView)findViewById(R.id.textProcess);
		textTime=(TextView)findViewById(R.id.textTime);
		textprio=(TextView)findViewById(R.id.textprio);
		btnTime=(Button)findViewById(R.id.btnTime);
		btnb=(Button)findViewById(R.id.btnBack);
		editTime=(EditText)findViewById(R.id.editTime);
		editpri=(EditText)findViewById(R.id.editpri);
		btnTime.setOnClickListener(l);
		btnb.setOnClickListener(l);
	}

	private Button.OnClickListener l = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId()){
			
				case R.id.btnTime:
				{
					try{
					
						s1="┌──";s2="│ ";s3="└──";s4="0";
		    	    	t[n-1] = Integer.parseInt(editTime.getText().toString());
		    	    	pri[n-1]= Integer.parseInt(editpri.getText().toString());
		    	    	p[n-1]="P"+n;
		    	    	for(int k=0;k<n-1;k++){
			    	        for(int i=k;i<n-1;i++)
			        	    	for(int j=i+1;j<n;j++)
			    	    	    	if(pri[i]>pri[j])
			    	    	    	{
			    	    	    		m=pri[i];
			    	    	    		pri[i]=pri[j];
			    	    	    		pri[j]=m;
			    	    	    		m1=t[i];
			    	    	    		t[i]=t[j];
			    	    	    		t[j]=m1;
			    	    	    		m2=p[i];
			    	    	    		p[i]=p[j];
			    	    	    		p[j]=m2;
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
			    	    		s2=s2+p[i]+"│ ";
			    	    		if(t[i]<10)
			    	    			s4=s4+"       "+t2[i+1];
			    	    		else
			    	    			s4=s4+"      "+t2[i+1];
			    	    	}
		    	    	}
		    	    	else
		    	    	{
		    	    		for(int i=0;i<n;i++)	
			    	    	{
			    	    		s2=s2+p[i]+"│ ";
			    	    		if(t[i]<10)
			    	    			s4=s4+"       "+t2[i+1];
			    	    		else
			    	    			s4=s4+"      "+t2[i+1];
			    	    	}
		    	    	}
		    	    	s5=s5+"P"+n+"\n";
		    	    	s7=s7+Integer.parseInt(editpri.getText().toString())+"\n";
		    	    	s6=s6+Integer.parseInt(editTime.getText().toString())+"\n";
		    	    	
		    	    	textGrantt1.setText(s1+"┐");
		    	    	textGrantt2.setText(s2);
		    	    	textGrantt3.setText(s3+"┘");
		    	    	textGrantt4.setText(s4);
	
		    	    	textProcess.setText(s5);
		    	    	textprio.setText(s7);
		    	    	textTime.setText(s6);
		    	    	
		    	    	editTime.setText("");
		    	    	editpri.setText("");
		    	    	n++;
		    	    	if(n>10)
		    	    	{
		    	    		textShow.setText("分割時間");
			    	    	textshow2.setText("優先權");
		    	    	}
		    	    	else
		    	    	{
			    	    	textShow.setText("請輸入行程P"+n+"的分割時間");
			    	    	textshow2.setText("請輸入行程P"+n+"的優先權");
		    	    	}
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
