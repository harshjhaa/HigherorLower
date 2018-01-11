package com.jhaharsh.android.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int count=1,x;
   public int reset(){
       Random rand = new Random();
       int n = rand.nextInt(20) + 1;
       return n;
   }
    public void reStart(View view){

        count = 1;
    }
    public void makeToast(String str){

        Toast.makeText(MainActivity.this,str,Toast.LENGTH_SHORT).show();
    }
    public void checkNo(View view){
        if (count > 4) {
             makeToast("Chance exceeded ! YOU LOOSE !");
         }
         else {
             if(count == 1){
                 x = reset();
             }
             count = count + 1;
             EditText editText = (EditText) findViewById(R.id.editText);
             int val = Integer.parseInt(editText.getText().toString());
             if (val > x){
                 makeToast("HIGHER !");
             }
             else if (val < x){
                 makeToast("LOWER !");
             }
             else{
                 makeToast("CORRECT ! Press Restart to play again.");
             }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
