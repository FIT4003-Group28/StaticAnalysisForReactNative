package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cwmz  reason: default package */
/* loaded from: classes5.dex */
final class cwmz extends BroadcastReceiver {
    final /* synthetic */ cwll a;
    final /* synthetic */ cwna b;

    public cwmz(cwna cwnaVar, cwll cwllVar) {
        this.b = cwnaVar;
        this.a = cwllVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dbae.c(this.a.a(), new cwmy(this), dege.a);
    }
}
