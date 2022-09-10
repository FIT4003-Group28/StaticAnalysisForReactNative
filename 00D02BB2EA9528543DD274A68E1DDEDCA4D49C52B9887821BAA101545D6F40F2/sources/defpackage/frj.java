package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: frj  reason: default package */
/* loaded from: classes6.dex */
public final class frj implements dxis {
    public volatile dzsj<cgaf> a;
    public volatile dzsj<cfsc> b;
    public volatile dzsj c;
    public volatile dzsj<cfum> d;
    public volatile dzsj<cfse> e;
    public volatile dzsj<cftf> f;
    public volatile dzsj<cfue> g;
    final /* synthetic */ ftt h;
    private volatile dzsj<cgbl> i;
    private volatile dzsj<cftd> j;
    private volatile dzsj<cfyp> k;
    private volatile dzsj<cfzb> l;
    private volatile dzsj<cfso> m;
    private volatile dzsj<cfvt> n;
    private volatile dzsj<cfth> o;
    private volatile dzsj<bzrc> p;
    private volatile dzsj<cfxj> q;

    public frj(ftt fttVar) {
        this.h = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cfqo cfqoVar;
        cfqo cfqoVar2 = (cfqo) obj;
        cjqq tp = this.h.eW.a.tp();
        dxjg.e(tp);
        cfqoVar2.aH = tp;
        cjqy tr = this.h.eW.a.tr();
        dxjg.e(tr);
        cfqoVar2.aI = tr;
        cfqoVar2.aJ = dbsg.i(this.h.ap());
        Executor sU = this.h.eW.a.sU();
        dxjg.e(sU);
        cfqoVar2.aK = sU;
        cfqoVar2.aL = new cpv();
        cfqoVar2.aM = dxjc.c(this.h.eW.ie());
        cfqoVar2.aN = dxjc.c(this.h.eW.iU());
        dxjc.c(this.h.lx());
        cfqoVar2.b = this.h.wl();
        dzsj<cqhn> il = this.h.eW.il();
        dzsj dzsjVar = this.i;
        if (dzsjVar == null) {
            dzsjVar = new fri(this, 0);
            this.i = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.k;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fri(this, 1);
            this.k = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.l;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fri(this, 4);
            this.l = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.m;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fri(this, 5);
            this.m = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj dzsjVar9 = this.n;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fri(this, 12);
            this.n = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj<cftd> b = b();
        dzsj dzsjVar11 = this.o;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fri(this, 13);
            this.o = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj dzsjVar13 = this.p;
        if (dzsjVar13 == null) {
            dzsjVar13 = new fri(this, 14);
            this.p = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.q;
        if (dzsjVar15 == null) {
            dzsjVar15 = new fri(this, 15);
            this.q = dzsjVar15;
        }
        dzsj dzsjVar16 = dzsjVar15;
        dzsj<acyp> ik = this.h.eW.ik();
        dzsj<btvo> V = this.h.eW.V();
        dzsj<cgcv> vu = this.h.vu();
        ftt fttVar = this.h;
        dzsj dzsjVar17 = fttVar.eB;
        if (dzsjVar17 == null) {
            cfqoVar = cfqoVar2;
            dzsjVar17 = new fns(fttVar, 1435);
            fttVar.eB = dzsjVar17;
        } else {
            cfqoVar = cfqoVar2;
        }
        cfqo cfqoVar3 = cfqoVar;
        cfqoVar3.c = new cfrc(il, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar8, dzsjVar10, b, dzsjVar12, dzsjVar14, dzsjVar16, ik, V, vu, dzsjVar17);
        cfqoVar3.d = this.h.N();
        cfqoVar3.e = this.h.wq();
        cfqoVar3.f = this.h.vo();
        btpc sz = this.h.eW.a.sz();
        dxjg.e(sz);
        cfqoVar3.g = sz;
        cfqoVar3.ad = this.h.eW.bW();
        cfqoVar3.ae = this.h.vm();
        cfqoVar3.af = this.h.eW.io();
        cfqoVar3.ag = dxjc.c(this.h.ge());
        cfqoVar3.ah = dxjc.c(this.h.eW.p());
        cfqoVar3.ai = this.h.vk();
        cfqoVar3.aj = this.h.vl();
        cfqoVar3.ak = this.h.vn();
        cfqoVar3.al = dxjc.c(this.h.fy());
        dehq tf = this.h.eW.a.tf();
        dxjg.e(tf);
        cfqoVar3.am = tf;
    }

    public final dzsj<cftd> b() {
        dzsj<cftd> dzsjVar = this.j;
        if (dzsjVar == null) {
            fri friVar = new fri(this, 3);
            this.j = friVar;
            return friVar;
        }
        return dzsjVar;
    }
}
