package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: clow  reason: default package */
/* loaded from: classes5.dex */
final class clow extends BroadcastReceiver {
    final /* synthetic */ clox a;

    public clow(clox cloxVar) {
        this.a = cloxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final clox cloxVar = this.a;
        cloxVar.a.post(new Runnable(cloxVar) { // from class: clov
            private final clox a;

            {
                this.a = cloxVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a();
            }
        });
    }
}
