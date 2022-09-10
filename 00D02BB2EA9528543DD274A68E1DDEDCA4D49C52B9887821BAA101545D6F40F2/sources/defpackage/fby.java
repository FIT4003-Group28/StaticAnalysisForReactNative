package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fby  reason: default package */
/* loaded from: classes6.dex */
public final class fby implements dxis {
    public volatile bvdz a;
    public volatile dzsj<ccvu> b;
    final /* synthetic */ ftt c;
    private volatile dzsj<bvdz> d;
    private volatile dzsj<ccvx> e;
    private volatile dzsj<cczk> f;
    private volatile dzsj<ccrf> g;
    private volatile dzsj<cctx> h;

    public fby(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        cclk cclkVar = (cclk) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        cclkVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        cclkVar.aI = tr;
        cclkVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        cclkVar.aK = sU;
        cclkVar.aL = new cpv();
        cclkVar.aM = dxjc.c(this.c.eW.ie());
        cclkVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        dzsj<cqhn> il = this.c.eW.il();
        dzsj<cqhu> eS = this.c.eS();
        ftt fttVar = this.c;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cjqy> al = fttVar.eW.al();
        dzsj<bvrb> R = this.c.eW.R();
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fbx(this, 0);
            this.d = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<ccrh> uA = this.c.uA();
        dzsj<btvo> V = this.c.eW.V();
        dzsj c = dxjh.c(this.c.bf());
        dzsj dzsjVar4 = this.e;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fbx(this, 1);
            this.e = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.f;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fbx(this, 3);
            this.f = dzsjVar6;
        }
        cclkVar.b = new cczv(il, eS, dzsjVar, al, R, dzsjVar3, uA, V, c, dzsjVar5, dzsjVar6, this.c.eW.bk(), this.c.eW.aw());
        cclkVar.c = this.c.wk();
        cclkVar.d = this.c.wl();
        cclkVar.e = this.c.wq();
        cclkVar.f = this.c.gs();
        ftt fttVar2 = this.c;
        Object obj3 = fttVar2.da;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fttVar2.da;
                if (obj2 instanceof dxjf) {
                    Executor sV = fttVar2.eW.a.sV();
                    dxjg.e(sV);
                    obj2 = new ccvf(sV, fttVar2.eW.rF());
                    dxjc.d(fttVar2.da, obj2);
                    fttVar2.da = obj2;
                }
            }
            obj3 = obj2;
        }
        cclkVar.g = (ccvf) obj3;
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        cclkVar.ad = rp;
        dzsj<Executor> di = this.c.eW.di();
        dzsj<bbpv> ba = this.c.eW.ba();
        dzsj<bbrq> jb = this.c.eW.jb();
        dzsj<chhr> uu = this.c.uu();
        dzsj<ccrh> uA2 = this.c.uA();
        dzsj dzsjVar7 = this.g;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fbx(this, 4);
            this.g = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj<akfa> p = this.c.eW.p();
        dzsj<cctn> uy = this.c.uy();
        dzsj<ccru> uB = this.c.uB();
        dzsj dzsjVar9 = this.h;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fbx(this, 5);
            this.h = dzsjVar9;
        }
        cclkVar.ae = new ccsk(di, ba, jb, uu, uA2, dzsjVar8, p, uy, uB, dzsjVar9);
        cclkVar.af = new cczb(this.c.bf());
    }
}
