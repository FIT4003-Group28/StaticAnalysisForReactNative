package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: btoz  reason: default package */
/* loaded from: classes.dex */
public final class btoz extends BroadcastReceiver {
    private static final dcqe a = dcqe.c("btoz");
    private final btpa b;

    public btoz(btpa btpaVar) {
        this.b = btpaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            this.b.i().h();
            this.b.b();
            return;
        }
        bvoo.h("ConnectivityChangeReceiver should be only registered to CONNECTIVITY_ACTION!", new Object[0]);
    }
}
