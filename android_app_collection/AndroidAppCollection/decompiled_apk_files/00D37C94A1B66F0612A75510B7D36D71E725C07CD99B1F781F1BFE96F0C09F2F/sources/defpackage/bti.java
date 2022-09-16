package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* compiled from: PG */
/* renamed from: bti  reason: default package */
/* loaded from: classes2.dex */
public final class bti extends btc {
    static {
        bqf.b("StorageNotLowTracker");
    }

    public bti(Context context, bwn bwnVar) {
        super(context, bwnVar);
    }

    @Override // defpackage.btc
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.bte
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

    @Override // defpackage.btc
    public final void c(Intent intent) {
        char c;
        if (intent.getAction() == null) {
            return;
        }
        bqf a = bqf.a();
        String.format("Received %s", intent.getAction());
        a.d(new Throwable[0]);
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
