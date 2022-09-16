package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fkh  reason: default package */
/* loaded from: classes6.dex */
public final class fkh implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<zrl> b;

    public fkh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        vzp vzpVar = (vzp) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        vzpVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        vzpVar.aI = tr;
        vzpVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        vzpVar.aK = sU;
        vzpVar.aL = new cpv();
        vzpVar.aM = dxjc.c(this.a.eW.ie());
        vzpVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        vzpVar.b = dxjc.c(this.a.cD());
        ftt fttVar = this.a;
        vzpVar.c = new vzv(fttVar.eV, fttVar.as(), dxjh.c(this.a.av()), this.a.dz(), dxjh.c(this.a.H()), this.a.dF());
        ftt fttVar2 = this.a;
        dzsj<rb> dzsjVar = fttVar2.eV;
        dzsj<bvsl> kf = fttVar2.eW.kf();
        dzsj<vsf> jm = this.a.eW.jm();
        dzsj<afwr> cu = this.a.cu();
        dzsj<cjqy> al = this.a.eW.al();
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fkg(this);
            this.b = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        fyu fyuVar = this.a.eW;
        dzsj dzsjVar4 = fyuVar.aF;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fxy(fyuVar, 253);
            fyuVar.aF = dzsjVar4;
        }
        vzpVar.d = new zne(dzsjVar, kf, jm, cu, al, dzsjVar3, dzsjVar4, this.a.eW.fy(), this.a.eW.V(), this.a.eW.ie(), this.a.jW());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        vzpVar.e = rD;
        vzpVar.f = this.a.wl();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        vzpVar.g = rp;
        dxjg.e(this.a.eW.a.tr());
        dxjg.e(this.a.eW.a.tp());
        vzpVar.ad = this.a.wq();
        vzpVar.ae = this.a.eW.sA();
        vzpVar.af = this.a.ap();
        vzpVar.ag = dxjc.c(this.a.av());
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        vzpVar.ah = rz;
        vzpVar.ai = new cpv();
    }
}
