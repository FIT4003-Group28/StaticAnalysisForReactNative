package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: csco  reason: default package */
/* loaded from: classes5.dex */
public final class csco extends BroadcastReceiver {
    public final /* synthetic */ cscq a;

    public csco(cscq cscqVar) {
        this.a = cscqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (this.a.e) {
            cscq cscqVar = this.a;
            cscp cscpVar = cscqVar.c;
            if (cscpVar != null) {
                if (cscqVar.d) {
                    Context context2 = cscqVar.a;
                    dbsk.s(cscpVar);
                    context2.unbindService(cscpVar);
                    cscqVar.d = false;
                }
                cscqVar.g = null;
                cscqVar.f = null;
                this.a.b();
            }
        }
    }
}
