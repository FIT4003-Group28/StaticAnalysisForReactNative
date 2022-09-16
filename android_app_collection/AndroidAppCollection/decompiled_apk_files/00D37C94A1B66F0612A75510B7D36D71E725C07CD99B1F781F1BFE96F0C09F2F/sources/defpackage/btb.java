package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: btb  reason: default package */
/* loaded from: classes2.dex */
final class btb extends BroadcastReceiver {
    final /* synthetic */ btc a;

    public btb(btc btcVar) {
        this.a = btcVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.a.c(intent);
        }
    }
}
