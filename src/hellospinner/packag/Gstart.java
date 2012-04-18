package hellospinner.packag;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Gstart extends Activity {
    /** Called when the activity is first created. */
	Boolean sound=false;
	Button button;
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.gstart);
	    addListenerOnButton();
	  }
	  public void addListenerOnButton() {
			 
			button = (Button) findViewById(R.id.button2);

			button.setOnClickListener(new OnClickListener() {
	 
				public void onClick(View arg0) {
					    Intent intent = new Intent(Gstart.this, Goptions.class);
				        startActivity(intent);


					
					
				}
				 
			});
			
	  }
}
