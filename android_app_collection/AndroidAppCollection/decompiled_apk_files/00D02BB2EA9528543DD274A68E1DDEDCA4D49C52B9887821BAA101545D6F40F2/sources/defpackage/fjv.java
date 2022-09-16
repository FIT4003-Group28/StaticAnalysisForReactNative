package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjv  reason: default package */
/* loaded from: classes6.dex */
public final class fjv implements dxis {
    final /* synthetic */ ftt a;
    private volatile Object b = new dxjf();
    private volatile dzsj<booa> c;
    private volatile dzsj<bnyd> d;

    public fjv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpha bphaVar = (bpha) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bphaVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bphaVar.aI = tr;
        bphaVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bphaVar.aK = sU;
        bphaVar.aL = new cpv();
        bphaVar.aM = dxjc.c(this.a.eW.ie());
        bphaVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bphaVar.b = this.a.wl();
        bphaVar.c = this.a.wq();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bphaVar.d = rD;
        dxio c = dxjc.c(this.a.as());
        dxio c2 = dxjc.c(this.a.cy());
        ftt fttVar = this.a;
        ((bpdz) bphaVar).e = new bpvc(c, c2, fttVar.a, dxjc.c(fttVar.av()));
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
        bphaVar.f = (bpsq) obj3;
        boxa cm = this.a.cm();
        acwo eg = this.a.eg();
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        bphaVar.g = new bptg(cm, eg, tn);
        bphaVar.ad = this.a.fQ();
        bphaVar.ae = this.a.fR();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fju(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fju(this, 1);
            this.d = dzsjVar2;
        }
        ftt fttVar2 = this.a;
        bphaVar.an = new bphf(dzsjVar, dzsjVar2, fttVar2.eV, fttVar2.eW.il());
        dxjg.e(this.a.eW.a.rp());
    }
}
