package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eze  reason: default package */
/* loaded from: classes6.dex */
public final class eze implements dxis {
    public volatile dzsj<bgym> a;
    public volatile dzsj<beor> b;
    public volatile dzsj<apnm> c;
    public volatile dzsj<bgyj> d;
    public volatile dzsj<apny> e;
    public volatile dzsj<benm> f;
    public volatile dzsj<bgyg> g;
    public volatile dzsj<beov> h;
    final /* synthetic */ ftt i;
    private volatile dzsj<bgyb> j;
    private volatile dzsj<beot> k;
    private volatile dzsj<beoh> l;
    private volatile dzsj<bepv> m;

    public eze(ftt fttVar) {
        this.i = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        beiy beiyVar = (beiy) obj;
        cjqq tp = this.i.eW.a.tp();
        dxjg.e(tp);
        beiyVar.aH = tp;
        cjqy tr = this.i.eW.a.tr();
        dxjg.e(tr);
        beiyVar.aI = tr;
        beiyVar.aJ = dbsg.i(this.i.ap());
        Executor sU = this.i.eW.a.sU();
        dxjg.e(sU);
        beiyVar.aK = sU;
        beiyVar.aL = new cpv();
        beiyVar.aM = dxjc.c(this.i.eW.ie());
        beiyVar.aN = dxjc.c(this.i.eW.iU());
        dxjc.c(this.i.lx());
        ftt fttVar = this.i;
        beiyVar.b = fttVar.a;
        beiyVar.c = dxjc.c(fttVar.ti());
        bwqv rD = this.i.eW.a.rD();
        dxjg.e(rD);
        beiyVar.d = rD;
        ((beiv) beiyVar).e = this.i.cp();
        beiyVar.f = this.i.eW.ni();
        beiyVar.g = this.i.wq();
        beiyVar.ah = this.i.wl();
        ftt fttVar2 = this.i;
        dzsj<rb> dzsjVar = fttVar2.eV;
        dzsj<cqhn> il = fttVar2.eW.il();
        dzsj dzsjVar2 = this.j;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ezd(this, 0);
            this.j = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.k;
        if (dzsjVar4 == null) {
            dzsjVar4 = new ezd(this, 1);
            this.k = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.l;
        if (dzsjVar6 == null) {
            dzsjVar6 = new ezd(this, 4);
            this.l = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.m;
        if (dzsjVar8 == null) {
            dzsjVar8 = new ezd(this, 11);
            this.m = dzsjVar8;
        }
        beiyVar.ai = new beoy(dzsjVar, il, dzsjVar3, dzsjVar5, dzsjVar7, dzsjVar8, this.i.eW.nm(), this.i.eW.di());
    }

    public final bgym b() {
        ftt fttVar = this.i;
        return new bgym(fttVar.a, dxjc.c(fttVar.eW.ie()));
    }
}
