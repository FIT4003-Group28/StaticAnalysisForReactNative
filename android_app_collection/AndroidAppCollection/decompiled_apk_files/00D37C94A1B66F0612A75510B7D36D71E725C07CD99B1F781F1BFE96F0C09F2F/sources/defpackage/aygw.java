package defpackage;

import io.grpc.Status;
/* compiled from: PG */
/* renamed from: aygw  reason: default package */
/* loaded from: classes2.dex */
abstract class aygw implements ayeq {
    @Override // defpackage.ayeq
    public void a(Status status, ayep ayepVar, ayat ayatVar) {
        throw null;
    }

    protected abstract ayeq b();

    @Override // defpackage.ayeq
    public final void c(ayat ayatVar) {
        b().c(ayatVar);
    }

    @Override // defpackage.aymn
    public final void d(aymm aymmVar) {
        b().d(aymmVar);
    }

    @Override // defpackage.aymn
    public final void e() {
        b().e();
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("delegate", b());
        return c.toString();
    }
}
