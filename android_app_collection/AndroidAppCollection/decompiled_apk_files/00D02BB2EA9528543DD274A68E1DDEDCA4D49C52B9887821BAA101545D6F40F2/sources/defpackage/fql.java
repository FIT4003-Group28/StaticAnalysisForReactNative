package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fql  reason: default package */
/* loaded from: classes6.dex */
public final class fql implements dxis {
    public volatile dzsj<gun> a;
    public volatile dzsj<qsg> b;
    public volatile dzsj<sox> c;
    final /* synthetic */ ftt d;
    private volatile Object e = new dxjf();
    private volatile dzsj<sos> f;
    private volatile dzsj<soy> g;

    public fql(ftt fttVar) {
        this.d = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        sis sisVar = (sis) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        sisVar.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        sisVar.aI = tr;
        sisVar.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        sisVar.aK = sU;
        sisVar.aL = new cpv();
        sisVar.aM = dxjc.c(this.d.eW.ie());
        sisVar.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        sisVar.a = this.d.wl();
        sisVar.b = this.d.wq();
        sisVar.c = dxjc.c(this.d.cV());
        ftt fttVar = this.d;
        sisVar.d = new ivt(fttVar.eV, dxjh.c(fttVar.H()), this.d.eW.ik(), this.d.aV());
        dzsj dzsjVar = this.f;
        if (dzsjVar == null) {
            dzsjVar = new fqk(this, 0);
            this.f = dzsjVar;
        }
        dxio c = dxjc.c(dzsjVar);
        dzsj dzsjVar2 = this.g;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fqk(this, 3);
            this.g = dzsjVar2;
        }
        dxio c2 = dxjc.c(dzsjVar2);
        akfa rK = this.d.eW.a.rK();
        dxjg.e(rK);
        sisVar.e = new sow(c, c2, rK);
        sisVar.f = this.d.cJ();
        btrm rz = this.d.eW.a.rz();
        dxjg.e(rz);
        sisVar.g = rz;
        sisVar.ad = this.d.N();
        sisVar.ae = this.d.gd();
        sisVar.af = b();
        sisVar.ag = this.d.eW.cH();
        sisVar.ah = c();
        sisVar.ai = dxjc.c(this.d.fy());
        sisVar.aj = (siv) this.d.eW.nB();
        cjqy tr2 = this.d.eW.a.tr();
        dxjg.e(tr2);
        sisVar.ak = tr2;
    }

    public final qsg b() {
        Object obj;
        Object obj2 = this.e;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.e;
                if (obj instanceof dxjf) {
                    btrm rz = this.d.eW.a.rz();
                    dxjg.e(rz);
                    obj = qsi.b(rz, this.d.eW.ry());
                    dxjc.d(this.e, obj);
                    this.e = obj;
                }
            }
            obj2 = obj;
        }
        return (qsg) obj2;
    }

    public final six c() {
        return new six(dxjc.c(this.d.eW.im()), this.d.wk(), dxjc.c(this.d.tx()));
    }
}
