package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fso  reason: default package */
/* loaded from: classes6.dex */
public final class fso implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bnhf> b;
    private volatile dzsj<bnhi> c;

    public fso(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bnal bnalVar = (bnal) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bnalVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bnalVar.aI = tr;
        bnalVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bnalVar.aK = sU;
        bnalVar.aL = new cpv();
        bnalVar.aM = dxjc.c(this.a.eW.ie());
        bnalVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bnalVar.a = rD;
        bnalVar.b = this.a.wl();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fsn(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fsn(this, 1);
            this.c = dzsjVar2;
        }
        dzsj<bhhf> l = this.a.l();
        ftt fttVar = this.a;
        dzsj dzsjVar3 = fttVar.dd;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fns(fttVar, 1344);
            fttVar.dd = dzsjVar3;
        }
        bnalVar.c = new bnhl(dzsjVar, dzsjVar2, l, dzsjVar3);
    }
}
