package defpackage;

import defpackage.dykl;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dykl  reason: default package */
/* loaded from: classes6.dex */
public abstract class dykl<T extends dykl<T>> extends dyhj<T> {
    protected abstract dyhj<?> b();

    @Override // defpackage.dyhj
    public final dyhi c() {
        return b().c();
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj d() {
        l();
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj e(String str) {
        r(str);
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj f(dyey[] dyeyVarArr) {
        p(dyeyVarArr);
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj g(Executor executor) {
        m(executor);
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void h(dyfj dyfjVar) {
        b().h(dyfjVar);
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void i(dyfu dyfuVar) {
        b().i(dyfuVar);
    }

    public final void l() {
        b().d();
    }

    public final void m(Executor executor) {
        b().g(executor);
    }

    @Override // defpackage.dyhj
    /* renamed from: n */
    public final void j(long j, TimeUnit timeUnit) {
        b().j(j, timeUnit);
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void o() {
        b().o();
    }

    public final void p(dyey... dyeyVarArr) {
        b().f(dyeyVarArr);
    }

    @Override // defpackage.dyhj
    /* renamed from: q */
    public final void k(Executor executor) {
        b().k(executor);
    }

    public final void r(String str) {
        b().e(str);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", b());
        return b.toString();
    }
}
