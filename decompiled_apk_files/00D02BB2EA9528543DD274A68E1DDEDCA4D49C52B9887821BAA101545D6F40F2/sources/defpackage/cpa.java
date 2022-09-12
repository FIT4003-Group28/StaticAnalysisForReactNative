package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cpa  reason: default package */
/* loaded from: classes.dex */
final class cpa extends BroadcastReceiver {
    final /* synthetic */ cpb a;

    public cpa(cpb cpbVar) {
        this.a = cpbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cpb cpbVar = this.a;
        if (cpbVar.l != null) {
            if (cpbVar.e()) {
                this.a.l.a.n(true);
            } else {
                this.a.l.a.n(false);
            }
        }
    }
}
