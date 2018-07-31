package com.example.kylee.justjava2;

import android.media.MediaPlayer;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kylee.justjava2.R;

/**

 * This app displays an order form to order coffee.

 */

public class MainActivity extends AppCompatActivity {
    int quantity = 0;
    double cost = 2.75;
    int number = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playsBackground();

    }

    protected void playsBackground(){
        MediaPlayer sugar= MediaPlayer.create(MainActivity.this,R.raw.sugar);
        sugar.start();
    }






    /**

     * This method is called when the order button is clicked.

     */

    public void submitOrder(View view) {

        display(quantity);

        CheckBox whippedCreamBox = (CheckBox) findViewById(R.id.checkbox);
        boolean hasWhippedCream = whippedCreamBox.isChecked();

        CheckBox chocolateToppingBox = (CheckBox) findViewById(R.id.checkbox);
        boolean haschocolateToppingBox = chocolateToppingBox.isChecked();
        EditText nameBox = (EditText)findViewById(R.id.namebar);
        String name = nameBox.getText().toString();

        String nameMessage = " \nname";
        String toppingsMessage = "Added whipped cream?" + " "+ hasWhippedCream;
        String topping2message = "Added Chocolate Topping" + " "+ haschocolateToppingBox;
        String quantityMessage = "\nQuantity: " + quantity;
        String priceMessage = "\nTotal: $" + (cost*quantity);
        String tyMessage= "\nThank you for shopping at Starbucks!";
        String finalMessage = nameMessage+toppingsMessage+quantityMessage+priceMessage+tyMessage;
        displayMessage(finalMessage);
    }

    /**

     * This method displays the given quantity value on the screen.

     */

    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(R.id.quantitynumber);

        quantityTextView.setText("" + number);


    }
    private void displayMessage(String message) {

        TextView orderTextView = (TextView) findViewById((R.id.numberordersummary));
        orderTextView.setText(message);
    }





    public void increment(View view){
        quantity ++;
        display(quantity);
    }
    public void decrement(View view){

        if(quantity >0){
            quantity--;
            display(quantity);


        }
    }
//r.drawable""
}

