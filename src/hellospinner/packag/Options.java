package hellospinner.packag;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Options extends Activity {
    /** Called when the activity is first created. */
	Button button,cancel,accept;
	Boolean sound=false;
	String  selected;
	Spinner s;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		addListenerOnButton();
        s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.Language, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);


    }
	public void addListenerOnButton() {
		 
		button = (Button) findViewById(R.id.button1);
		accept = (Button) findViewById(R.id.button2);
		cancel = (Button) findViewById(R.id.button3);
		

		button.setOnClickListener(new OnClickListener() {
 
			public void onClick(View arg0) {
				if(sound==false){
					sound=true;
				    button.setText(" On");


				}
				    else{
				    	sound=false;
				    	button.setText("Off");
				    }
				
			}
			 
		});
		accept.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				selected =s.getSelectedItem().toString();
				if(selected.equals("English")){
					 Intent intent = new Intent(Options.this, Start.class);
				     startActivity(intent);
				}
				else{
					Intent intent = new Intent(Options.this, Gstart.class);
				    startActivity(intent);
				}
				
			}
			 
		});
		cancel.setOnClickListener(new OnClickListener() {
			 
			public void onClick(View arg0) {
				finish();
				
			}
			 
		});
 
	}
 

}