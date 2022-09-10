package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eos  reason: default package */
/* loaded from: classes6.dex */
public final class eos implements dxis {
    public volatile dzsj<eco> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<bzyt> c;
    private volatile dzsj<bzyu> d;
    private volatile dzsj<bzyo> e;
    private volatile dzsj<cavr> f;
    private volatile dzsj<ech> g;

    public eos(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cavi caviVar = (cavi) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        caviVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        caviVar.aI = tr;
        caviVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        caviVar.aK = sU;
        caviVar.aL = new cpv();
        caviVar.aM = dxjc.c(this.b.eW.ie());
        caviVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        caviVar.f = this.b.wl();
        dzsj<Resources> fr = this.b.eW.fr();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new eor(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eor(this, 1);
            this.d = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.e;
        if (dzsjVar5 == null) {
            dzsjVar5 = new eor(this, 2);
            this.e = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.f;
        if (dzsjVar7 == null) {
            dzsjVar7 = new eor(this, 3);
            this.f = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj<cklf> fe = this.b.fe();
        dzsj<cafi> aR = this.b.aR();
        dzsj dzsjVar9 = this.g;
        if (dzsjVar9 == null) {
            dzsjVar9 = new eor(this, 4);
            this.g = dzsjVar9;
        }
        caviVar.g = new cavn(fr, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar8, fe, aR, dzsjVar9);
        caviVar.ad = this.b.wq();
        caviVar.ae = this.b.aQ();
    }
}
