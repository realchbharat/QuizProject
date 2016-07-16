package com.example.quizproject;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		if(this instanceof FavActivity)
		{
			menu.getItem(1).setVisible(false);
		}
	
		if(this instanceof SettingActivity)
		{
			menu.getItem(0).setVisible(false);
		}
		
		return true;
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		switch(id)
		{
		case(R.id.action_fav):
			startActivity(new Intent(this,FavActivity.class));
			break;
		case(R.id.action_settings):
			startActivity(new Intent(this,SettingActivity.class));
			break;
		}
		return super.onOptionsItemSelected(item);
}
	public void STARTGAME(View view) {
		startActivity(new Intent(this, StartGameActivity.class));

	}

	public void QuitGAME(View view) {
		startActivity(new Intent(this, QuitGameActivity.class));

	}
}