package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fly  reason: default package */
/* loaded from: classes6.dex */
public final class fly implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<cedh> b;

    public fly(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cedc cedcVar = (cedc) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cedcVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cedcVar.aI = tr;
        cedcVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cedcVar.aK = sU;
        cedcVar.aL = new cpv();
        cedcVar.aM = dxjc.c(this.a.eW.ie());
        cedcVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cedcVar.a = this.a.wl();
        cedcVar.b = new cqhn();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        cedcVar.c = rD;
        dzsj<cedh> dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new flx<>(this);
            this.b = dzsjVar;
        }
        cedcVar.d = dzsjVar;
        cedcVar.e = this.a.wq();
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        cedcVar.f = rz;
    }
}
