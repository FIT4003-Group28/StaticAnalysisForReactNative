package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: exj  reason: default package */
/* loaded from: classes6.dex */
public final class exj implements dxis {
    public volatile dzsj<bbzd> a;
    public volatile dzsj<bbzi> b;
    final /* synthetic */ ftt c;
    private volatile dzsj<bbwo> d;
    private volatile dzsj e;

    public exj(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bbwq bbwqVar = (bbwq) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        bbwqVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        bbwqVar.aI = tr;
        bbwqVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        bbwqVar.aK = sU;
        bbwqVar.aL = new cpv();
        bbwqVar.aM = dxjc.c(this.c.eW.ie());
        bbwqVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        bbwqVar.a = this.c.eW.aH();
        bbwqVar.b = this.c.wq();
        bbwqVar.c = this.c.wl();
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        bbwqVar.d = rD;
        bvjj rB = this.c.eW.a.rB();
        dxjg.e(rB);
        bbwqVar.e = rB;
        dzsj<cqat> K = this.c.eW.K();
        dzsj<cqhn> il = this.c.eW.il();
        dzsj<cqhu> eS = this.c.eS();
        dzsj<gga> ad = this.c.ad();
        dzsj<bbut> bf = this.c.bf();
        dzsj c = dxjh.c(this.c.m());
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new exi(this, 0);
            this.d = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<bbpv> ba = this.c.eW.ba();
        dzsj<bvrb> R = this.c.eW.R();
        dzsj dzsjVar3 = this.e;
        if (dzsjVar3 == null) {
            dzsjVar3 = new exi(this, 3);
            this.e = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        ftt fttVar = this.c;
        dzsj dzsjVar5 = fttVar.cZ;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fns(fttVar, 1338);
            fttVar.cZ = dzsjVar5;
        }
        bbwqVar.f = new bbyz(K, il, eS, ad, bf, c, dzsjVar2, ba, R, dzsjVar4, dzsjVar5, this.c.eW.pa(), this.c.ut(), dxjh.c(this.c.eW.iW()), this.c.jn(), this.c.eW.aI(), this.c.T());
        bbwqVar.g = this.c.us();
        bbwqVar.ad = dxjc.c(this.c.eW.iW());
        this.c.B();
        bbwqVar.ae = this.c.dc();
        bbwqVar.af = dxjc.c(this.c.eW.hN());
        bbwqVar.ag = dxjc.c(this.c.eW.im());
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        bbwqVar.ah = rp;
    }
}
