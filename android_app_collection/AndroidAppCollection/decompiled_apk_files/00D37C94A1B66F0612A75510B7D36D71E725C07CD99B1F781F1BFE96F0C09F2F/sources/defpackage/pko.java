package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pko  reason: default package */
/* loaded from: classes4.dex */
public final class pko extends BroadcastReceiver {
    final /* synthetic */ pkp a;

    public pko(pkp pkpVar) {
        this.a = pkpVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final pkp pkpVar = this.a;
        pkpVar.b.post(new Runnable() { // from class: pkn
            @Override // java.lang.Runnable
            public final void run() {
                pkp.this.b();
            }
        });
    }
}
