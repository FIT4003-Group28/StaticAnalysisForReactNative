package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
/* compiled from: PG */
/* renamed from: ahei  reason: default package */
/* loaded from: classes.dex */
public final class ahei extends BroadcastReceiver {
    boolean a;
    private final Context b;
    private aijf c;

    public ahei(Context context) {
        context.getClass();
        this.b = context;
    }

    public final synchronized void a(aijf aijfVar) {
        aijfVar.getClass();
        this.c = aijfVar;
        if (!this.a) {
            this.b.registerReceiver(this, new IntentFilter("android.intent.action.HEADSET_PLUG"));
            this.a = true;
        }
    }

    public final synchronized void b() {
        if (this.a) {
            try {
                this.b.unregisterReceiver(this);
            } catch (IllegalArgumentException unused) {
                Log.w("HeadsetPlugReceiver", "Receiver already unregistered");
            }
            this.a = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        aijq aijqVar;
        if (this.c != null && intent.hasExtra("state")) {
            boolean z = true;
            if (intent.getIntExtra("state", 1) != 1) {
                z = false;
            }
            aijf aijfVar = this.c;
            if (z == aijfVar.p) {
                return;
            }
            aijfVar.p = z;
            if (z) {
                aijqVar = new aijq(3, 5);
            } else {
                aijqVar = new aijq();
            }
            aijfVar.o(aijqVar);
        }
    }
}
