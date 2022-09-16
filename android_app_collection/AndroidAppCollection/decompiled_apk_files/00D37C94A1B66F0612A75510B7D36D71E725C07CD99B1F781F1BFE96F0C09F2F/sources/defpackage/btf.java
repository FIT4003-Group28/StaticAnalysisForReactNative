package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: btf  reason: default package */
/* loaded from: classes2.dex */
final class btf extends BroadcastReceiver {
    final /* synthetic */ bth a;

    public btf(bth bthVar) {
        this.a = bthVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        bqf a = bqf.a();
        int i = bth.g;
        a.d(new Throwable[0]);
        bth bthVar = this.a;
        bthVar.g(bthVar.b());
    }
}
