package com.example.abdhesh.testone;

import android.support.constraint.solver.LinearSystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
EditText edit;
    TextView  textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar linearLayout= (ProgressBar) findViewById(R.id.pb);
        edit= (EditText) findViewById(R.id.edit);
        textView=(TextView) findViewById(R.id.text);
        // Demo chmmggit dsjj
        //test 01
        // master changes
        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String aaa=charSequence.toString();
                if(aaa.length()>5){
                   String ss= aaa.replaceAll("[A-Za-z0-9 ]", "");
                    Set<Character> charSet = new HashSet<Character>();
                    for (char c : ss.toCharArray()) {
                        charSet.add(c);
                    }
                    if(charSet.size()>=2) {
                        System.out.println(ss + "String has all unique characters");
                        textView.setText(ss + "String has all unique characters");
                    }
                    else {
                        System.out.println(ss + "String does not have all unique characters");
                        textView.setText(ss + "String does not have all unique characters");
                    }
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
    public boolean checkUnique(String str){

        HashSet hashSet = new HashSet(str.length());

        for(char c : str.toCharArray()){ //iterate through character array
            if(!hashSet.add(Character.toUpperCase(c)))//try to add each char to hashset
                return false; //return false if could not add
        }
        return true;
    }

}
