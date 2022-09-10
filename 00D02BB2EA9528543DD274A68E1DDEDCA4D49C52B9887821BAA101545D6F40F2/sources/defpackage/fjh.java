package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjh  reason: default package */
/* loaded from: classes6.dex */
public final class fjh implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<boyu> b;
    private volatile dzsj<dbsg<cfll>> d;
    private volatile dzsj<bozp> e;
    private volatile dzsj f;
    private volatile dzsj<boyb> g;
    private volatile burh i;
    private volatile Object c = new dxjf();
    private volatile Object h = new dxjf();

    public fjh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        boys boysVar = (boys) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        boysVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        boysVar.aI = tr;
        boysVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        boysVar.aK = sU;
        boysVar.aL = new cpv();
        boysVar.aM = dxjc.c(this.a.eW.ie());
        boysVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fjg(this, 0);
            this.b = dzsjVar;
        }
        boysVar.ag = new bpah(dzsjVar, this.a.uS());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        boysVar.ah = rD;
        boysVar.ai = dxjc.c(this.a.as());
        boysVar.aj = this.a.wl();
        boysVar.ak = this.a.wq();
        boysVar.al = new boze(this.a.eW.fr(), this.a.eW.il());
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fjg(this, 1);
            this.d = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.e;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fjg(this, 2);
            this.e = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.f;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fjg(this, 3);
            this.f = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.g;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fjg(this, 4);
            this.g = dzsjVar8;
        }
        boysVar.am = new bozk(il, dzsjVar3, dzsjVar5, dzsjVar7, dzsjVar8, this.a.eW.fr());
        boysVar.an = new boza(this.a.je(), this.a.jg(), this.a.pl(), this.a.eW.il(), this.a.eW.fr());
        Object obj3 = this.h;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.h;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.a.as()), dxjc.c(this.a.av()), dxjc.c(this.a.cu()));
                    dxjc.d(this.h, obj2);
                    this.h = obj2;
                }
            }
            obj3 = obj2;
        }
        boysVar.ao = (bpsq) obj3;
        boysVar.ap = this.a.lt();
        boysVar.aq = b();
        boysVar.ar = this.a.wd();
        boysVar.as = this.a.aq();
        boysVar.at = new ioj(this.a.ad(), this.a.as(), this.a.cy(), this.a.eW.V(), this.a.eW.bu(), this.a.eW.kb(), this.a.eW.o(), this.a.eW.jv(), this.a.eW.n(), this.a.eW.al());
        boysVar.au = new inj(new cqhn(), new cqhu(), new jmz());
        boysVar.av = this.a.bM();
        boysVar.aw = new bpte(this.a.as());
        boysVar.ax = new inq(this.a.as(), this.a.eW.al());
        Context b = this.a.eW.a.b();
        dxjg.e(b);
        boysVar.ay = bomr.b(b);
        boysVar.az = this.a.eW.sr();
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        boysVar.aA = tr2;
    }

    public final dbsg<cfll> b() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.c;
                if (obj instanceof dxjf) {
                    Executor sU = this.a.eW.a.sU();
                    dxjg.e(sU);
                    burh burhVar = this.i;
                    if (burhVar == null) {
                        dxio c = dxjc.c(this.a.eW.h());
                        bvrb tn = this.a.eW.a.tn();
                        dxjg.e(tn);
                        burhVar = burj.b(buri.b(c, tn));
                        this.i = burhVar;
                    }
                    btvo rp = this.a.eW.a.rp();
                    dxjg.e(rp);
                    cflo cfloVar = new cflo(sU, burhVar, rp, new cflq());
                    btvo rp2 = this.a.eW.a.rp();
                    dxjg.e(rp2);
                    obj = cflr.b(cfloVar, rp2);
                    dxjc.d(this.c, obj);
                    this.c = obj;
                }
            }
            obj2 = obj;
        }
        return (dbsg) obj2;
    }
}
