package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: flp  reason: default package */
/* loaded from: classes6.dex */
public final class flp implements dxis {
    final /* synthetic */ ftt a;
    public volatile burt b;
    private volatile Object c = new dxjf();
    private volatile dzsj<aotw> d;
    private volatile dzsj<anqv> e;
    private volatile dzsj<anqx> f;
    private volatile dzsj<ansb> g;
    private volatile dzsj<anru> h;

    public flp(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aoou aoouVar = (aoou) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aoouVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aoouVar.aI = tr;
        aoouVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aoouVar.aK = sU;
        aoouVar.aL = new cpv();
        aoouVar.aM = dxjc.c(this.a.eW.ie());
        aoouVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        aoouVar.a = new anpf(rD);
        ftt fttVar = this.a;
        aoouVar.b = new apjy(fttVar.a, dxjc.c(fttVar.kI()), dxjc.c(this.a.sw()));
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        aoouVar.c = rR;
        aoouVar.d = this.a.eW.rw();
        aoouVar.e = this.a.eW.jD();
        aoouVar.f = b();
        aoouVar.g = this.a.wd();
        bwqv rD2 = this.a.eW.a.rD();
        dxjg.e(rD2);
        aoouVar.ad = rD2;
        ftt fttVar2 = this.a;
        aoouVar.ae = new apkv(fttVar2.eV, fttVar2.sw(), this.a.y());
        aoouVar.af = this.a.dH();
        ftt fttVar3 = this.a;
        dzsj<rb> dzsjVar = fttVar3.eV;
        dzsj<angp> jB = fttVar3.eW.jB();
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new flo(this, 0);
            this.d = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.e;
        if (dzsjVar4 == null) {
            dzsjVar4 = new flo(this, 1);
            this.e = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.f;
        if (dzsjVar6 == null) {
            dzsjVar6 = new flo(this, 2);
            this.f = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.g;
        if (dzsjVar8 == null) {
            dzsjVar8 = new flo(this, 3);
            this.g = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj dzsjVar10 = this.h;
        if (dzsjVar10 == null) {
            dzsjVar10 = new flo(this, 4);
            this.h = dzsjVar10;
        }
        aoouVar.ag = new aoqc(dzsjVar, jB, dzsjVar3, dzsjVar5, dzsjVar7, dzsjVar9, dzsjVar10, this.a.ug());
        gga wk = this.a.wk();
        anhg aW = this.a.aW();
        dxio c = dxjc.c(this.a.bh());
        apkm dN = this.a.dN();
        dxjg.e(this.a.eW.a.rB());
        this.a.eW.am();
        cpv cpvVar = new cpv();
        this.a.eW.jJ();
        dxjg.e(this.a.eW.a.rp());
        aoouVar.ah = new apjv(wk, aW, c, dN, cpvVar);
        aoouVar.ai = this.a.wl();
        aoouVar.aj = this.a.wq();
        aoouVar.ak = this.a.ap();
        aoouVar.al = this.a.cJ();
        aoouVar.am = new aplg(this.a.cv());
    }

    public final aotw b() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.c;
                if (obj instanceof dxjf) {
                    ftt fttVar = this.a;
                    rb rbVar = fttVar.a;
                    obj = new aotw(rbVar, new aoub(rbVar, fttVar.sw()), this.a.as(), this.a.cy(), this.a.dF());
                    dxjc.d(this.c, obj);
                    this.c = obj;
                }
            }
            obj2 = obj;
        }
        return (aotw) obj2;
    }
}
