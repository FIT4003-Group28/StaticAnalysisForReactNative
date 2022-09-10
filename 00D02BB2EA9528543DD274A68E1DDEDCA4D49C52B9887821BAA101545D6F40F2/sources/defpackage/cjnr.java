package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cjnr  reason: default package */
/* loaded from: classes.dex */
final class cjnr extends BroadcastReceiver {
    final /* synthetic */ cjns a;

    public cjnr(cjns cjnsVar) {
        this.a = cjnsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.g.clear();
        if (this.a.h.l()) {
            cjns cjnsVar = this.a;
            cjnsVar.c(cjnsVar.h);
        }
    }
}
