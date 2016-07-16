package com.example.quizproject;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class StartGameActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start_game);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start_game, menu);
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
	
	public void Topics(View view){
		startActivity(new Intent(this, TopicsActivity.class));
		
		
	//}
	
//public void clickPrev(View view){
		
		//Toast.makeText(this, QuestionUtil.getQuestions("").get(0).desc, 1000).show();
	//	startActivity(new Intent(this, QuestionActivity.class));
	//}
	//public void clickNext(View view){
		//Toast.makeText(this, "clicked next", 1000).show();
	}
}
