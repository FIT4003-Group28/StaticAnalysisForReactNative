package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ezw  reason: default package */
/* loaded from: classes6.dex */
public final class ezw implements dxis {
    public volatile dzsj<shu> a;
    public volatile dzsj<qsm> b;
    public volatile dzsj<sdz> c;
    final /* synthetic */ ftt d;
    private volatile dzsj<sec> e;
    private volatile dzsj<see> f;
    private volatile dzsj<seg> g;
    private volatile dzsj<sgm> h;
    private volatile dzsj<sgt> i;
    private volatile dzsj<rzv> j;
    private volatile dzsj<sdc> k;
    private volatile dzsj<she> l;
    private volatile dzsj<rzs> m;
    private volatile dzsj<scr> n;

    public ezw(ftt fttVar) {
        this.d = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rnx rnxVar;
        rnx rnxVar2 = (rnx) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        rnxVar2.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        rnxVar2.aI = tr;
        rnxVar2.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        rnxVar2.aK = sU;
        rnxVar2.aL = new cpv();
        rnxVar2.aM = dxjc.c(this.d.eW.ie());
        rnxVar2.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        rnxVar2.b = this.d.wq();
        rnxVar2.c = this.d.wl();
        dzsj<Application> m = this.d.eW.m();
        dzsj<cqhn> il = this.d.eW.il();
        dzsj<sfd> vx = this.d.vx();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new ezv(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ezv(this, 1);
            this.f = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new ezv(this, 2);
            this.g = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.h;
        if (dzsjVar7 == null) {
            dzsjVar7 = new ezv(this, 3);
            this.h = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj<sic> nt = this.d.eW.nt();
        dzsj<ros> hP = this.d.hP();
        dzsj<ahjq> k = this.d.eW.k();
        dzsj dzsjVar9 = this.i;
        if (dzsjVar9 == null) {
            dzsjVar9 = new ezv(this, 7);
            this.i = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.j;
        if (dzsjVar11 == null) {
            dzsjVar11 = new ezv(this, 8);
            this.j = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj<Executor> di = this.d.eW.di();
        dzsj dzsjVar13 = this.k;
        if (dzsjVar13 == null) {
            rnxVar = rnxVar2;
            dzsjVar13 = new ezv(this, 9);
            this.k = dzsjVar13;
        } else {
            rnxVar = rnxVar2;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.l;
        if (dzsjVar15 == null) {
            dzsjVar15 = new ezv(this, 10);
            this.l = dzsjVar15;
        }
        dzsj dzsjVar16 = dzsjVar15;
        dzsj dzsjVar17 = this.m;
        if (dzsjVar17 == null) {
            dzsjVar17 = new ezv(this, 11);
            this.m = dzsjVar17;
        }
        dzsj dzsjVar18 = dzsjVar17;
        dzsj dzsjVar19 = this.n;
        if (dzsjVar19 == null) {
            dzsjVar19 = new ezv(this, 12);
            this.n = dzsjVar19;
        }
        rnxVar.a = new sdt(m, il, vx, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar8, nt, hP, k, dzsjVar10, dzsjVar12, di, dzsjVar14, dzsjVar16, dzsjVar18, dzsjVar19, this.d.eW.V());
    }

    public final rzv b() {
        ftt fttVar = this.d;
        buwa buwaVar = fttVar.fk;
        if (buwaVar == null) {
            dxio c = dxjc.c(fttVar.eW.h());
            bvrb tn = fttVar.eW.a.tn();
            dxjg.e(tn);
            buwaVar = new buwa(new buvz(c, tn));
            fttVar.fk = buwaVar;
        }
        vly i = fttVar.eW.i();
        Executor sU = fttVar.eW.a.sU();
        dxjg.e(sU);
        ssd ssdVar = new ssd(buwaVar, i, sU);
        ftt fttVar2 = this.d;
        bumr bumrVar = fttVar2.fl;
        if (bumrVar == null) {
            dxio c2 = dxjc.c(fttVar2.eW.h());
            bvrb tn2 = fttVar2.eW.a.tn();
            dxjg.e(tn2);
            bumrVar = new bumr(new bumq(c2, tn2));
            fttVar2.fl = bumrVar;
        }
        vly i2 = fttVar2.eW.i();
        Executor sU2 = fttVar2.eW.a.sU();
        dxjg.e(sU2);
        return new rzv(ssdVar, new ssb(bumrVar, i2, sU2));
    }
}
