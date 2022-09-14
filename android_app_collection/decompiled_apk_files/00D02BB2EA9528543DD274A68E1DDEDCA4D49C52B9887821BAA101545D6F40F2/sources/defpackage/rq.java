package defpackage;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: rq  reason: default package */
/* loaded from: classes.dex */
public abstract class rq {
    private BroadcastReceiver a;
    final /* synthetic */ rv c;

    public rq(rv rvVar) {
        this.c = rvVar;
    }

    public abstract void a();

    public abstract IntentFilter b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        d();
        IntentFilter b = b();
        if (b == null || b.countActions() == 0) {
            return;
        }
        if (this.a == null) {
            this.a = new rp(this);
        }
        this.c.g.registerReceiver(this.a, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        BroadcastReceiver broadcastReceiver = this.a;
        if (broadcastReceiver != null) {
            try {
                this.c.g.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }
}
