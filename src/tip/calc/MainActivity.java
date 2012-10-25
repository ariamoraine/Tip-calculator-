package tip.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends Activity implements OnClickListener{

	public double billAmount;
	public double tipAmount;
	public double totalAmount;
	public EditText text;
	public TextView tipAmountText;
	public TextView totalAmountText;
	public double billValue;

	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fifteenButton = (Button) findViewById(R.id.fifteenButton);
        Button twentyButton = (Button) findViewById(R.id.twentyButton);
        Button twentyfiveButton = (Button) findViewById(R.id.twentyfiveButton);
        fifteenButton.setOnClickListener(this);
        twentyButton.setOnClickListener(this);
        twentyfiveButton.setOnClickListener(this);
        text = (EditText) findViewById(R.id.billAmount);
        tipAmountText = (TextView)findViewById(R.id.tipamount);
        totalAmountText = (TextView)findViewById(R.id.totalText);
    }
    
    public void onClick (View view) {
    	switch (view.getId()){
    	
    	case R.id.fifteenButton:
    		
    		if (text.getText().length() == 0) {
    			Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show();
    			}
    		else{
			billValue = Double.parseDouble(text.getText().toString());
    		fifteenPre(billValue);
    		totalAmountText.setText(String.valueOf(" " + totalAmount));
    		tipAmountText.setText(String.valueOf(" " + tipAmount));
    		}
    	break;
    	
    	case R.id.twentyButton:
    		if (text.getText().length() == 0) {
    			Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show();
    			}
    		else{
    		billValue = Double.parseDouble(text.getText().toString());
    		twentyPre(billValue);
    		totalAmountText.setText(String.valueOf(" " + totalAmount));
    		tipAmountText.setText(String.valueOf(" " + tipAmount));
    		}
    	break;
    	
    	case R.id.twentyfiveButton:
    		if (text.getText().length() == 0) {
    			Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show();
    			}
    		else{
    		billValue = Double.parseDouble(text.getText().toString());
    		twentyfivePre(billValue);
    		totalAmountText.setText(String.valueOf(" " + totalAmount));
    		tipAmountText.setText(String.valueOf(" " + tipAmount));
    		}
    	break;
    	
    	
    	}
    	
    }
    public void fifteenPre (double billAmount){
    	tipAmount = billAmount * 0.15;
		totalAmount = billAmount + tipAmount;
	}
	
	public void twentyPre (double billAmount){
		tipAmount = billAmount * 0.20;
		totalAmount = billAmount + tipAmount;
	}
		
	public void twentyfivePre (double billAmount){
		tipAmount = billAmount * 0.25;
		totalAmount = billAmount + tipAmount;
	}
}
