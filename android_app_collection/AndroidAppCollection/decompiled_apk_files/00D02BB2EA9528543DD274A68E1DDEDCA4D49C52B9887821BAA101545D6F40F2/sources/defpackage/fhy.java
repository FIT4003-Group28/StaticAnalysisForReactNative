package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fhy  reason: default package */
/* loaded from: classes6.dex */
public final class fhy implements dxis {
    final /* synthetic */ ftt a;
    private final bpyt b;
    private volatile dzsj<bpyh> c;
    private volatile dzsj<bnyd> d;
    private volatile dzsj<booa> e;
    private volatile Object f = new dxjf();

    public fhy(ftt fttVar, bpyt bpytVar) {
        this.a = fttVar;
        this.b = bpytVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpyt bpytVar = (bpyt) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bpytVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bpytVar.aI = tr;
        bpytVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bpytVar.aK = sU;
        bpytVar.aL = new cpv();
        bpytVar.aM = dxjc.c(this.a.eW.ie());
        bpytVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        dzsj<boxa> cn = this.a.cn();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fhx(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fhx(this, 1);
            this.d = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar5 = fttVar.eV;
        dzsj<jmx> fO = fttVar.fO();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<efh> fN = this.a.fN();
        dzsj<bpto> uQ = this.a.uQ();
        dzsj<acwo> fy = this.a.fy();
        dzsj<bvrb> R = this.a.eW.R();
        dzsj dzsjVar6 = this.e;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fhx(this, 2);
            this.e = dzsjVar6;
        }
        bpytVar.a = new bpzy(cn, dzsjVar2, dzsjVar4, dzsjVar5, fO, il, fN, uQ, fy, R, dzsjVar6);
        bpytVar.b = this.a.bh();
        cztz m = this.a.eW.a.m();
        dxjg.e(m);
        btpc sz = this.a.eW.a.sz();
        dxjg.e(sz);
        bpytVar.c = new bnyj(m, sz);
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        bpytVar.d = tn;
        bpytVar.e = this.a.ap();
        bpytVar.f = this.a.bB();
        bpytVar.g = this.a.wl();
        bpytVar.ad = this.a.wq();
        bpytVar.ae = new bomt(this.b);
        Object obj3 = this.f;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.f;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.a.as()), dxjc.c(this.a.av()), dxjc.c(this.a.cu()));
                    dxjc.d(this.f, obj2);
                    this.f = obj2;
                }
            }
            obj3 = obj2;
        }
        bpytVar.af = (bpsq) obj3;
        bpytVar.ag = new cpv();
        bpytVar.ah = new bpzb(this.a.as(), this.a.uT(), this.a.dz(), this.a.av());
        bpytVar.ai = this.a.au();
    }
}
