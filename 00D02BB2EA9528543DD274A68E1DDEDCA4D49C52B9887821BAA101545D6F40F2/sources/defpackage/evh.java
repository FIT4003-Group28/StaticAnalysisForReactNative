package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: evh  reason: default package */
/* loaded from: classes6.dex */
final class evh implements dxis {
    final /* synthetic */ ftt a;

    public evh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bnmi bnmiVar = (bnmi) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bnmiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bnmiVar.aI = tr;
        bnmiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bnmiVar.aK = sU;
        bnmiVar.aL = new cpv();
        bnmiVar.aM = dxjc.c(this.a.eW.ie());
        bnmiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ftt fttVar = this.a;
        bnmiVar.a = fttVar.a;
        bnmiVar.b = fttVar.wl();
        bnmiVar.c = this.a.wq();
        bnmiVar.d = new cjxo(this.a.a);
        cztz m = this.a.eW.a.m();
        dxjg.e(m);
        bnmiVar.e = m;
        ftt fttVar2 = this.a;
        Object obj3 = fttVar2.eF;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fttVar2.eF;
                if (obj2 instanceof dxjf) {
                    obj2 = new bnoh();
                    dxjc.d(fttVar2.eF, obj2);
                    fttVar2.eF = obj2;
                }
            }
            obj3 = obj2;
        }
        bnmiVar.f = (bnoh) obj3;
        bnmiVar.g = dxjc.c(this.a.m());
    }
}
