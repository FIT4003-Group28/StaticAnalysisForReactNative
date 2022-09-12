package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: clio  reason: default package */
/* loaded from: classes5.dex */
final class clio extends BroadcastReceiver {
    final /* synthetic */ clip a;
    private final cljr b;
    private final Runnable c;

    public clio(clip clipVar, cljr cljrVar, Runnable runnable) {
        this.a = clipVar;
        this.b = cljrVar;
        this.c = runnable;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            intent.getAction();
        } else if (intent.getBooleanExtra("noConnectivity", false)) {
        } else {
            intent.getAction();
            intent.getExtras();
            if (!this.a.a(this.b)) {
                return;
            }
            this.c.run();
        }
    }
}
