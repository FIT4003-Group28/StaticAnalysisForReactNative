package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cabf  reason: default package */
/* loaded from: classes4.dex */
public final class cabf extends BroadcastReceiver {
    final /* synthetic */ cabg a;

    public cabf(cabg cabgVar) {
        this.a = cabgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!ako.a()) {
            this.a.b.S(bvjk.gP, true);
        }
        this.a.c.a().o(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 2);
        this.a.a.unregisterReceiver(this);
    }
}
