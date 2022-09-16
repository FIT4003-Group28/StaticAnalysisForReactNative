package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjs  reason: default package */
/* loaded from: classes6.dex */
public final class fjs implements dxis {
    final /* synthetic */ ftt a;
    private volatile Object b = new dxjf();
    private volatile dzsj<bpgk> c;
    private volatile dzsj<booa> d;
    private volatile dzsj<bptg> e;

    public fjs(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpgm bpgmVar = (bpgm) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bpgmVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bpgmVar.aI = tr;
        bpgmVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bpgmVar.aK = sU;
        bpgmVar.aL = new cpv();
        bpgmVar.aM = dxjc.c(this.a.eW.ie());
        bpgmVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bpgmVar.b = this.a.wl();
        bpgmVar.c = this.a.wq();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bpgmVar.d = rD;
        dxio c = dxjc.c(this.a.as());
        dxio c2 = dxjc.c(this.a.cy());
        ftt fttVar = this.a;
        ((bpdz) bpgmVar).e = new bpvc(c, c2, fttVar.a, dxjc.c(fttVar.av()));
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
        bpgmVar.f = (bpsq) obj3;
        bpgmVar.g = b();
        bpgmVar.ad = this.a.fQ();
        bpgmVar.ae = this.a.fR();
        ftt fttVar2 = this.a;
        dzsj<rb> dzsjVar = fttVar2.eV;
        dzsj<jmx> fO = fttVar2.fO();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fjr(this, 0);
            this.c = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.d;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fjr(this, 1);
            this.d = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<bpto> uQ = this.a.uQ();
        dzsj dzsjVar6 = this.e;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fjr(this, 2);
            this.e = dzsjVar6;
        }
        bpgmVar.am = new bpgu(dzsjVar, dzsjVar, fO, dzsjVar3, dzsjVar5, uQ, dzsjVar6, this.a.uR(), this.a.eW.il());
        dxjg.e(this.a.eW.a.rp());
    }

    public final bptg b() {
        boxa cm = this.a.cm();
        acwo eg = this.a.eg();
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        return new bptg(cm, eg, tn);
    }
}
