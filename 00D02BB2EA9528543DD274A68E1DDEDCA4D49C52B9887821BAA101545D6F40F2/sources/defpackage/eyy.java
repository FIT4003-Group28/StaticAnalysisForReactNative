package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eyy  reason: default package */
/* loaded from: classes6.dex */
public final class eyy implements dxis {
    public volatile dzsj<bgvg> a;
    public volatile dzsj<bgvh> b;
    public volatile dzsj<bgvf> c;
    final /* synthetic */ ftt d;
    private volatile dzsj<bgvo> e;

    public eyy(ftt fttVar) {
        this.d = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bgue bgueVar = (bgue) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        bgueVar.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        bgueVar.aI = tr;
        bgueVar.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        bgueVar.aK = sU;
        bgueVar.aL = new cpv();
        bgueVar.aM = dxjc.c(this.d.eW.ie());
        bgueVar.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        bgueVar.b = this.d.wq();
        bgueVar.c = this.d.wl();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new eyx(this, 0);
            this.e = dzsjVar;
        }
        bgueVar.d = new bgvq(dzsjVar);
        bwqv rD = this.d.eW.a.rD();
        dxjg.e(rD);
        bgueVar.e = rD;
        bvjj rB = this.d.eW.a.rB();
        dxjg.e(rB);
        bgueVar.f = rB;
    }
}
