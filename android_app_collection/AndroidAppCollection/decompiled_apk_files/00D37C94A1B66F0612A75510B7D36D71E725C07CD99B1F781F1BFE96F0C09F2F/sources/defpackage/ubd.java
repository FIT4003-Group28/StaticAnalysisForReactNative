package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: ubd  reason: default package */
/* loaded from: classes4.dex */
final class ubd extends BroadcastReceiver {
    final /* synthetic */ amqo a;

    public ubd(amqo amqoVar) {
        this.a = amqoVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, uaz] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ?? r1 = this.a.get();
        if (r1 != 0) {
            r1.i();
        }
    }
}
