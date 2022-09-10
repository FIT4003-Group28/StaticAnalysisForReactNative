package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjm  reason: default package */
/* loaded from: classes6.dex */
public final class fjm implements dxis {
    public volatile dzsj<bped> a;
    final /* synthetic */ ftt b;
    private volatile Object c = new dxjf();
    private volatile dzsj<bpeb> d;
    private volatile dzsj<bpeg> e;
    private volatile dzsj<booa> f;
    private volatile dzsj<bnyd> g;

    public fjm(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpfk bpfkVar = (bpfk) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bpfkVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bpfkVar.aI = tr;
        bpfkVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bpfkVar.aK = sU;
        bpfkVar.aL = new cpv();
        bpfkVar.aM = dxjc.c(this.b.eW.ie());
        bpfkVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bpfkVar.b = this.b.wl();
        bpfkVar.c = this.b.wq();
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bpfkVar.d = rD;
        dxio c = dxjc.c(this.b.as());
        dxio c2 = dxjc.c(this.b.cy());
        ftt fttVar = this.b;
        ((bpdz) bpfkVar).e = new bpvc(c, c2, fttVar.a, dxjc.c(fttVar.av()));
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
        bpfkVar.f = (bpsq) obj3;
        boxa cm = this.b.cm();
        acwo eg = this.b.eg();
        bvrb tn = this.b.eW.a.tn();
        dxjg.e(tn);
        bpfkVar.g = new bptg(cm, eg, tn);
        bpfkVar.ad = this.b.fQ();
        bpfkVar.ae = this.b.fR();
        bpfkVar.ap = this.b.cm();
        bpfkVar.aq = new cqhn();
        dzsj<bpeb> b = b();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new fjl(this, 1);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fjl(this, 3);
            this.f = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj<cqhn> il = this.b.eW.il();
        dzsj<rb> dzsjVar5 = this.b.eV;
        dzsj dzsjVar6 = this.g;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fjl(this, 4);
            this.g = dzsjVar6;
        }
        bpfkVar.ar = new bpfr(b, dzsjVar2, dzsjVar4, il, dzsjVar5, dzsjVar6);
        dxjg.e(this.b.eW.a.rp());
    }

    public final dzsj<bpeb> b() {
        dzsj<bpeb> dzsjVar = this.d;
        if (dzsjVar == null) {
            fjl fjlVar = new fjl(this, 0);
            this.d = fjlVar;
            return fjlVar;
        }
        return dzsjVar;
    }
}
