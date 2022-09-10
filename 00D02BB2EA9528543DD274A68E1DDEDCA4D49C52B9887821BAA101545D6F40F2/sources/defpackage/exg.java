package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: exg  reason: default package */
/* loaded from: classes6.dex */
public final class exg implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<caxe> b;
    private volatile dzsj<axze> c;

    public exg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        azcw azcwVar = (azcw) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        azcwVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        azcwVar.aI = tr;
        azcwVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        azcwVar.aK = sU;
        azcwVar.aL = new cpv();
        azcwVar.aM = dxjc.c(this.a.eW.ie());
        azcwVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        azcwVar.b = this.a.wk();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        azcwVar.c = rD;
        azcwVar.d = this.a.wq();
        azcwVar.e = this.a.wl();
        dzsj<gga> ad = this.a.ad();
        dzsj<bvrb> R = this.a.eW.R();
        dzsj c = dxjh.c(this.a.y());
        dzsj<cztz> dd = this.a.eW.dd();
        dzsj c2 = dxjh.c(this.a.eW.el());
        dzsj<ayay> uq = this.a.uq();
        dzsj<axsa> oL = this.a.eW.oL();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new exf(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<aydz> up = this.a.up();
        dzsj<axyz> oQ = this.a.eW.oQ();
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new exf(this, 1);
            this.c = dzsjVar3;
        }
        azcwVar.f = new azeu(ad, R, c, dd, c2, uq, oL, il, dzsjVar2, up, oQ, dzsjVar3, dxjh.c(this.a.fh()));
    }
}
