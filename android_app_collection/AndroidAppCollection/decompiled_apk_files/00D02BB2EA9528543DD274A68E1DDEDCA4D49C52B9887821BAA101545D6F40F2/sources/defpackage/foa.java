package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: foa  reason: default package */
/* loaded from: classes6.dex */
public final class foa implements dxis {
    public volatile bvff a;
    final /* synthetic */ ftt b;
    private volatile dzsj<bjph> c;
    private volatile dzsj<bjnh> d;
    private volatile dzsj<bjnr> e;
    private volatile dzsj<bjoq> f;
    private volatile dzsj<bvff> g;
    private volatile dzsj<bjlm> h;

    public foa(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bjlg bjlgVar = (bjlg) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bjlgVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bjlgVar.aI = tr;
        bjlgVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bjlgVar.aK = sU;
        bjlgVar.aL = new cpv();
        bjlgVar.aM = dxjc.c(this.b.eW.ie());
        bjlgVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bjlgVar.a = this.b.wq();
        bjlgVar.b = this.b.wl();
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bjlgVar.c = rD;
        this.b.wk();
        akfa rK = this.b.eW.a.rK();
        dxjg.e(rK);
        bjlgVar.d = rK;
        Executor sU2 = this.b.eW.a.sU();
        dxjg.e(sU2);
        bjlgVar.e = sU2;
        dzsj<gga> ad = this.b.ad();
        dzsj<Resources> fr = this.b.eW.fr();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj c = dxjh.c(this.b.eS());
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fnz(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fnz(this, 1);
            this.d = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.e;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fnz(this, 2);
            this.e = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.f;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fnz(this, 3);
            this.f = dzsjVar7;
        }
        bjlgVar.f = new bjqd(ad, fr, il, c, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar7, this.b.eW.fd(), this.b.eW.di());
        dzsj<gga> ad2 = this.b.ad();
        dzsj<btrm> n = this.b.eW.n();
        dzsj<bwqv> er = this.b.eW.er();
        dzsj<Resources> fr2 = this.b.eW.fr();
        dzsj<bveo> pQ = this.b.pQ();
        dzsj<bvfk> pY = this.b.pY();
        dzsj dzsjVar8 = this.g;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fnz(this, 4);
            this.g = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj<bvfc> qc = this.b.qc();
        dzsj<bjgi> qa = this.b.qa();
        dzsj<bjhc> pT = this.b.pT();
        dzsj dzsjVar10 = this.h;
        if (dzsjVar10 == null) {
            dzsjVar10 = new fnz(this, 5);
            this.h = dzsjVar10;
        }
        bjlgVar.g = new bjmj(ad2, n, er, fr2, pQ, pY, dzsjVar9, qc, qa, pT, dzsjVar10, dxjh.c(this.b.P()), dxjh.c(this.b.qb()), dxjh.c(this.b.m()), dxjh.c(this.b.cx()), dxjh.c(this.b.az()), dxjh.c(this.b.uu()), this.b.fP(), this.b.eW.di());
    }
}
