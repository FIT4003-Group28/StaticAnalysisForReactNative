package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: bff  reason: default package */
/* loaded from: classes3.dex */
public final class bff extends bez<Boolean> {
    static {
        bbz.f("StorageNotLowTracker");
    }

    public bff(Context context, bif bifVar) {
        super(context, bifVar);
    }

    @Override // defpackage.bez
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.bfb
    public final /* bridge */ /* synthetic */ Object b() {
        char c;
        Intent registerReceiver = this.a.registerReceiver(null, a());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return true;
        }
        String action = registerReceiver.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return true;
        }
        return c != 1 ? null : false;
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
        if (hashCode != -1181163412) {
            if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
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
