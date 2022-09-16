package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bfc  reason: default package */
/* loaded from: classes3.dex */
final class bfc extends BroadcastReceiver {
    final /* synthetic */ bfe a;

    public bfc(bfe bfeVar) {
        this.a = bfeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        bbz e = bbz.e();
        int i = bfe.f;
        e.a(new Throwable[0]);
        bfe bfeVar = this.a;
        bfeVar.g(bfeVar.b());
    }
}
