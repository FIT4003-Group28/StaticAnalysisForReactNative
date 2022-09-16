package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: exv  reason: default package */
/* loaded from: classes6.dex */
public final class exv implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<ahzd> b;
    private volatile dzsj<ahzh> c;

    public exv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ahwv ahwvVar = (ahwv) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ahwvVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ahwvVar.aI = tr;
        ahwvVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ahwvVar.aK = sU;
        ahwvVar.aL = new cpv();
        ahwvVar.aM = dxjc.c(this.a.eW.ie());
        ahwvVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ahwvVar.c = this.a.wq();
        ahwvVar.d = this.a.wl();
        dzsj<gga> ad = this.a.ad();
        ftt fttVar = this.a;
        dzsj dzsjVar = fttVar.cL;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar, 1310);
            fttVar.cL = dzsjVar;
        }
        fyu fyuVar = this.a.eW;
        dzsj dzsjVar2 = fyuVar.dB;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fxy(fyuVar, 680);
            fyuVar.dB = dzsjVar2;
        }
        dzsj<akdv> P = this.a.P();
        dzsj<akfa> p = this.a.eW.p();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<cqhu> eS = this.a.eS();
        dzsj<Executor> o = this.a.eW.o();
        dzsj<Executor> di = this.a.eW.di();
        dzsj<ajmq> hu = this.a.eW.hu();
        dzsj dzsjVar3 = this.b;
        if (dzsjVar3 == null) {
            dzsjVar3 = new exu(this, 0);
            this.b = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.c;
        if (dzsjVar5 == null) {
            dzsjVar5 = new exu(this, 1);
            this.c = dzsjVar5;
        }
        ahwvVar.e = new ahxy(ad, dzsjVar, dzsjVar2, P, p, il, eS, o, di, hu, dzsjVar4, dzsjVar5, this.a.eW.bk(), this.a.eW.ht());
    }

    public final ahzi b() {
        return new ahzi(this.a.eW.hz(), this.a.eW.hw());
    }
}
