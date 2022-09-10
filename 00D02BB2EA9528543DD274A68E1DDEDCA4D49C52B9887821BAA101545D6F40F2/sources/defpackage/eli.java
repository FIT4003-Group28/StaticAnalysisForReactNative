package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eli  reason: default package */
/* loaded from: classes6.dex */
public final class eli implements dxis {
    final /* synthetic */ ftt a;
    private volatile Object b = new dxjf();
    private volatile dzsj<wto> c;

    public eli(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bstq bstqVar = (bstq) obj;
        bstqVar.aT = this.a.gK();
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        bstqVar.aU = rU;
        dxjg.e(this.a.eW.a.tr());
        bstqVar.aV = this.a.wq();
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bstqVar.aW = tp;
        bstqVar.aY = this.a.lw();
        bstqVar.ad = this.a.gK();
        bstqVar.ae = this.a.a;
        bstqVar.af = b();
        bstqVar.ag = this.a.eW.g();
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<afha> m = fttVar.m();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new elh(this);
            this.c = dzsjVar2;
        }
        bstqVar.ah = new zgc(dzsjVar, m, dzsjVar2, this.a.y(), this.a.aV(), this.a.eW.jm());
    }

    public final wto b() {
        Object obj;
        Object obj2 = this.b;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.b;
                if (obj instanceof dxjf) {
                    Executor sU = this.a.eW.a.sU();
                    dxjg.e(sU);
                    obj = new wto(sU, dxjc.c(this.a.eW.p()), this.a.eW.mX());
                    dxjc.d(this.b, obj);
                    this.b = obj;
                }
            }
            obj2 = obj;
        }
        return (wto) obj2;
    }
}
