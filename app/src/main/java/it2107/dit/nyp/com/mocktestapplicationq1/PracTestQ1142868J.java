package it2107.dit.nyp.com.mocktestapplicationq1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PracTestQ1142868J extends AppCompatActivity {

    EditText etName;
    EditText etPhone;
    RadioButton rdbtnMale;
    RadioButton rdbtnFemale;
    Button btnRegister;
    TextView tvRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac_test_q1142868_j);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        etName = (EditText)findViewById(R.id.etName);
        etPhone=  (EditText)findViewById(R.id.etPhone);
        rdbtnMale = (RadioButton)findViewById(R.id.rdbtnMale);
        rdbtnFemale = (RadioButton)findViewById(R.id.rdbtnFemale);
        btnRegister = (Button)findViewById(R.id.btnRegister);
        tvRegister = (TextView)findViewById(R.id.tvRegister);

                btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String display = etName.getText() +", "+ etPhone.getText() + ", "+
                        String.valueOf(rdbtnMale.isChecked()) + ", " + String.valueOf(rdbtnFemale.isChecked());
                tvRegister.setText(display);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_prac_test_q1142868_j, menu);
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
