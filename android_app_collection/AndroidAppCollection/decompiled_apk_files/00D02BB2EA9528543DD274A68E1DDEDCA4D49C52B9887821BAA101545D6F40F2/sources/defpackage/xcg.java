package defpackage;
/* compiled from: PG */
/* renamed from: xcg  reason: default package */
/* loaded from: classes7.dex */
public class xcg implements xce {
    private final zuq a;
    private final qop b;

    public xcg(qoq qoqVar, qpe qpeVar, qnm qnmVar, xbv xbvVar) {
        this.a = new xcf(qpeVar);
        qnk r = qnl.r();
        qnh qnhVar = (qnh) r;
        qnhVar.a = eaow.b(24L);
        r.k(true);
        r.i(true);
        r.d(true);
        r.f(true);
        r.h(false);
        qnhVar.b = dtyc.cA;
        qnhVar.c = dtyc.cz;
        qnhVar.d = dtyc.bT;
        qnhVar.e = dtyc.cB;
        qnhVar.f = 2;
        r.j(false);
        r.g(true);
        r.b(xbvVar.g());
        qnl a = r.a();
        dspd d = xbvVar.d();
        qcw x = qcx.x();
        x.s(dqvj.TRANSIT);
        x.r(xbvVar.a());
        x.u(xbvVar.b());
        qcx a2 = x.a();
        qcl h = qcl.h(xbvVar.a());
        qcl h2 = qcl.h(xbvVar.b());
        dbsk.s(h);
        dbsk.s(h2);
        qop a3 = qoqVar.a(qpeVar, h, h2, a2, qoh.START_COMMUTE_BOARD_PARAMS, d, xbvVar.e(), xbvVar.f(), Integer.valueOf(xbvVar.h()), null, null, qnmVar, a);
        this.b = a3;
        a3.Z(xbvVar.i());
    }

    @Override // defpackage.xce
    public qnd a() {
        return this.b;
    }

    public void b(acyu acyuVar) {
        this.b.r(acyuVar);
        this.b.s(this);
    }

    public void c() {
        this.b.v();
    }

    public void d() {
        this.b.w();
        this.b.x();
    }

    public zuq e() {
        return this.a;
    }
}
