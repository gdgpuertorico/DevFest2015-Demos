package com.jsosa.devfestintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Creates an Intent chooser which would process the meessage from
     * our messageView.
     * <p/>
     * This is an example of an implicit intent.
     *
     * @param view
     */
    public void onSendMessage(View view)
    {
        EditText messageView = (EditText) findViewById(R.id.message_edit_text);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, messageText);
        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }

    /**
     * Creates and intent to explicitly go to the ReceiveIntentActivity with an extra defined as EXTRA_MESSAGE and starts a second activity
     * <p/>
     * This is an example of an explicit intent.
     *
     * @param view
     */
    public void onSendMessageToActivity(View view)
    {
        EditText messageView = (EditText) findViewById(R.id.message_edit_text);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveIntentActivity.class);
        intent.putExtra(ReceiveIntentActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}
