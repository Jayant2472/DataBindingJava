package org.toon.databindingjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import org.toon.databindingjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //        Before Data Binding
//        setContentView(R.layout.activity_main);
//
//        TextView textViewName = (TextView) findViewById(R.id.text_view_name);
//        TextView textViewOccupation = (TextView) findViewById(R.id.text_view_occupation);
//
//        textViewName.setText("Elon Musk");
//        textViewOccupation.setText("Entrepreneur, Engineer, Inventor, Investor");


//        After Data Binding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        PersonVO personVO = new PersonVO("Elon Musk", "Entrepreneur, Engineer, Inventor, Investor");

        binding.setPersonVO(personVO);

    }
}
