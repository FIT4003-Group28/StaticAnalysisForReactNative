package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqd  reason: default package */
/* loaded from: classes6.dex */
public final class fqd implements dxis {
    public volatile dzsj<shu> a;
    public volatile dzsj<sdz> b;
    public volatile dzsj<qsm> c;
    public volatile dzsj<vox> d;
    public volatile dzsj<sgc> e;
    public volatile Object f = new dxjf();
    public volatile Object g = new dxjf();
    public volatile dzsj<rln> h;
    final /* synthetic */ ftt i;
    private volatile dzsj<qqh> j;
    private volatile dzsj<shc> k;
    private volatile dzsj<sgt> l;

    public fqd(ftt fttVar) {
        this.i = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rol rolVar = (rol) obj;
        cjqq tp = this.i.eW.a.tp();
        dxjg.e(tp);
        rolVar.aH = tp;
        cjqy tr = this.i.eW.a.tr();
        dxjg.e(tr);
        rolVar.aI = tr;
        rolVar.aJ = dbsg.i(this.i.ap());
        Executor sU = this.i.eW.a.sU();
        dxjg.e(sU);
        rolVar.aK = sU;
        rolVar.aL = new cpv();
        rolVar.aM = dxjc.c(this.i.eW.ie());
        rolVar.aN = dxjc.c(this.i.eW.iU());
        dxjc.c(this.i.lx());
        rolVar.b = this.i.wq();
        rolVar.c = this.i.wl();
        ftt fttVar = this.i;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqhn> il = fttVar.eW.il();
        dzsj dzsjVar2 = this.j;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fqc(this, 0);
            this.j = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<sfd> vx = this.i.vx();
        dzsj<efh> fN = this.i.fN();
        dzsj dzsjVar4 = this.k;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fqc(this, 1);
            this.k = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.l;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fqc(this, 8);
            this.l = dzsjVar6;
        }
        rolVar.a = new sgx(dzsjVar, il, dzsjVar3, vx, fN, dzsjVar5, dzsjVar6, dxjh.c(this.i.eW.at()), dxjh.c(this.i.eW.aw()), this.i.hP(), this.i.eW.V());
    }
}
