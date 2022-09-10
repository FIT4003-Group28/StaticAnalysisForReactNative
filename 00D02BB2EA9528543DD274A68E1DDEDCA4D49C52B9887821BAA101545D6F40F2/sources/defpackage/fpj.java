package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fpj  reason: default package */
/* loaded from: classes6.dex */
public final class fpj implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<dbsg<afha>> b;
    private volatile dzsj<dbsg<aagc>> c;
    private volatile dzsj<dbsg<akgd>> d;
    private volatile dzsj<bynr> e;
    private volatile dzsj<bynx> f;

    public fpj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        byky bykyVar = (byky) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bykyVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bykyVar.aI = tr;
        bykyVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bykyVar.aK = sU;
        bykyVar.aL = new cpv();
        bykyVar.aM = dxjc.c(this.a.eW.ie());
        bykyVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bykyVar.f = this.a.wl();
        bykyVar.g = this.a.ap();
        bykyVar.ad = this.a.bM();
        bykyVar.ae = dxjc.c(this.a.bT());
        bykyVar.af = dxjc.c(this.a.cC());
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        bykyVar.ag = rz;
        bykyVar.ah = this.a.cc();
        bykyVar.ai = this.a.wq();
        bykyVar.aj = b();
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        bykyVar.ak = tr2;
        bykyVar.al = this.a.eW.sr();
        dzsj<rb> dzsjVar = this.a.eV;
        dzsj dzsjVar2 = this.e;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fpi(this, 3);
            this.e = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.f;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fpi(this, 4);
            this.f = dzsjVar4;
        }
        bykyVar.am = new bykf(dzsjVar, dzsjVar3, dzsjVar4, this.a.as(), dxjh.c(this.a.av()), this.a.dF(), this.a.eW.al());
    }

    public final bynr b() {
        dzsj<bvsl> kf = this.a.eW.kf();
        dzsj c = dxjh.c(this.a.cC());
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fpi(this, 0);
            this.b = dzsjVar;
        }
        dzsj c2 = dxjh.c(dzsjVar);
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fpi(this, 1);
            this.c = dzsjVar2;
        }
        dzsj c3 = dxjh.c(dzsjVar2);
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fpi(this, 2);
            this.d = dzsjVar3;
        }
        return new bynr(kf, c, c2, c3, dxjh.c(dzsjVar3), this.a.eW.al(), this.a.eW.hN(), this.a.eW.bu(), this.a.eW.po(), this.a.eW.pp(), this.a.eW.il(), this.a.eW.R(), this.a.eW.V());
    }
}
