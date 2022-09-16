package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fie  reason: default package */
/* loaded from: classes6.dex */
public final class fie implements dxis {
    final /* synthetic */ ftt b;
    private volatile dzsj<bpdn> c;
    private volatile dzsj<booa> d;
    private volatile dzsj<bnyd> e;
    private volatile dzsj<bptg> f;
    private volatile dzsj<abbm> g;
    public volatile Object a = new dxjf();
    private volatile Object h = new dxjf();

    public fie(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bpdc bpdcVar = (bpdc) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bpdcVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bpdcVar.aI = tr;
        bpdcVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bpdcVar.aK = sU;
        bpdcVar.aL = new cpv();
        bpdcVar.aM = dxjc.c(this.b.eW.ie());
        bpdcVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        dxio c = dxjc.c(this.b.as());
        dxio c2 = dxjc.c(this.b.cy());
        ftt fttVar = this.b;
        bpdcVar.c = new bpvc(c, c2, fttVar.a, dxjc.c(fttVar.av()));
        bpdcVar.d = dxjc.c(this.b.as());
        bpdcVar.e = this.b.wl();
        bpdcVar.f = this.b.wq();
        dxjg.e(this.b.eW.a.rD());
        dzsj<gga> ad = this.b.ad();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fid(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fid(this, 1);
            this.d = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.e;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fid(this, 2);
            this.e = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj<bpto> uQ = this.b.uQ();
        dzsj dzsjVar7 = this.f;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fid(this, 3);
            this.f = dzsjVar7;
        }
        bpdcVar.g = new bpdr(ad, il, dzsjVar2, dzsjVar4, dzsjVar6, uQ, dzsjVar7, this.b.uR());
        dzsj dzsjVar8 = this.g;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fid(this, 4);
            this.g = dzsjVar8;
        }
        bpdcVar.ad = dxjc.c(dzsjVar8);
        bvrb tn = this.b.eW.a.tn();
        dxjg.e(tn);
        bpdcVar.ae = tn;
        bpdcVar.af = this.b.eW.dQ();
        bpdcVar.ag = dxjc.c(this.b.eW.dM());
        Object obj3 = this.h;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.h;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.b.as()), dxjc.c(this.b.av()), dxjc.c(this.b.cu()));
                    dxjc.d(this.h, obj2);
                    this.h = obj2;
                }
            }
            obj3 = obj2;
        }
        bpdcVar.ah = (bpsq) obj3;
    }
}
