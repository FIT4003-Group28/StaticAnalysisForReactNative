package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cqax  reason: default package */
/* loaded from: classes5.dex */
final class cqax extends BroadcastReceiver {
    final /* synthetic */ cqay a;

    public cqax(cqay cqayVar) {
        this.a = cqayVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dcep<cqaw> K;
        synchronized (this.a.a) {
            K = dcep.K(this.a.a);
        }
        for (cqaw cqawVar : K) {
            cqawVar.a();
        }
    }
}
