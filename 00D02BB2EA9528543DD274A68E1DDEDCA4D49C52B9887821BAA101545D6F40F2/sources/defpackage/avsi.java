package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: avsi  reason: default package */
/* loaded from: classes.dex */
final class avsi extends BroadcastReceiver {
    final /* synthetic */ avsm a;

    public avsi(avsm avsmVar) {
        this.a = avsmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.c.execute(new Runnable(this) { // from class: avsh
            private final avsi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.d();
            }
        });
    }
}
