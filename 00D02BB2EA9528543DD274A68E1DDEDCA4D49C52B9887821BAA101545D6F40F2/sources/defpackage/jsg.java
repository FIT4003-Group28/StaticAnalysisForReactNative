package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: jsg  reason: default package */
/* loaded from: classes7.dex */
final class jsg extends BroadcastReceiver {
    final /* synthetic */ jsh a;

    public jsg(jsh jshVar) {
        this.a = jshVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b.S(bvjk.fT, true);
        this.a.a.unregisterReceiver(this);
    }
}
