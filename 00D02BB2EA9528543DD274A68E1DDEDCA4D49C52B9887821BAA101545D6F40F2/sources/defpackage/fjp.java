package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjp  reason: default package */
/* loaded from: classes6.dex */
public final class fjp implements dxis {
    public volatile dzsj<buny> a;
    final /* synthetic */ ftt b;
    public volatile buny c;
    private volatile Object d = new dxjf();
    private volatile dzsj<bptg> e;
    private volatile dzsj<bnyd> f;
    private volatile dzsj<booa> g;
    private volatile dzsj<bpsd> h;

    public fjp(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpfw bpfwVar = (bpfw) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bpfwVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bpfwVar.aI = tr;
        bpfwVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bpfwVar.aK = sU;
        bpfwVar.aL = new cpv();
        bpfwVar.aM = dxjc.c(this.b.eW.ie());
        bpfwVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bpfwVar.b = this.b.wl();
        bpfwVar.c = this.b.wq();
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bpfwVar.d = rD;
        dxio c = dxjc.c(this.b.as());
        dxio c2 = dxjc.c(this.b.cy());
        ftt fttVar = this.b;
        ((bpdz) bpfwVar).e = new bpvc(c, c2, fttVar.a, dxjc.c(fttVar.av()));
        Object obj3 = this.d;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.d;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.b.as()), dxjc.c(this.b.av()), dxjc.c(this.b.cu()));
                    dxjc.d(this.d, obj2);
                    this.d = obj2;
                }
            }
            obj3 = obj2;
        }
        bpfwVar.f = (bpsq) obj3;
        bpfwVar.g = b();
        bpfwVar.ad = this.b.fQ();
        bpfwVar.ae = this.b.fR();
        dzsj<gga> ad = this.b.ad();
        dzsj<jmx> fO = this.b.fO();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new fjo(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<bpsw> uR = this.b.uR();
        dzsj<bpto> uQ = this.b.uQ();
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fjo(this, 1);
            this.f = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fjo(this, 2);
            this.g = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj<cqhn> il = this.b.eW.il();
        dzsj dzsjVar7 = this.h;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fjo(this, 3);
            this.h = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj<Executor> di = this.b.eW.di();
        ftt fttVar2 = this.b;
        dzsj dzsjVar9 = fttVar2.dC;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fns(fttVar2, 1375);
            fttVar2.dC = dzsjVar9;
        }
        bpfwVar.am = new bpgg(ad, fO, dzsjVar2, uR, uQ, dzsjVar4, dzsjVar6, il, dzsjVar8, di, dzsjVar9, this.b.eW.er(), this.b.fN());
        bpfwVar.an = this.b.cm();
    }

    public final bptg b() {
        boxa cm = this.b.cm();
        acwo eg = this.b.eg();
        bvrb tn = this.b.eW.a.tn();
        dxjg.e(tn);
        return new bptg(cm, eg, tn);
    }
}
