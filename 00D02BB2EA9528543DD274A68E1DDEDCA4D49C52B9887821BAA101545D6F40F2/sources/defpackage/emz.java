package defpackage;

import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: emz  reason: default package */
/* loaded from: classes6.dex */
public final class emz implements dxis {
    public volatile bver a;
    public volatile dzsj<bver> b;
    public volatile dzsj<bjyc> c;
    public volatile dzsj<bjyj> d;
    final /* synthetic */ ftt e;
    private volatile dzsj<bjxv> f;
    private volatile dzsj<bkaa> g;
    private volatile dzsj<bkag> h;
    private volatile dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> i;

    public emz(ftt fttVar) {
        this.e = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bjck bjckVar;
        bjck bjckVar2 = (bjck) obj;
        cjqq tp = this.e.eW.a.tp();
        dxjg.e(tp);
        bjckVar2.aH = tp;
        cjqy tr = this.e.eW.a.tr();
        dxjg.e(tr);
        bjckVar2.aI = tr;
        bjckVar2.aJ = dbsg.i(this.e.ap());
        Executor sU = this.e.eW.a.sU();
        dxjg.e(sU);
        bjckVar2.aK = sU;
        bjckVar2.aL = new cpv();
        bjckVar2.aM = dxjc.c(this.e.eW.ie());
        bjckVar2.aN = dxjc.c(this.e.eW.iU());
        dxjc.c(this.e.lx());
        bjckVar2.f = dxjc.c(this.e.eW.p());
        bjckVar2.g = this.e.wq();
        bjckVar2.ad = this.e.wl();
        dehq tf = this.e.eW.a.tf();
        dxjg.e(tf);
        bjckVar2.ae = tf;
        bwqv rD = this.e.eW.a.rD();
        dxjg.e(rD);
        bjckVar2.aj = rD;
        dzsj<gga> ad = this.e.ad();
        dzsj<cqhn> il = this.e.eW.il();
        dzsj<bjhc> pT = this.e.pT();
        dzsj<gdc> lD = this.e.lD();
        dzsj<cafi> aR = this.e.aR();
        dzsj<bvfk> pY = this.e.pY();
        dzsj<btrm> n = this.e.eW.n();
        dzsj<bjgi> qa = this.e.qa();
        dzsj<chhr> uu = this.e.uu();
        dzsj<chht> fP = this.e.fP();
        dzsj dzsjVar = this.h;
        if (dzsjVar == null) {
            dzsjVar = new emy(this, 0);
            this.h = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<bjgu> pO = this.e.pO();
        dzsj dzsjVar3 = this.i;
        if (dzsjVar3 == null) {
            bjckVar = bjckVar2;
            dzsjVar3 = new emy(this, 6);
            this.i = dzsjVar3;
        } else {
            bjckVar = bjckVar2;
        }
        bjck bjckVar3 = bjckVar;
        bjckVar3.a = new bjdj(ad, il, pT, lD, aR, pY, n, qa, uu, fP, dzsjVar2, pO, dzsjVar3);
        bjckVar3.b = new bjeb(this.e.eW.il());
        bjckVar3.c = this.e.eW.mB();
        bjckVar3.d = this.e.pN();
        bjckVar3.e = new cqhu();
    }

    public final dzsj<bjxv> b() {
        dzsj<bjxv> dzsjVar = this.f;
        if (dzsjVar == null) {
            emy emyVar = new emy(this, 3);
            this.f = emyVar;
            return emyVar;
        }
        return dzsjVar;
    }

    public final dzsj<bkaa> c() {
        dzsj<bkaa> dzsjVar = this.g;
        if (dzsjVar == null) {
            emy emyVar = new emy(this, 4);
            this.g = emyVar;
            return emyVar;
        }
        return dzsjVar;
    }
}
