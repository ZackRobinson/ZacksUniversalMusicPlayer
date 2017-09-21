package com.example.android.uamp.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class ZacksCustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String toastString = "";
        switch (intent.getAction()) {


            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                boolean isAirplaneModeOn = intent.getBooleanExtra("state", false);
                if (isAirplaneModeOn)
                    toastString = "Airplane mode on";
                else
                    toastString = "Airplane mode off";
                break;
        }

        Toast.makeText(context, toastString, Toast.LENGTH_SHORT).show();
    }
}
