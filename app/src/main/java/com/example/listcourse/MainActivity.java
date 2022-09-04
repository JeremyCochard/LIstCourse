package com.example.listcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    protected EditText textInsertProduit;
    protected TextView textInflateProduitList;
    protected Button buttonValider, buttonEffacer, buttonSupprimerList;
    protected LinearLayout zoneInflateListProduit;
    protected LayoutInflater layoutInflater;
    protected String _textInsertProduit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init elements
        this.textInsertProduit=(EditText) findViewById(R.id.textInsertProduit);
        this.textInflateProduitList=(TextView) findViewById(R.id.textInflateProduitList);

        this.buttonValider=(Button) findViewById(R.id.buttonValider);
        this.buttonEffacer=(Button) findViewById(R.id.buttonEffacer);
        this.buttonSupprimerList=(Button) findViewById(R.id.buttonSupprimerList);

        _textInsertProduit=textInsertProduit.getText().toString();


        //init inflate
        this.zoneInflateListProduit=(LinearLayout) findViewById(R.id.zoneInflateListProduit);
        this.layoutInflater=(LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        //event on click
        buttonValider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //inflate produit
                zoneInflateListProduit.removeAllViews();

                View viewInflater = layoutInflater.inflate(R.layout.list_inflater, null, false);
                zoneInflateListProduit.addView(viewInflater);

                textInflateProduitList.setText(_textInsertProduit);
            }
        });

        buttonEffacer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

       /* buttonSupprimerList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
    }
}