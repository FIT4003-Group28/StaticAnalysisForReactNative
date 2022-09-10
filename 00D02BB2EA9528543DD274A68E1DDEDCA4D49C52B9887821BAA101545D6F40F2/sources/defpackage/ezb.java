package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ezb  reason: default package */
/* loaded from: classes6.dex */
public final class ezb implements dxis {
    public volatile dzsj<bepq> a;
    public volatile dzsj<bgyx> b;
    public volatile dzsj<bgzb> c;
    public volatile dzsj<apnm> d;
    public volatile dzsj<beph> e;
    public volatile dzsj<bgym> f;
    public volatile dzsj<beor> g;
    public volatile dzsj<apny> h;
    public volatile dzsj<benm> i;
    public volatile dzsj<bgyg> j;
    public volatile dzsj<bepl> k;
    public final dzsj<beix> l;
    final /* synthetic */ ftt m;
    private volatile dzsj<bgyb> n;
    private volatile dzsj<bgyj> o;
    private volatile dzsj<bepf> p;
    private volatile dzsj<bepo> q;
    private volatile dzsj<bepr> r;
    private volatile dzsj<bepv> s;

    public ezb(ftt fttVar, beix beixVar) {
        this.m = fttVar;
        this.l = dxjd.b(beixVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        beix beixVar = (beix) obj;
        cjqq tp = this.m.eW.a.tp();
        dxjg.e(tp);
        beixVar.aH = tp;
        cjqy tr = this.m.eW.a.tr();
        dxjg.e(tr);
        beixVar.aI = tr;
        beixVar.aJ = dbsg.i(this.m.ap());
        Executor sU = this.m.eW.a.sU();
        dxjg.e(sU);
        beixVar.aK = sU;
        beixVar.aL = new cpv();
        beixVar.aM = dxjc.c(this.m.eW.ie());
        beixVar.aN = dxjc.c(this.m.eW.iU());
        dxjc.c(this.m.lx());
        ftt fttVar = this.m;
        beixVar.b = fttVar.a;
        beixVar.c = dxjc.c(fttVar.ti());
        bwqv rD = this.m.eW.a.rD();
        dxjg.e(rD);
        beixVar.d = rD;
        ((beiv) beixVar).e = this.m.cp();
        beixVar.f = this.m.eW.ni();
        beixVar.g = this.m.wq();
        Executor sU2 = this.m.eW.a.sU();
        dxjg.e(sU2);
        beixVar.ah = sU2;
        beixVar.ai = this.m.wl();
        ftt fttVar2 = this.m;
        dzsj<rb> dzsjVar = fttVar2.eV;
        dzsj<cqhn> il = fttVar2.eW.il();
        dzsj<cqhu> eS = this.m.eS();
        dzsj dzsjVar2 = this.n;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eza(this, 0);
            this.n = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj c = dxjh.c(this.m.fy());
        dzsj dzsjVar4 = this.p;
        if (dzsjVar4 == null) {
            dzsjVar4 = new eza(this, 1);
            this.p = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.q;
        if (dzsjVar6 == null) {
            dzsjVar6 = new eza(this, 6);
            this.q = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.r;
        if (dzsjVar8 == null) {
            dzsjVar8 = new eza(this, 15);
            this.r = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj<beio> nm = this.m.eW.nm();
        fyu fyuVar = this.m.eW;
        dzsj dzsjVar10 = fyuVar.dq;
        if (dzsjVar10 == null) {
            dzsjVar10 = new fxy(fyuVar, 636);
            fyuVar.dq = dzsjVar10;
        }
        dzsj dzsjVar11 = this.s;
        if (dzsjVar11 == null) {
            dzsjVar11 = new eza(this, 16);
            this.s = dzsjVar11;
        }
        beixVar.aj = new beqa(dzsjVar, il, eS, dzsjVar3, c, dzsjVar5, dzsjVar7, dzsjVar9, nm, dzsjVar10, dzsjVar11, this.m.eW.di());
    }

    public final bgym b() {
        ftt fttVar = this.m;
        return new bgym(fttVar.a, dxjc.c(fttVar.eW.ie()));
    }

    public final dzsj<bgyj> c() {
        dzsj<bgyj> dzsjVar = this.o;
        if (dzsjVar == null) {
            eza ezaVar = new eza(this, 2);
            this.o = ezaVar;
            return ezaVar;
        }
        return dzsjVar;
    }
}
