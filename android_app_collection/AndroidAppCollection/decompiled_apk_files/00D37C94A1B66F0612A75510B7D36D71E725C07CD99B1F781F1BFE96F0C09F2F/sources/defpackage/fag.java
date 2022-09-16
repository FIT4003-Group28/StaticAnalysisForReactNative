package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: fag  reason: default package */
/* loaded from: classes3.dex */
class fag extends BroadcastReceiver {
    private volatile boolean a = false;
    private final Object b = new Object();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(Context context) {
        if (!this.a) {
            synchronized (this.b) {
                if (!this.a) {
                    ((faj) awwc.q(context)).is((fai) this);
                    this.a = true;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
