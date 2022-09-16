package defpackage;
/* compiled from: PG */
/* renamed from: ntk  reason: default package */
/* loaded from: classes3.dex */
public final class ntk implements nrl {
    public boolean a;
    public amvn b;
    private final aynx c;
    private final aynx d;
    private final aynx e;

    public ntk(ghs ghsVar, npt nptVar, nqr nqrVar, nqk nqkVar) {
        aynx h = aynx.sn(ghsVar.a, nqrVar.a, aynx.B(false).j(nptVar.b.u(noc.i).C(nox.r).C(nox.q)), img.j).n().q(new ntj(this)).h(nps.l);
        this.c = h;
        this.d = aynx.e(h, nqrVar.a, nti.a);
        aynx h2 = aynx.B(amyg.a).j(nqkVar.c.u(noc.i).C(nox.s)).n().q(new ntj(this, 1)).h(nps.l);
        this.e = h2;
        h.Y();
        h2.Y();
    }

    @Override // defpackage.nrl
    public final amvn a() {
        return this.b;
    }

    @Override // defpackage.nrl
    public final aynx b() {
        return this.e;
    }

    @Override // defpackage.nrl
    public final aynx c() {
        return this.d;
    }

    @Override // defpackage.nrl
    public final aynx d() {
        return this.c;
    }

    @Override // defpackage.nrl
    public final boolean e() {
        return this.a;
    }
}
