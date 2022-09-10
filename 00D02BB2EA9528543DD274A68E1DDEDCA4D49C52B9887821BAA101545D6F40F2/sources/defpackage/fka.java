package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fka  reason: default package */
/* loaded from: classes6.dex */
public final class fka implements dxis {
    final /* synthetic */ ftt a;
    private volatile Object b = new dxjf();
    private volatile dzsj<booa> c;
    private volatile dzsj<bnyd> d;

    public fka(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bphv bphvVar = (bphv) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bphvVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bphvVar.aI = tr;
        bphvVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bphvVar.aK = sU;
        bphvVar.aL = new cpv();
        bphvVar.aM = dxjc.c(this.a.eW.ie());
        bphvVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bphvVar.b = this.a.wl();
        bphvVar.c = this.a.wq();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bphvVar.d = rD;
        dxio c = dxjc.c(this.a.as());
        dxio c2 = dxjc.c(this.a.cy());
        ftt fttVar = this.a;
        ((bpdz) bphvVar).e = new bpvc(c, c2, fttVar.a, dxjc.c(fttVar.av()));
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
        bphvVar.f = (bpsq) obj3;
        boxa cm = this.a.cm();
        acwo eg = this.a.eg();
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        bphvVar.g = new bptg(cm, eg, tn);
        bphvVar.ad = this.a.fQ();
        bphvVar.ae = this.a.fR();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fjz(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fjz(this, 1);
            this.d = dzsjVar2;
        }
        bphvVar.ao = new bpia(dzsjVar, dzsjVar2, this.a.eV);
    }
}
