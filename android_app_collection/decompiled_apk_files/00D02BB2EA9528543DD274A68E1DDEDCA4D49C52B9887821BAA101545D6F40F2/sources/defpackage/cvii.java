package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cvii  reason: default package */
/* loaded from: classes5.dex */
final class cvii extends BroadcastReceiver {
    final /* synthetic */ cvin a;

    public cvii(cvin cvinVar) {
        this.a = cvinVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.a.i();
        }
    }
}
