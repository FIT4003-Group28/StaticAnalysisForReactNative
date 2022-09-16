package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fht  reason: default package */
/* loaded from: classes6.dex */
public final class fht implements dxis {
    final /* synthetic */ ftt b;
    private volatile dzsj<abbm> d;
    private volatile Object c = new dxjf();
    public volatile Object a = new dxjf();

    public fht(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpbl bpblVar = (bpbl) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bpblVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bpblVar.aI = tr;
        bpblVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bpblVar.aK = sU;
        bpblVar.aL = new cpv();
        bpblVar.aM = dxjc.c(this.b.eW.ie());
        bpblVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bpblVar.a = rD;
        bpblVar.b = this.b.wq();
        bpblVar.c = new ggr(this.b.wl());
        Executor sU2 = this.b.eW.a.sU();
        dxjg.e(sU2);
        bpblVar.d = sU2;
        ((ggo) bpblVar).e = dxjc.c(this.b.cy());
        cjqy tr2 = this.b.eW.a.tr();
        dxjg.e(tr2);
        bpblVar.f = tr2;
        bpblVar.g = this.b.eW.sr();
        bpblVar.ad = dxjc.c(this.b.as());
        bpblVar.ae = new cpv();
        bpblVar.af = this.b.cU();
        ((bnyu) bpblVar).al = this.b.aq();
        Object obj3 = this.c;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.c;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.b.as()), dxjc.c(this.b.av()), dxjc.c(this.b.cu()));
                    dxjc.d(this.c, obj2);
                    this.c = obj2;
                }
            }
            obj3 = obj2;
        }
        bpblVar.am = (bpsq) obj3;
        bpblVar.an = dxjc.c(this.b.av());
        bpblVar.ao = bona.b(dxjh.c(this.b.av()), dxjh.c(this.b.as()));
        btrm rz = this.b.eW.a.rz();
        dxjg.e(rz);
        bpblVar.as = rz;
        bpblVar.at = this.b.cm();
        bpblVar.au = dxjc.c(this.b.cS());
        bpblVar.av = this.b.aq();
        bpblVar.aw = new bpte(this.b.as());
        bpblVar.ax = new ioj(this.b.ad(), this.b.as(), this.b.cy(), this.b.eW.V(), this.b.eW.bu(), this.b.eW.kb(), this.b.eW.o(), this.b.eW.jv(), this.b.eW.n(), this.b.eW.al());
        bpblVar.ay = new inq(this.b.as(), this.b.eW.al());
        bpblVar.az = new iop(new jmz());
        bpblVar.aA = new boxq(this.b.pl(), this.b.eW.il(), this.b.eW.fr());
        bpblVar.aB = this.b.bM();
        bpblVar.aC = this.b.wl();
        bpblVar.aO = this.b.fq();
        bwqv rD2 = this.b.eW.a.rD();
        dxjg.e(rD2);
        bpblVar.aP = rD2;
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new fhs(this);
            this.d = dzsjVar;
        }
        bpblVar.aQ = dxjc.c(dzsjVar);
        Context b = this.b.eW.a.b();
        dxjg.e(b);
        bpblVar.aR = bomr.b(b);
    }
}
