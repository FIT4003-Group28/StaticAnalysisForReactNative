package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: elt  reason: default package */
/* loaded from: classes6.dex */
public final class elt implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<sbm> b;
    private volatile dzsj<sev> c;
    private volatile dzsj<sei> d;

    public elt(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rlp rlpVar = (rlp) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        rlpVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        rlpVar.aI = tr;
        rlpVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        rlpVar.aK = sU;
        rlpVar.aL = new cpv();
        rlpVar.aM = dxjc.c(this.a.eW.ie());
        rlpVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        rlpVar.b = this.a.wq();
        rlpVar.c = this.a.wl();
        dzsj<Application> m = this.a.eW.m();
        dzsj<sfd> vx = this.a.vx();
        dzsj<qjk> hK = this.a.eW.hK();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new els(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new els(this, 1);
            this.c = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.d;
        if (dzsjVar5 == null) {
            dzsjVar5 = new els(this, 2);
            this.d = dzsjVar5;
        }
        rlpVar.a = new sbo(m, vx, hK, il, dzsjVar2, dzsjVar4, dzsjVar5, this.a.eW.kb(), this.a.eW.bk());
    }
}
