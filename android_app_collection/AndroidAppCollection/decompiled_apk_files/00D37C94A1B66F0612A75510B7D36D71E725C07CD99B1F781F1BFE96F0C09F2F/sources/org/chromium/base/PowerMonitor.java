package org.chromium.base;

import J.N;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class PowerMonitor {
    private static PowerMonitor a;
    private boolean b;

    private PowerMonitor() {
    }

    public static void a() {
        if (a != null) {
            return;
        }
        Context context = babj.c;
        a = new PowerMonitor();
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            boolean z = false;
            if (registerReceiver.getIntExtra("plugged", 0) == 0) {
                z = true;
            }
            b(z);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        context.registerReceiver(new bacg(), intentFilter);
    }

    public static void b(boolean z) {
        a.b = z;
        N.MCImhGql();
    }

    private static int getRemainingBatteryCapacity() {
        if (a == null) {
            a();
        }
        return ((BatteryManager) babj.c.getSystemService("batterymanager")).getIntProperty(1);
    }

    private static boolean isBatteryPower() {
        if (a == null) {
            a();
        }
        return a.b;
    }
}
