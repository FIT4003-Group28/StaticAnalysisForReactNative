package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: rp  reason: default package */
/* loaded from: classes.dex */
final class rp extends BroadcastReceiver {
    final /* synthetic */ rq a;

    public rp(rq rqVar) {
        this.a = rqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}
