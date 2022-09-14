package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cxij  reason: default package */
/* loaded from: classes5.dex */
public final class cxij extends BroadcastReceiver {
    public final cxih a;
    public final cqat b;
    private final cxhm c;

    public cxij(cxhm cxhmVar, cxih cxihVar, cqat cqatVar) {
        this.c = cxhmVar;
        this.a = cxihVar;
        this.b = cqatVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        dehn e;
        long e2 = this.b.e();
        if (!"com.google.android.gms.udc.action.FACS_CACHE_UPDATED".equals(intent.getAction())) {
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        cxhm cxhmVar = this.c;
        synchronized (((cxid) cxhmVar).a) {
            final cxid cxidVar = (cxid) cxhmVar;
            e = ((cxid) cxhmVar).e(new deff(cxidVar) { // from class: cxhu
                private final cxid a;

                {
                    this.a = cxidVar;
                }

                @Override // defpackage.deff
                public final dehn a() {
                    cxid cxidVar2 = this.a;
                    return cxid.c(cxidVar2.d(cxidVar2.b(cxik.EMPTY_CACHE)));
                }
            });
        }
        deha.q(e, new cxii(this, e2, goAsync), dege.a);
    }
}
