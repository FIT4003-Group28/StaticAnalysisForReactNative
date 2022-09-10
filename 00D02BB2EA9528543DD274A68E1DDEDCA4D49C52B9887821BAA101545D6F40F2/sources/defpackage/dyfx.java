package defpackage;

import defpackage.dyfx;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dyfx  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyfx<T extends dyfx<T>> extends dyhj<T> {
    protected abstract dyhj<?> b();

    @Override // defpackage.dyhj
    public final dyhi c() {
        return b().c();
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj d() {
        b().d();
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj e(String str) {
        b().e(str);
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj f(dyey[] dyeyVarArr) {
        b().f(dyeyVarArr);
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ dyhj g(Executor executor) {
        b().g(executor);
        return this;
    }

    @Override // defpackage.dyhj
    public final /* bridge */ /* synthetic */ void k(Executor executor) {
        b().k(executor);
    }

    @Override // defpackage.dyhj
    /* renamed from: l */
    public final void h(dyfj dyfjVar) {
        b().h(dyfjVar);
    }

    @Override // defpackage.dyhj
    /* renamed from: m */
    public final void i(dyfu dyfuVar) {
        b().i(dyfuVar);
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

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", b());
        return b.toString();
    }
}
