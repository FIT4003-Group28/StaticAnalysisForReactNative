package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fsr  reason: default package */
/* loaded from: classes6.dex */
public final class fsr implements dxis {
    public volatile dzsj<bdvd> a;
    public volatile dzsj<acbi> b;
    public volatile dzsj<accn> c;
    public volatile dzsj d;
    public volatile dzsj<bckz> e;
    public volatile dzsj<abus> f;
    final /* synthetic */ ftt g;
    public volatile abtz h;
    private final abwn i;
    private volatile dzsj<acel> j;
    private volatile dzsj<acbw> k;
    private volatile dzsj<abtz> l;
    private volatile Object m = new dxjf();

    public fsr(ftt fttVar, abwn abwnVar) {
        this.g = fttVar;
        this.i = abwnVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        abwn abwnVar = (abwn) obj;
        cjqq tp = this.g.eW.a.tp();
        dxjg.e(tp);
        abwnVar.aH = tp;
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        abwnVar.aI = tr;
        abwnVar.aJ = dbsg.i(this.g.ap());
        Executor sU = this.g.eW.a.sU();
        dxjg.e(sU);
        abwnVar.aK = sU;
        abwnVar.aL = new cpv();
        abwnVar.aM = dxjc.c(this.g.eW.ie());
        abwnVar.aN = dxjc.c(this.g.eW.iU());
        dxjc.c(this.g.lx());
        bvnx rS = this.g.eW.a.rS();
        dxjg.e(rS);
        abwnVar.a = rS;
        abwnVar.b = new cqhn();
        abwnVar.c = dxjc.c(this.g.bh());
        abwnVar.d = this.g.sv();
        abwnVar.e = this.g.wl();
        abwnVar.f = this.g.cJ();
        abwnVar.g = this.g.wq();
        abwnVar.ad = this.g.ap();
        abwnVar.ae = this.g.vF();
        abwnVar.af = this.g.ck();
        dxio c = dxjc.c(this.g.bz());
        dxio c2 = dxjc.c(this.g.bA());
        abwo cX = this.g.cX();
        cjqy tr2 = this.g.eW.a.tr();
        dxjg.e(tr2);
        cjqq tp2 = this.g.eW.a.tp();
        dxjg.e(tp2);
        abwnVar.ag = new acdv(c, c2, cX, tr2, tp2, new acdr(this.g.eW.m(), dxjh.c(this.g.bA()), this.g.eW.bu()), this.g.vF(), this.g.ap());
        dzsj<cqhn> il = this.g.eW.il();
        dzsj<abwo> cY = this.g.cY();
        dzsj<abxw> vG = this.g.vG();
        dzsj dzsjVar = this.k;
        if (dzsjVar == null) {
            dzsjVar = new fsq(this, 0);
            this.k = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<Application> m = this.g.eW.m();
        dzsj dzsjVar3 = this.l;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fsq(this, 7);
            this.l = dzsjVar3;
        }
        abwnVar.ah = new acex(il, cY, vG, dzsjVar2, m, dzsjVar3);
        Object obj3 = this.m;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.m;
                if (obj2 instanceof dxjf) {
                    ftt fttVar = this.g;
                    obj2 = new gek(fttVar.a, this.i, fttVar.cJ());
                    dxjc.d(this.m, obj2);
                    this.m = obj2;
                }
            }
            obj3 = obj2;
        }
        abwnVar.ai = (gek) obj3;
        abwnVar.aj = this.g.lz();
        cqat rR = this.g.eW.a.rR();
        dxjg.e(rR);
        btrm rz = this.g.eW.a.rz();
        dxjg.e(rz);
        ftt fttVar2 = this.g;
        dzsj dzsjVar4 = fttVar2.eH;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fns(fttVar2, 1445);
            fttVar2.eH = dzsjVar4;
        }
        dxio c3 = dxjc.c(dzsjVar4);
        dxio c4 = dxjc.c(this.g.cl());
        akox ap = this.g.ap();
        bvrb tn = this.g.eW.a.tn();
        dxjg.e(tn);
        abwnVar.ak = new abyh(rR, rz, c3, c4, ap, tn, this.g.vF());
        abwnVar.al = new aces(this.g.kI(), b());
    }

    public final dzsj<acel> b() {
        dzsj<acel> dzsjVar = this.j;
        if (dzsjVar == null) {
            fsq fsqVar = new fsq(this, 5);
            this.j = fsqVar;
            return fsqVar;
        }
        return dzsjVar;
    }
}
