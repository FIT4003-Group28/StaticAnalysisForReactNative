package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
/* compiled from: PG */
/* renamed from: bsb  reason: default package */
/* loaded from: classes2.dex */
public final class bsb implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ Context b;
    final /* synthetic */ BroadcastReceiver.PendingResult c;

    public bsb(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.a = intent;
        this.b = context;
        this.c = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean booleanExtra = this.a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = this.a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = this.a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = this.a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            bqf a = bqf.a();
            int i = ConstraintProxyUpdateReceiver.a;
            String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4));
            a.d(new Throwable[0]);
            bvi.a(this.b, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
            bvi.a(this.b, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
            bvi.a(this.b, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
            bvi.a(this.b, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.c.finish();
        }
    }
}
