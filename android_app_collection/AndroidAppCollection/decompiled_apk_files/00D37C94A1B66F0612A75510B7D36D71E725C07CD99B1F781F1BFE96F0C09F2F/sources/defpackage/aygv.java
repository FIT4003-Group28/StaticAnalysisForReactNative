package defpackage;

import io.grpc.Status;
import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aygv  reason: default package */
/* loaded from: classes2.dex */
public abstract class aygv implements ayeo {
    @Override // defpackage.ayeo
    public final axyb a() {
        throw null;
    }

    @Override // defpackage.ayeo
    public final void b(ayhk ayhkVar) {
        p().b(ayhkVar);
    }

    @Override // defpackage.ayeo
    public final void c(Status status) {
        p().c(status);
    }

    @Override // defpackage.ayml
    public final void d() {
        p().d();
    }

    @Override // defpackage.ayeo
    public final void e() {
        p().e();
    }

    @Override // defpackage.ayml
    public final void f() {
        p().f();
    }

    @Override // defpackage.ayml
    public final void g(int i) {
        p().g(i);
    }

    @Override // defpackage.ayml
    public final void h(axyr axyrVar) {
        p().h(axyrVar);
    }

    @Override // defpackage.ayeo
    public final void i(axyy axyyVar) {
        p().i(axyyVar);
    }

    @Override // defpackage.ayeo
    public final void j(axzb axzbVar) {
        p().j(axzbVar);
    }

    @Override // defpackage.ayeo
    public final void k(int i) {
        p().k(i);
    }

    @Override // defpackage.ayeo
    public final void l(int i) {
        p().l(i);
    }

    @Override // defpackage.ayeo
    public void m(ayeq ayeqVar) {
        throw null;
    }

    @Override // defpackage.ayml
    public final void n(InputStream inputStream) {
        p().n(inputStream);
    }

    @Override // defpackage.ayml
    public final boolean o() {
        return p().o();
    }

    protected abstract ayeo p();

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("delegate", p());
        return c.toString();
    }
}
