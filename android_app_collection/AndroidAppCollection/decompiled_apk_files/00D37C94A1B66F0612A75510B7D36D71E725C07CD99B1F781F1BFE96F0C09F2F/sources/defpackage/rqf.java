package defpackage;
/* compiled from: PG */
/* renamed from: rqf  reason: default package */
/* loaded from: classes4.dex */
public final class rqf extends aopa implements aoqv {
    public rqf() {
        super(rqg.f());
    }

    public final rqi a(int i) {
        return ((rqg) this.instance).g(i);
    }

    public final void b(rqi rqiVar) {
        copyOnWrite();
        rqg.k((rqg) this.instance, rqiVar);
    }

    public final void c(int i) {
        copyOnWrite();
        rqg.n((rqg) this.instance, i);
    }

    public final void d(int i, rqi rqiVar) {
        copyOnWrite();
        rqg.j((rqg) this.instance, i, rqiVar);
    }

    public final void e(aopa aopaVar) {
        copyOnWrite();
        rqg.k((rqg) this.instance, (rqi) aopaVar.mo39build());
    }
}
