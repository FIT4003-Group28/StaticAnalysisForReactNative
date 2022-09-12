package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: cqej  reason: default package */
/* loaded from: classes5.dex */
final class cqej implements degu<dgyb> {
    final /* synthetic */ cqen a;

    public cqej(cqen cqenVar) {
        this.a = cqenVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof IOException) {
            cmuj.a(th.getMessage());
        } else if (th instanceof dyjd) {
            dyiy dyiyVar = ((dyjd) th).a.p;
        }
        this.a.d(th);
        this.a.c(cqek.CONSENT_DATA_LOADING_FAILED);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dgyb dgybVar) {
        cqen cqenVar = this.a;
        cqenVar.k = dgybVar;
        cqenVar.d(null);
        this.a.c(cqek.WAITING_FOR_USER_DECISION);
    }
}
