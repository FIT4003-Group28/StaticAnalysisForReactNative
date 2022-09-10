package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyom  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyom implements dymc {
    protected abstract dymc a();

    @Override // defpackage.dysm
    public final Runnable c(dysl dyslVar) {
        return a().c(dyslVar);
    }

    @Override // defpackage.dylv
    public dyls d(dyib<?, ?> dyibVar, dyhw dyhwVar, dyet dyetVar) {
        throw null;
    }

    @Override // defpackage.dysm
    public final void e(dyjb dyjbVar) {
        a().e(dyjbVar);
    }

    @Override // defpackage.dysm
    public final void f(dyjb dyjbVar) {
        a().f(dyjbVar);
    }

    @Override // defpackage.dygs
    public final dygo k() {
        return a().k();
    }

    @Override // defpackage.dymc
    public final dyel l() {
        return a().l();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("delegate", a());
        return b.toString();
    }
}
