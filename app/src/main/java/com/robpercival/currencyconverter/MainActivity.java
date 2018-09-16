package com.robpercival.currencyconverter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public void convert(View view) {



        EditText dollarField = (EditText) findViewById(R.id.dollarField);

        // dollarField.animate().alpha(0).setDuration(2000);

        // dollarField.animate().x(500).setDuration(2000);

        dollarField.animate().scaleX(0.5f).setDuration(2000);

        Double dollarAmount = Double.parseDouble(dollarField.getText().toString());

        Double poundAmount = dollarAmount * 0.65;

        Toast.makeText(getApplicationContext(), "£" + poundAmount.toString(), Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
