package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: epx  reason: default package */
/* loaded from: classes6.dex */
public final class epx implements dxis {
    public volatile dzsj<cbdi> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<cazn> c;
    private volatile dzsj<cbqd> d;
    private volatile dzsj<cazl> e;

    public epx(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cazo cazoVar = (cazo) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        cazoVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        cazoVar.aI = tr;
        cazoVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        cazoVar.aK = sU;
        cazoVar.aL = new cpv();
        cazoVar.aM = dxjc.c(this.b.eW.ie());
        cazoVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        cazoVar.a = this.b.wl();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new epw(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<cbqd> b = b();
        dzsj<cqkj> y = this.b.y();
        dzsj dzsjVar3 = this.e;
        if (dzsjVar3 == null) {
            dzsjVar3 = new epw(this, 2);
            this.e = dzsjVar3;
        }
        cazoVar.b = new cazs(dzsjVar2, b, y, dzsjVar3, this.b.eW.il(), this.b.ad());
    }

    public final dzsj<cbqd> b() {
        dzsj<cbqd> dzsjVar = this.d;
        if (dzsjVar == null) {
            epw epwVar = new epw(this, 1);
            this.d = epwVar;
            return epwVar;
        }
        return dzsjVar;
    }
}
