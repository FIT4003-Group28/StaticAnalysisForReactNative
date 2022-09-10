package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fcb  reason: default package */
/* loaded from: classes6.dex */
public final class fcb implements dxis {
    public volatile avuk a;
    final /* synthetic */ ftt b;
    private volatile dzsj<avuk> c;
    private final dzsj<avuo> d;

    public fcb(ftt fttVar, avuo avuoVar) {
        this.b = fttVar;
        this.d = dxjd.b(avuoVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        avuo avuoVar = (avuo) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        avuoVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        avuoVar.aI = tr;
        avuoVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        avuoVar.aK = sU;
        avuoVar.aL = new cpv();
        avuoVar.aM = dxjc.c(this.b.eW.ie());
        avuoVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        avuoVar.a = this.b.wd();
        avuoVar.b = this.b.wl();
        avuoVar.c = dxjc.c(this.b.av());
        avuoVar.d = this.b.wq();
        dzsj<avuo> dzsjVar = this.d;
        dzsj<avij> eY = this.b.eW.eY();
        dzsj<Executor> di = this.b.eW.di();
        dzsj<Executor> o = this.b.eW.o();
        dzsj<cjqy> al = this.b.eW.al();
        dzsj<cjqq> hN = this.b.eW.hN();
        dzsj<avik> aT = this.b.aT();
        dzsj<btvo> V = this.b.eW.V();
        dzsj<away> oK = this.b.eW.oK();
        dzsj<akfa> p = this.b.eW.p();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fca(this);
            this.c = dzsjVar2;
        }
        avuoVar.e = new avvv(dzsjVar, eY, di, o, al, hN, aT, V, oK, p, dzsjVar2, this.b.eW.cS(), this.b.eW.cT(), this.b.im());
        avuoVar.f = new avyc(this.d, this.b.eW.di(), this.b.eW.al(), this.b.eW.hN(), this.b.aT(), this.b.eW.oK(), this.b.eW.cT());
        dxjg.e(this.b.eW.a.sO());
    }
}
