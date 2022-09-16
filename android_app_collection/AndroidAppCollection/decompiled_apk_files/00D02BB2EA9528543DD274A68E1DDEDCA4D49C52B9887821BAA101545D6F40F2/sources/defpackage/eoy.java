package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eoy  reason: default package */
/* loaded from: classes6.dex */
public final class eoy implements dxis {
    public volatile dzsj<apim> a;
    final /* synthetic */ ftt b;
    private final aowf c;
    private volatile dzsj<aphj> d;
    private volatile dzsj<apii> e;
    private volatile dzsj<aphy> f;
    private volatile Object g = new dxjf();
    private volatile Object h = new dxjf();

    public eoy(ftt fttVar, aowf aowfVar) {
        this.b = fttVar;
        this.c = aowfVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        aowf aowfVar = (aowf) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        aowfVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        aowfVar.aI = tr;
        aowfVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        aowfVar.aK = sU;
        aowfVar.aL = new cpv();
        aowfVar.aM = dxjc.c(this.b.eW.ie());
        aowfVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        aowfVar.a = rD;
        aowfVar.b = this.b.wl();
        dzsj<Resources> fr = this.b.eW.fr();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new eox(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = this.f;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eox(this, 3);
            this.f = dzsjVar2;
        }
        aowfVar.c = new aowl(fr, dzsjVar, dzsjVar2, c());
        Object obj4 = this.g;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj3 = this.g;
                if (obj3 instanceof dxjf) {
                    gga wk = this.b.wk();
                    aoxv oA = this.b.eW.oA();
                    akox ap = this.b.ap();
                    dxio c = dxjc.c(this.b.dE());
                    btrm rz = this.b.eW.a.rz();
                    dxjg.e(rz);
                    bvrb tn = this.b.eW.a.tn();
                    dxjg.e(tn);
                    Executor sU2 = this.b.eW.a.sU();
                    dxjg.e(sU2);
                    aphj b = b();
                    bmdv hp = this.b.eW.hp();
                    begg wj = this.b.wj();
                    gle bM = this.b.bM();
                    ahjq wf = this.b.eW.wf();
                    dxio c2 = dxjc.c(this.b.bA());
                    anhg aW = this.b.aW();
                    btvo rp = this.b.eW.a.rp();
                    dxjg.e(rp);
                    obj3 = aoxa.b(wk, oA, ap, c, rz, tn, sU2, b, hp, wj, bM, wf, c2, aW, rp);
                    dxjc.d(this.g, obj3);
                    this.g = obj3;
                }
            }
            obj4 = obj3;
        }
        aowfVar.d = (aowy) obj4;
        aowfVar.e = new apgc(this.b.ad());
        aowfVar.f = this.b.eW.oA();
        aowfVar.g = this.b.wk();
        aowfVar.ad = new aphg(dxjc.c(this.b.lN()));
        aowfVar.ae = new cqhu();
        Object obj5 = this.h;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj2 = this.h;
                if (obj2 instanceof dxjf) {
                    ftt fttVar = this.b;
                    obj2 = new gek(fttVar.a, this.c, fttVar.cJ());
                    dxjc.d(this.h, obj2);
                    this.h = obj2;
                }
            }
            obj5 = obj2;
        }
        aowfVar.af = (gek) obj5;
    }

    public final aphj b() {
        return new aphj(this.b.a);
    }

    public final dzsj<aphj> c() {
        dzsj<aphj> dzsjVar = this.d;
        if (dzsjVar == null) {
            eox eoxVar = new eox(this, 2);
            this.d = eoxVar;
            return eoxVar;
        }
        return dzsjVar;
    }
}
