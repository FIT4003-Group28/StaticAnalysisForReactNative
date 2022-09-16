package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: gdc  reason: default package */
/* loaded from: classes3.dex */
final class gdc extends BroadcastReceiver {
    final /* synthetic */ gde a;

    public gdc(gde gdeVar) {
        this.a = gdeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Runnable runnable;
        gcu gcuVar = (gcu) this.a.g.get(intent.getAction());
        if (gcuVar == null || (runnable = gcuVar.b) == null) {
            return;
        }
        runnable.run();
    }
}
