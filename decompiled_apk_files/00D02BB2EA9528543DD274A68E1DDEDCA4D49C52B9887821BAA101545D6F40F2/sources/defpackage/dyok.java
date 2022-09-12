package defpackage;

import java.io.InputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyok  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyok implements dyls {
    @Override // defpackage.dyls
    public void a(dylu dyluVar) {
        throw null;
    }

    @Override // defpackage.dyvj
    public final void b(int i) {
        o().b(i);
    }

    @Override // defpackage.dyvj
    public final void c(InputStream inputStream) {
        o().c(inputStream);
    }

    @Override // defpackage.dyls
    public final void d() {
        o().d();
    }

    @Override // defpackage.dyls
    public final void e(dyjb dyjbVar) {
        o().e(dyjbVar);
    }

    @Override // defpackage.dyls
    public final dyel f() {
        throw null;
    }

    @Override // defpackage.dyvj
    public final void g() {
        o().g();
    }

    @Override // defpackage.dyvj
    public final void h(dyfi dyfiVar) {
        o().h(dyfiVar);
    }

    @Override // defpackage.dyls
    public final void i(dyfr dyfrVar) {
        o().i(dyfrVar);
    }

    @Override // defpackage.dyls
    public final void j(int i) {
        o().j(i);
    }

    @Override // defpackage.dyls
    public final void k(int i) {
        o().k(i);
    }

    @Override // defpackage.dyls
    public final void l(dypf dypfVar) {
        o().l(dypfVar);
    }

    @Override // defpackage.dyls
    public final void m(dyfu dyfuVar) {
        o().m(dyfuVar);
    }

    @Override // defpackage.dyvj
    public final void n() {
        o().n();
    }

    protected abstract dyls o();

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", o());
        return b.toString();
    }
}
