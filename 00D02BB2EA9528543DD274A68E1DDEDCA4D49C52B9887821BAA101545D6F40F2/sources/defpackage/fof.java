package defpackage;

import android.content.res.Resources;
import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fof  reason: default package */
/* loaded from: classes6.dex */
public final class fof implements dxis {
    public final chbx a;
    public volatile Object b = new dxjf();
    public volatile dzsj<dbpk> c;
    public volatile dzsj<chkg> d;
    final /* synthetic */ ftt e;
    private volatile dzsj<chiu> f;
    private volatile dzsj<chjx> g;
    private volatile dzsj h;
    private volatile dzsj<chgz> i;
    private volatile dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> j;

    public fof(ftt fttVar, chbx chbxVar) {
        this.e = fttVar;
        this.a = chbxVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        chbx chbxVar = (chbx) obj;
        cjqq tp = this.e.eW.a.tp();
        dxjg.e(tp);
        chbxVar.aH = tp;
        cjqy tr = this.e.eW.a.tr();
        dxjg.e(tr);
        chbxVar.aI = tr;
        chbxVar.aJ = dbsg.i(this.e.ap());
        Executor sU = this.e.eW.a.sU();
        dxjg.e(sU);
        chbxVar.aK = sU;
        chbxVar.aL = new cpv();
        chbxVar.aM = dxjc.c(this.e.eW.ie());
        chbxVar.aN = dxjc.c(this.e.eW.iU());
        dxjc.c(this.e.lx());
        chbxVar.a = this.e.wd();
        bwqv rD = this.e.eW.a.rD();
        dxjg.e(rD);
        chbxVar.b = rD;
        dzsj<cafi> aR = this.e.aR();
        dzsj<chnm> cQ = this.e.cQ();
        dzsj<cqhn> il = this.e.eW.il();
        dzsj<Resources> fr = this.e.eW.fr();
        dzsj dzsjVar = this.h;
        if (dzsjVar == null) {
            dzsjVar = new foe(this, 0);
            this.h = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        ftt fttVar = this.e;
        dzsj dzsjVar3 = fttVar.dW;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fns(fttVar, 1401);
            fttVar.dW = dzsjVar3;
        }
        dzsj dzsjVar4 = this.i;
        if (dzsjVar4 == null) {
            dzsjVar4 = new foe(this, 5);
            this.i = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.j;
        if (dzsjVar6 == null) {
            dzsjVar6 = new foe(this, 6);
            this.j = dzsjVar6;
        }
        chbxVar.c = new chlh(aR, cQ, il, fr, dzsjVar2, dzsjVar3, dzsjVar5, dzsjVar6, this.e.eW.kY());
        chbxVar.d = this.e.wq();
        chbxVar.e = this.e.wl();
    }

    public final dzsj<chiu> b() {
        dzsj<chiu> dzsjVar = this.f;
        if (dzsjVar == null) {
            foe foeVar = new foe(this, 2);
            this.f = foeVar;
            return foeVar;
        }
        return dzsjVar;
    }

    public final dzsj<chjx> c() {
        dzsj<chjx> dzsjVar = this.g;
        if (dzsjVar == null) {
            foe foeVar = new foe(this, 3);
            this.g = foeVar;
            return foeVar;
        }
        return dzsjVar;
    }
}
