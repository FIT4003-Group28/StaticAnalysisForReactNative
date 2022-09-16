package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fjx  reason: default package */
/* loaded from: classes6.dex */
final class fjx implements dxis {
    final /* synthetic */ ftt a;
    private volatile Object b = new dxjf();

    public fjx(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bphi bphiVar = (bphi) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bphiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bphiVar.aI = tr;
        bphiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bphiVar.aK = sU;
        bphiVar.aL = new cpv();
        bphiVar.aM = dxjc.c(this.a.eW.ie());
        bphiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bphiVar.b = this.a.wl();
        bphiVar.c = this.a.wq();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bphiVar.d = rD;
        dxio c = dxjc.c(this.a.as());
        dxio c2 = dxjc.c(this.a.cy());
        ftt fttVar = this.a;
        ((bpdz) bphiVar).e = new bpvc(c, c2, fttVar.a, dxjc.c(fttVar.av()));
        Object obj3 = this.b;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.b;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.a.as()), dxjc.c(this.a.av()), dxjc.c(this.a.cu()));
                    dxjc.d(this.b, obj2);
                    this.b = obj2;
                }
            }
            obj3 = obj2;
        }
        bphiVar.f = (bpsq) obj3;
        boxa cm = this.a.cm();
        acwo eg = this.a.eg();
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        bphiVar.g = new bptg(cm, eg, tn);
        bphiVar.ad = this.a.fQ();
        bphiVar.ae = this.a.fR();
        bphiVar.am = new bpho(this.a.eW.il(), this.a.eV);
        dxjg.e(this.a.eW.a.rp());
    }
}
