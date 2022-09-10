package defpackage;

import com.google.android.apps.gmm.ugc.disclosure.PublicDisclosureLayout$PublicDisclosureViewModelImpl;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fml  reason: default package */
/* loaded from: classes6.dex */
public final class fml implements dxis {
    public volatile bvff a;
    public volatile dzsj<bjxv> b;
    public volatile bvfn c;
    public volatile dzsj<bjyn> d;
    public volatile dzsj<bjym> e;
    public volatile dzsj<bvel> f;
    public volatile dzsj<bjzs> g;
    public volatile dzsj<bjzt> h;
    public volatile dzsj<bjxt> i;
    public volatile dzsj<bvez> j;
    public volatile dzsj<PublicDisclosureLayout$PublicDisclosureViewModelImpl> k;
    public volatile dzsj<bjzv> l;
    final /* synthetic */ ftt m;
    public volatile bvel n;
    public volatile bvez o;
    private volatile dzsj<bvff> p;
    private volatile dzsj<bvfn> q;
    private volatile dzsj<bjxm> r;
    private volatile dzsj<bjxq> s;
    private volatile dzsj t;
    private volatile dzsj<bjhs> u;
    private volatile dzsj<bjze> v;
    private volatile dzsj<bjzu> w;

    public fml(ftt fttVar) {
        this.m = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bjjf bjjfVar = (bjjf) obj;
        cjqq tp = this.m.eW.a.tp();
        dxjg.e(tp);
        bjjfVar.aH = tp;
        cjqy tr = this.m.eW.a.tr();
        dxjg.e(tr);
        bjjfVar.aI = tr;
        bjjfVar.aJ = dbsg.i(this.m.ap());
        Executor sU = this.m.eW.a.sU();
        dxjg.e(sU);
        bjjfVar.aK = sU;
        bjjfVar.aL = new cpv();
        bjjfVar.aM = dxjc.c(this.m.eW.ie());
        bjjfVar.aN = dxjc.c(this.m.eW.iU());
        dxjc.c(this.m.lx());
        bjjfVar.f = dxjc.c(this.m.eW.p());
        bjjfVar.g = this.m.wq();
        bjjfVar.ad = this.m.wl();
        dehq tf = this.m.eW.a.tf();
        dxjg.e(tf);
        bjjfVar.ae = tf;
        bwqv rD = this.m.eW.a.rD();
        dxjg.e(rD);
        bjjfVar.aj = rD;
        bjjfVar.a = new cqhu();
        dzsj<gga> ad = this.m.ad();
        dzsj<cqhn> il = this.m.eW.il();
        dzsj<bjgu> pO = this.m.pO();
        dzsj<bjzo> qg = this.m.qg();
        dzsj dzsjVar = this.r;
        if (dzsjVar == null) {
            dzsjVar = new fmk(this, 0);
            this.r = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.s;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fmk(this, 9);
            this.s = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.t;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fmk(this, 12);
            this.t = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.u;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fmk(this, 14);
            this.u = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj<bjgi> qa = this.m.qa();
        dzsj dzsjVar9 = this.v;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fmk(this, 15);
            this.v = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.w;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fmk(this, 16);
            this.w = dzsjVar11;
        }
        bjjfVar.b = new bjjx(ad, il, pO, qg, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar8, qa, dzsjVar10, dzsjVar11, this.m.eW.V(), this.m.fO());
        btrm rz = this.m.eW.a.rz();
        dxjg.e(rz);
        bjjfVar.c = rz;
        bjjfVar.d = this.m.pN();
    }

    public final dzsj<bvff> b() {
        dzsj<bvff> dzsjVar = this.p;
        if (dzsjVar == null) {
            fmk fmkVar = new fmk(this, 1);
            this.p = fmkVar;
            return fmkVar;
        }
        return dzsjVar;
    }

    public final dzsj<bvfn> c() {
        dzsj<bvfn> dzsjVar = this.q;
        if (dzsjVar == null) {
            fmk fmkVar = new fmk(this, 5);
            this.q = fmkVar;
            return fmkVar;
        }
        return dzsjVar;
    }
}
