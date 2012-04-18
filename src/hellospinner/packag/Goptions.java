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

public class Goptions extends Activity {
    /** Called when the activity is first created. */
	Button button,cancel,accept;
	Boolean sound=false;
	String  selected;
	Spinner s;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goptions);
		addListenerOnButton();
        s = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.Sprachen, android.R.layout.simple_spinner_item);
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
				    button.setText(" An");


				}
				    else{
				    	sound=false;
				    	button.setText("Aus");
				    }
				
			}
			 
		});
		accept.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				selected =s.getSelectedItem().toString();
				if(selected.equals("Englisch")){
					 Intent intent = new Intent(Goptions.this, Start.class);
				     startActivity(intent);
				}
				else{
					Intent intent = new Intent(Goptions.this, Gstart.class);
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