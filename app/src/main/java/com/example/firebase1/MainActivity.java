package com.example.firebase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * @author liem
 * @since 25/05/2020
 */

public class MainActivity extends AppCompatActivity {

    String name, Mname, Dname, num, Mnum, Dnum, Hnum, address, namestu, reva, sub, grade;
    EditText etNAME, etNUM, etMNAME, etDNAME, etHNUM, etMNUM, etDNUM, etADD, etGRADE, etNAMEG;
    Spinner spQUAR, spSUB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNAME = (EditText) findViewById(R.id.etNAME);
        etADD = (EditText) findViewById(R.id.etADD);
        etNUM = (EditText) findViewById(R.id.etNUM);
        etHNUM = (EditText) findViewById(R.id.etHnum);
        etMNAME = (EditText) findViewById(R.id.etMNAME);
        etMNUM = (EditText) findViewById(R.id.etMNUM);
        etDNAME = (EditText) findViewById(R.id.etDNAME);
        etDNUM = (EditText) findViewById(R.id.etDNUM);
        //grades:
        etNAMEG = (EditText) findViewById(R.id.etNAMEG);
        etGRADE = (EditText) findViewById(R.id.etGRADE);
        spQUAR = (Spinner) findViewById(R.id.spQUAR);
        spSUB = (Spinner) findViewById(R.id.spSUB);

        String [] arraySpinner = new String [] {"Quarter", "1", "2", "3", "4"};
        ArrayAdapter <String> adapter = new ArrayAdapter <String> (this, android.R.layout)
    }
}



//reva=