package com.teslamotors.plugins.ble;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
/* loaded from: classes.dex */
public class BLEBootReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5151a = "BLEBootReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.teslamotors.plugins.client.e a2 = com.teslamotors.plugins.client.e.a(context);
        if (!intent.getAction().equals("android.intent.action.BOOT_COMPLETED") || !BLEService.a(context, a2.y(), a2.x())) {
            return;
        }
        String y = a2.y();
        String d2 = a2.d(y);
        Intent intent2 = new Intent(context, BLEService.class);
        intent2.putExtra("VIN", y);
        intent2.putExtra("ACCOUNT_EMAIL", a2.x());
        intent2.putExtra("VEHICLE_NAME", d2);
        if (Build.VERSION.SDK_INT >= 26 && BLEService.b(context, a2.y(), a2.x())) {
            context.startForegroundService(intent2);
        } else {
            context.startService(intent2);
        }
    }
}
