package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: aoct  reason: default package */
/* loaded from: classes.dex */
final class aoct extends BroadcastReceiver {
    final /* synthetic */ aocu a;
    private aocu b;

    public aoct(aocu aocuVar, aocu aocuVar2) {
        this.a = aocuVar;
        this.b = aocuVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        aocu aocuVar = this.b;
        if (aocuVar == null) {
            return;
        }
        if (!aocuVar.a()) {
            return;
        }
        aocu aocuVar2 = this.b;
        aocuVar2.b.d(aocuVar2, 0L);
        context.unregisterReceiver(this);
        this.b = null;
    }
}
