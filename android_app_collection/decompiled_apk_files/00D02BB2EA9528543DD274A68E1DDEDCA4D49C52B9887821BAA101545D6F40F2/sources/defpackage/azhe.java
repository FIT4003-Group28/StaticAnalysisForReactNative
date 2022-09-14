package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: azhe  reason: default package */
/* loaded from: classes3.dex */
final class azhe extends BroadcastReceiver {
    final /* synthetic */ azhi a;

    public azhe(azhi azhiVar) {
        this.a = azhiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        azhi azhiVar = this.a;
        azhiVar.y.a().h();
        boolean i = azhiVar.y.a().i();
        boolean l = azhiVar.i.j().l();
        if (!i || !l || azhiVar.c()) {
            return;
        }
        azhiVar.b(null);
    }
}
