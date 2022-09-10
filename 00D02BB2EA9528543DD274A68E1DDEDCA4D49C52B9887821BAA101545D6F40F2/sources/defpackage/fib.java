package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fib  reason: default package */
/* loaded from: classes6.dex */
public final class fib implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<zzn> b;
    private volatile Object c = new dxjf();

    public fib(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpyx bpyxVar = (bpyx) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bpyxVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bpyxVar.aI = tr;
        bpyxVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bpyxVar.aK = sU;
        bpyxVar.aL = new cpv();
        bpyxVar.aM = dxjc.c(this.a.eW.ie());
        bpyxVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        dzsj<rb> dzsjVar = this.a.eV;
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fia(this);
            this.b = dzsjVar2;
        }
        bpyxVar.a = new bpzk(dzsjVar, dzsjVar2, this.a.eW.il(), this.a.eW.R(), this.a.lf(), this.a.eW.dd(), this.a.cu());
        bpyxVar.b = this.a.wl();
        bpyxVar.c = this.a.wq();
        Object obj3 = this.c;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.c;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.a.as()), dxjc.c(this.a.av()), dxjc.c(this.a.cu()));
                    dxjc.d(this.c, obj2);
                    this.c = obj2;
                }
            }
            obj3 = obj2;
        }
        bpyxVar.d = (bpsq) obj3;
        ftt fttVar = this.a;
        bpyxVar.e = new bnyd(fttVar.eV, fttVar.y(), this.a.fO());
        bpyxVar.f = dxjc.c(this.a.as());
        bpyxVar.g = this.a.au();
        bpyxVar.ad = this.a.bC();
        bpyxVar.ae = bqah.b(dxjh.c(this.a.as()), this.a.fM(), this.a.eW.K(), this.a.eW.R());
        bpyxVar.af = new cpv();
        bpyxVar.ag = new bpzb(this.a.as(), this.a.uT(), this.a.dz(), this.a.av());
    }
}
