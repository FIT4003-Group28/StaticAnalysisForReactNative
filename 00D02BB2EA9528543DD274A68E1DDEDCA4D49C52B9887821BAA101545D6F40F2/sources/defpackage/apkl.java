package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: apkl  reason: default package */
/* loaded from: classes2.dex */
final class apkl extends BroadcastReceiver {
    final /* synthetic */ apkm a;

    public apkl(apkm apkmVar) {
        this.a = apkmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.b.a().f(this.a.a, new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 2);
        this.a.a.unregisterReceiver(this);
    }
}
