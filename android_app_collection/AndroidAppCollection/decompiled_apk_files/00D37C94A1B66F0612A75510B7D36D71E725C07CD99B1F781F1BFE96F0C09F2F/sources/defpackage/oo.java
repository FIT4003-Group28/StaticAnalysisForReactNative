package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oo  reason: default package */
/* loaded from: classes3.dex */
public abstract class oo {
    private BroadcastReceiver a;
    final /* synthetic */ ot c;

    public oo(ot otVar) {
        this.c = otVar;
    }

    public abstract IntentFilter a();

    public abstract void b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.d.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        c();
        IntentFilter a = a();
        if (a.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new on(this);
        }
        this.c.d.registerReceiver(this.a, a);
    }
}
