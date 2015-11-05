package com.jsosa.devfestintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ReceiveIntentActivity extends AppCompatActivity
{
    /**
     * Represents the KEY that will hold the extra within the Intent.
     */
    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_receive_intent);

        Intent intent = getIntent(); //We get a reference of our intent.
        String messageText = intent.getStringExtra(EXTRA_MESSAGE); //We retrieve our extra using our defined constant.
        TextView messageView = (TextView) findViewById(R.id.message_text_view); //get a reference to the TextView.
        messageView.setText(messageText); //display the message.
    }
}
