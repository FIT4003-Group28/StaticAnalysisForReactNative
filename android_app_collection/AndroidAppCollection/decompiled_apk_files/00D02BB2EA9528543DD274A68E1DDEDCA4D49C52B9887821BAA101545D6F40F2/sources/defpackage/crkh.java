package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: crkh  reason: default package */
/* loaded from: classes5.dex */
final class crkh extends BroadcastReceiver {
    final /* synthetic */ crkm a;

    public crkh(crkm crkmVar) {
        this.a = crkmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ((ckcn) this.a.d.a(ckhi.aX)).a();
        this.a.J.b(new Runnable(this) { // from class: crkg
            private final crkh a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.i(null, null, false, false);
            }
        }, bvrj.NAVIGATION_INTERNAL);
    }
}
