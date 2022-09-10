package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: byxe  reason: default package */
/* loaded from: classes4.dex */
public final class byxe implements byxw {
    private static final dcep<String> a = dcep.C(byxy.a, byxy.b);
    private final bysv b;
    private final qjp c;
    private final btvo d;
    private final byyg e;
    private final dxio<qqb> f;

    public byxe(bysv bysvVar, qjp qjpVar, btvo btvoVar, byyg byygVar, dxio<qqb> dxioVar) {
        this.b = bysvVar;
        this.c = qjpVar;
        this.d = btvoVar;
        this.e = byygVar;
        this.f = dxioVar;
    }

    @Override // defpackage.byxw
    public final void a(Intent intent) {
        dbsk.a(b(intent));
        String action = intent.getAction();
        String stringExtra = intent.getStringExtra(byxy.d);
        if (stringExtra == null) {
            this.b.c(cken.ERROR_ACTION_DISMISS_SESSION_ID_IS_NULL);
        } else if (!byxy.a.equals(action)) {
            if (!byxy.b.equals(action)) {
                return;
            }
            this.b.c(cken.RECEIVED_INTENT_DISRUPTION_DISMISS);
            this.c.b(qjj.TRANSIT_TO_PLACE_DISRUPTION, stringExtra);
            this.b.c(cken.SUCCESSFULLY_PROCESSED_INTENT_DISRUPTION_DISMISS);
        } else {
            this.b.c(cken.RECEIVED_INTENT_DISMISS);
            dkqr dkqrVar = this.d.getNotificationsParameters().o;
            if (dkqrVar == null) {
                dkqrVar = dkqr.d;
            }
            dkhd dkhdVar = dkqrVar.a;
            if (dkhdVar == null) {
                dkhdVar = dkhd.h;
            }
            if (dkhdVar.b) {
                this.c.b(qjj.TRANSIT_TO_PLACE, stringExtra);
                this.c.b(qjj.TRANSIT_TO_PLACE_DISRUPTION, stringExtra);
                this.e.a();
                this.f.a().b(stringExtra, qjj.TRANSIT_TO_PLACE);
            }
            this.b.c(cken.SUCCESSFULLY_PROCESSED_INTENT_DISMISS);
        }
    }

    @Override // defpackage.byxw
    public final boolean b(Intent intent) {
        return a.contains(intent.getAction());
    }
}
