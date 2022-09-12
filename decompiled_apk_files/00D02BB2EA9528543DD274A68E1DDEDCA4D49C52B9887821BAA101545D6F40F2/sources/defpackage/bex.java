package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: bex  reason: default package */
/* loaded from: classes3.dex */
public final class bex extends bez<Boolean> {
    static {
        bbz.f("BatteryNotLowTracker");
    }

    public bex(Context context, bif bifVar) {
        super(context, bifVar);
    }

    @Override // defpackage.bez
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.bfb
    public final /* bridge */ /* synthetic */ Object b() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            bbz.e().b(new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bez
    public final void c(Intent intent) {
        char c;
        if (intent.getAction() == null) {
            return;
        }
        bbz e = bbz.e();
        intent.getAction();
        e.a(new Throwable[0]);
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1980154005) {
            if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            g(true);
        } else if (c != 1) {
        } else {
            g(false);
        }
    }
}
