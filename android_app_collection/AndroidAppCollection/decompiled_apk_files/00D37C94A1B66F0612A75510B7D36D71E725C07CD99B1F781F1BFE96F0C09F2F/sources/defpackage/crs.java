package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: crs  reason: default package */
/* loaded from: classes3.dex */
public final class crs extends BroadcastReceiver {
    final /* synthetic */ crt a;

    public crs(crt crtVar) {
        this.a = crtVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        crt crtVar = this.a;
        boolean z = crtVar.a;
        crtVar.a = crt.a(context);
        crt crtVar2 = this.a;
        boolean z2 = crtVar2.a;
        if (z != z2) {
            cgf cgfVar = crtVar2.b;
            if (!z2) {
                return;
            }
            synchronized (cgfVar.b) {
                csm csmVar = cgfVar.a;
                for (cth cthVar : cvd.g(csmVar.a)) {
                    if (!cthVar.l() && !cthVar.k()) {
                        cthVar.c();
                        if (!csmVar.c) {
                            cthVar.b();
                        } else {
                            csmVar.b.add(cthVar);
                        }
                    }
                }
            }
        }
    }
}
