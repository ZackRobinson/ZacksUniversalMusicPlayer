package com.example.android.uamp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyCustomReceiver extends BroadcastReceiver {

    private static final String TAG = "MyCustomReceiverTag";

    @Override
    public void onReceive(Context context, Intent intent) {
        String toastString = "";
        switch (intent.getAction()) {
            case Intent.ACTION_TIME_TICK:
                toastString = "Ding!";
                Log.d(TAG, "onReceive: " + intent.getAction().toString());
                break;

            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
                if (isAirplaneModeOn)
                    toastString = "Airplane mode on";
                else
                    toastString = "Airplane mode off";
                break;
            case Intent.ACTION_BATTERY_LOW:
                //Find out how to pause music here
                toastString = "No juice. No music.";
                break;
            case Intent.ACTION_SCREEN_ON:
                //Find out how to start music from here
                toastString = "Welcome back! Enjoy the music.";

                break;
            case Intent.ACTION_SCREEN_OFF:
                //Find out how to pause music from here
                toastString = "You shouldn't see this message!";
                break;

        }
        Toast.makeText(context, toastString, Toast.LENGTH_LONG).show();


    }
}
