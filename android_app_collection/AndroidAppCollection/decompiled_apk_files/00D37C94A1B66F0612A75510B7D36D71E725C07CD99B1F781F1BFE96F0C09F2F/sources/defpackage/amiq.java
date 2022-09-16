package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
/* compiled from: PG */
/* renamed from: amiq  reason: default package */
/* loaded from: classes.dex */
public final class amiq implements amip {
    private static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");
    private final Context b;
    private final BatteryManager c;

    public amiq(Context context) {
        this.b = context;
        this.c = Build.VERSION.SDK_INT >= 23 ? (BatteryManager) context.getSystemService("batterymanager") : null;
    }

    @Override // defpackage.amip
    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.c.isCharging();
        }
        Intent registerReceiver = this.b.registerReceiver(null, a);
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        int intExtra2 = registerReceiver.getIntExtra("plugged", -1);
        if (intExtra != 2 && intExtra != 5) {
            return false;
        }
        return intExtra2 == 1 || intExtra2 == 2 || intExtra2 == 4;
    }
}
