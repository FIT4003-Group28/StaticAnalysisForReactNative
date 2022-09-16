package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ubo  reason: default package */
/* loaded from: classes4.dex */
final class ubo extends BroadcastReceiver {
    final /* synthetic */ ubt a;

    public ubo(ubt ubtVar) {
        this.a = ubtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.a.f();
        }
    }
}
