package com.example.rohan.whosfirst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Calendar cal = Calendar.getInstance();
		Date nowTime = cal.getTime();
		cal.set(Calendar.HOUR_OF_DAY, 11);
		cal.set(Calendar.MINUTE, 40);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		Date rightTime = cal.getTime();

		if(nowTime.before(rightTime)){
			TextView waitText = findViewById(R.id.notTimeText);
			waitText.setVisibility(View.VISIBLE);
		}
		else{

		}
	}

}
