package defpackage;
/* compiled from: PG */
/* renamed from: bdxw  reason: default package */
/* loaded from: classes3.dex */
final class bdxw implements crzp<btlu> {
    final /* synthetic */ bdyb a;

    public bdxw(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // defpackage.crzp
    public final void On(crzm<btlu> crzmVar) {
        btlu q = btlu.q(crzmVar.l());
        this.a.aA.a().a(q);
        if (!dbsd.a(q, this.a.cc)) {
            bdyb bdybVar = this.a;
            bdybVar.cc = q;
            ilo c = bdybVar.bP.c();
            if (c == null) {
                return;
            }
            dvyw h = c.h();
            dsqp dsqpVar = (dsqp) h.cu(5);
            dsqpVar.bC(h);
            dvya dvyaVar = (dvya) dsqpVar;
            if (dvyaVar.c) {
                dvyaVar.bF();
                dvyaVar.c = false;
            }
            dvyw dvywVar = (dvyw) dvyaVar.b;
            dvyw dvywVar2 = dvyw.bv;
            dvywVar.Y = null;
            dvywVar.b &= -2049;
            dvywVar.bg = null;
            dvywVar.d &= -16385;
            ily g = c.g();
            g.E(dvyaVar.bK());
            g.c = false;
            g.e = false;
            this.a.bP.d(g.d());
            bdyb bdybVar2 = this.a;
            bdyd bdydVar = bdybVar2.bF;
            if (bdydVar != null) {
                bdydVar.c.f(bdybVar2.bP);
            }
            this.a.bJ();
        }
    }
}
