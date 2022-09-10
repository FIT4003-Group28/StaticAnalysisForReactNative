package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fhq  reason: default package */
/* loaded from: classes6.dex */
public final class fhq implements dxis {
    public volatile dzsj<bpcf> a;
    public volatile dzsj<buny> b;
    final /* synthetic */ ftt c;
    public volatile buny d;
    private volatile dzsj<bpca> e;
    private volatile dzsj<boss> f;
    private volatile dzsj<bnxt> g;
    private volatile dzsj<bnxx> h;
    private volatile dzsj<bnyd> i;
    private volatile dzsj<bonw> j;
    private volatile dzsj<bnyj> k;
    private volatile Object l = new dxjf();

    public fhq(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bpbw bpbwVar;
        Object obj2;
        bpbw bpbwVar2 = (bpbw) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        bpbwVar2.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        bpbwVar2.aI = tr;
        bpbwVar2.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        bpbwVar2.aK = sU;
        bpbwVar2.aL = new cpv();
        bpbwVar2.aM = dxjc.c(this.c.eW.ie());
        bpbwVar2.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        bpbwVar2.d = this.c.wl();
        bpbwVar2.e = this.c.wq();
        dxjg.e(this.c.eW.a.rB());
        bpbwVar2.f = this.c.wd();
        bpbwVar2.g = this.c.bL();
        this.c.eW.cu();
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        bpbwVar2.ad = rD;
        dzsj<jmx> fO = this.c.fO();
        dzsj<btvo> V = this.c.eW.V();
        dzsj<cqkj> y = this.c.y();
        dzsj<bwqv> er = this.c.eW.er();
        dzsj<bbpv> ba = this.c.eW.ba();
        dzsj<bbrq> jb = this.c.eW.jb();
        dzsj<cqhn> il = this.c.eW.il();
        dzsj<cqhu> eS = this.c.eS();
        dzsj<boxa> cn = this.c.cn();
        dzsj<bbut> bf = this.c.bf();
        dzsj<efh> fN = this.c.fN();
        dzsj<bpto> uQ = this.c.uQ();
        dzsj<akfa> p = this.c.eW.p();
        dzsj<bpsw> uR = this.c.uR();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            bpbwVar = bpbwVar2;
            dzsjVar = new fhp(this, 0);
            this.e = dzsjVar;
        } else {
            bpbwVar = bpbwVar2;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fhp(this, 2);
            this.f = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fhp(this, 3);
            this.g = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.h;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fhp(this, 4);
            this.h = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj<akox> as = this.c.as();
        dzsj dzsjVar9 = this.i;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fhp(this, 6);
            this.i = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.j;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fhp(this, 7);
            this.j = dzsjVar11;
        }
        bpbw bpbwVar3 = bpbwVar;
        bpbwVar3.ae = new bpcr(fO, V, y, er, ba, jb, il, eS, cn, bf, fN, uQ, p, uR, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar8, as, dzsjVar10, dzsjVar11, this.c.eW.di());
        dzsj<bnyj> dzsjVar12 = this.k;
        if (dzsjVar12 == null) {
            dzsjVar12 = new fhp<>(this, 8);
            this.k = dzsjVar12;
        }
        bpbwVar3.af = dzsjVar12;
        bpbwVar3.ag = dxjc.c(this.c.bh());
        bvrb tn = this.c.eW.a.tn();
        dxjg.e(tn);
        bpbwVar3.ah = tn;
        dxjc.c(this.c.as());
        bpbwVar3.ai = dxjc.c(this.c.cy());
        dxjc.c(this.c.av());
        this.c.cm();
        Object obj3 = this.l;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.l;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.c.as()), dxjc.c(this.c.av()), dxjc.c(this.c.cu()));
                    dxjc.d(this.l, obj2);
                    this.l = obj2;
                }
            }
            obj3 = obj2;
        }
        bpbwVar3.aj = (bpsq) obj3;
        bpbwVar3.ak = new cpv();
    }
}
