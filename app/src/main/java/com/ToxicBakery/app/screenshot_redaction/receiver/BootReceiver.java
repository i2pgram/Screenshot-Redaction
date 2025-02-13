package com.ToxicBakery.app.screenshot_redaction.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.ToxicBakery.app.screenshot_redaction.service.ScreenshotService;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            ScreenshotService.startScreenshotService(context);
        }
    }

}
