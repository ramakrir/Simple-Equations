package simpleequationss.example.jay.simpleequationss;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class SphereVolume extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere_volume);
    }
    public void onButtonClick( View v)
    {
        Double n1 , answer1;
        EditText e1 = (EditText) findViewById(R.id.num1);
        TextView t1 = (TextView) findViewById(R.id.textView2);
        if (e1.getText().length() == 0 ) {
            t1.setText("Please enter the radius");
        }else if (e1.getText().toString().equals(".")){
            t1.setText("Invalid Number");
        }
        else {
            n1 = Double.parseDouble(e1.getText().toString());
            answer1 = ((1.33333333)*(Math.PI)*(n1*n1*n1));
            t1.setText(Double.toString(answer1));
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sphere_volume, menu);
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
