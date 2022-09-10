package defpackage;
/* compiled from: PG */
/* renamed from: aflc  reason: default package */
/* loaded from: classes2.dex */
final class aflc implements Runnable {
    final /* synthetic */ qbs a;
    final /* synthetic */ vun b;
    final /* synthetic */ afld c;

    public aflc(afld afldVar, qbs qbsVar, vun vunVar) {
        this.c = afldVar;
        this.a = qbsVar;
        this.b = vunVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qcw x = qcx.x();
        x.k(this.a);
        x.s(this.b.a());
        x.r(this.b.l.get(0));
        x.u(this.b.l.get(1));
        x.w(this.b.b);
        x.g(this.b.e);
        x.h(this.b.f);
        x.v(this.b.p);
        x.t(this.b.c);
        this.c.a.a().n(x.a());
    }
}
