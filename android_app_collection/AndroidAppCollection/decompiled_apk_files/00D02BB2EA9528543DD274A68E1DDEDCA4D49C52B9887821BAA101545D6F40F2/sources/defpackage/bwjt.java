package defpackage;
/* compiled from: PG */
/* renamed from: bwjt  reason: default package */
/* loaded from: classes4.dex */
public final class bwjt extends itb implements bwjz {
    public final cjqy a;
    public final dxio<bwjh> b;
    private final cjqv c = new bwjs(this);
    private final gga d;
    private final btrm e;
    private final bwqv f;
    private final dxio<nut> g;
    private final dxio<hwd> h;
    private final dxio<akox> i;

    public bwjt(gga ggaVar, btrm btrmVar, cjqy cjqyVar, bwqv bwqvVar, dxio<akox> dxioVar, dxio<nut> dxioVar2, dxio<hwd> dxioVar3, dxio<bwjh> dxioVar4) {
        this.d = ggaVar;
        this.i = dxioVar;
        this.e = btrmVar;
        this.a = cjqyVar;
        this.f = bwqvVar;
        this.g = dxioVar2;
        this.h = dxioVar3;
        this.b = dxioVar4;
    }

    @Override // defpackage.itb
    public final void Ns() {
        super.Ns();
        this.g.a();
        this.b.a().e();
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(gds.class, new bwju(gds.class, this, bvrj.UI_THREAD));
        btrmVar.g(this, a.a());
        this.a.z(this.c);
    }

    @Override // defpackage.itb
    public final void Nt() {
        super.Nt();
        this.h.a().n();
        this.b.a().i();
    }

    @Override // defpackage.itb
    public final void Nu() {
        this.b.a().f();
        this.a.A(this.c);
        this.e.a(this);
        super.Nu();
    }

    @Override // defpackage.itb
    public final void Po() {
        this.b.a().g();
        super.Po();
    }

    @Override // defpackage.bwjz
    public final bwne e() {
        return this.b.a().b;
    }

    @Override // defpackage.bwjz
    public final void f() {
        this.b.a().d();
    }

    @Override // defpackage.bwjz
    public final void i(bwno bwnoVar, @dzsi bwjw bwjwVar) {
        this.b.a().h(bwnoVar, bwjwVar, btys.f);
    }

    @Override // defpackage.bwjz
    public final void j(bwjw bwjwVar) {
        bwjr bwjrVar = this.b.a().a;
        bwjrVar.j.a(new bwjq(bwjrVar, new bwnn().a(), bwjwVar));
    }

    @Override // defpackage.bwjz
    public final boolean k(dtja dtjaVar) {
        bwjh a = this.b.a();
        if (dtjaVar == null) {
            return true;
        }
        int ordinal = dtjaVar.ordinal();
        if (ordinal == 1) {
            return a.a().b().a;
        }
        if (ordinal != 2 && ordinal != 3 && ordinal != 4 && ordinal != 5 && ordinal != 7) {
            return false;
        }
        return a.a().b().b;
    }

    @Override // defpackage.bwjz
    public final void l(bwnj bwnjVar, fd fdVar) {
        this.d.D(bwje.aR(this.f, bwnjVar, fdVar));
    }

    @Override // defpackage.bwjz
    public final void m(dtlv dtlvVar, @dzsi fd fdVar) {
        gga ggaVar = this.d;
        bwqv bwqvVar = this.f;
        dxio<akox> dxioVar = this.i;
        int i = dtlvVar.d;
        String str = dtlvVar.b;
        String str2 = dtlvVar.c;
        String str3 = dtlvVar.a;
        bwnj bwnjVar = new bwnj();
        bwnjVar.c(bwnd.a(i));
        bwnjVar.e(false);
        bwnjVar.p(dbsj.d(str3) ? bwnl.a : new bwnl(str3));
        if (!dbsj.d(str)) {
            bwnjVar.w(str);
        }
        if (!dbsj.d(str2)) {
            bwnjVar.y(str2);
        }
        bwnjVar.z(dxioVar.a().n());
        bwnjVar.A(alao.b(dxioVar.a()));
        fd K = ggaVar.K();
        if ((K instanceof bwjv) && ((bwjv) K).aS()) {
            bwnjVar.Z();
        }
        bwje aR = bwje.aR(bwqvVar, bwnjVar, fdVar);
        fd K2 = this.d.K();
        if (K2 instanceof gfw) {
            ((gfw) K2).aZ(aR);
        } else {
            this.d.D(aR);
        }
    }
}
