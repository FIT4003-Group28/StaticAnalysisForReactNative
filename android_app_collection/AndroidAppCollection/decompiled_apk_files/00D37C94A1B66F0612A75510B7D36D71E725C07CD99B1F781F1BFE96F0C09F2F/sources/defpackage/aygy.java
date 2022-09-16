package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aygy  reason: default package */
/* loaded from: classes2.dex */
abstract class aygy implements ayez {
    protected abstract ayez a();

    @Override // defpackage.axzw
    public final axzs c() {
        return a().c();
    }

    @Override // defpackage.ayjt
    public final Runnable d(ayjs ayjsVar) {
        return a().d(ayjsVar);
    }

    @Override // defpackage.ayjt
    public void j(Status status) {
        a().j(status);
    }

    @Override // defpackage.ayjt
    public void k(Status status) {
        a().k(status);
    }

    @Override // defpackage.ayer
    public ayeo l(ayax ayaxVar, ayat ayatVar, axyd axydVar, azqj[] azqjVarArr) {
        throw null;
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("delegate", a());
        return c.toString();
    }
}
