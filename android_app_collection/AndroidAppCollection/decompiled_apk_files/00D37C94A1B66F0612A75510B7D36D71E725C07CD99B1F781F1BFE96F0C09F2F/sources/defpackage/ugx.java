package defpackage;
/* compiled from: PG */
/* renamed from: ugx  reason: default package */
/* loaded from: classes4.dex */
public final class ugx {
    public final ugj a;

    public ugx(ugj ugjVar) {
        this.a = ugjVar;
    }

    public final void a(ucp ucpVar, Long l, aomb aombVar) {
        long longValue = ucpVar.d.longValue();
        if (longValue == 0) {
            uev.e("ChimeSyncHelperImpl", "SYNC request falled back to FULL_SYNC for account [%s]. Account never synced before.", ucpVar.b);
            b(ucpVar, aombVar);
        } else if (l == null || longValue < l.longValue()) {
            uev.e("ChimeSyncHelperImpl", "Sending SYNC request for account [%s], current sync version [%d], for reason [%s].", ucpVar.b, ucpVar.d, aombVar.name());
            this.a.a(ucpVar, longValue, aombVar);
        } else {
            uev.e("ChimeSyncHelperImpl", "SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", ucpVar.b, ucpVar.d, l);
        }
    }

    public final void b(ucp ucpVar, aomb aombVar) {
        this.a.c(ucpVar, aombVar);
    }
}
