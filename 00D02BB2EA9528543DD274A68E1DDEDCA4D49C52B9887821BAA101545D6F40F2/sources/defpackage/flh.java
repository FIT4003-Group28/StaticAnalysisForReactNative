package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: flh  reason: default package */
/* loaded from: classes6.dex */
public final class flh implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bsri> b;

    public flh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bqzo bqzoVar = (bqzo) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bqzoVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bqzoVar.aI = tr;
        bqzoVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bqzoVar.aK = sU;
        bqzoVar.aL = new cpv();
        bqzoVar.aM = dxjc.c(this.a.eW.ie());
        bqzoVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bqzoVar.a = this.a.h();
        ftt fttVar = this.a;
        Object obj3 = fttVar.dM;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fttVar.dM;
                if (obj2 instanceof dxjf) {
                    rb rbVar = fttVar.a;
                    bwqv rD = fttVar.eW.a.rD();
                    dxjg.e(rD);
                    obj2 = new bqza(rbVar, rD);
                    dxjc.d(fttVar.dM, obj2);
                    fttVar.dM = obj2;
                }
            }
            obj3 = obj2;
        }
        bqzoVar.b = (bqza) obj3;
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        bqzoVar.c = rz;
        bqzoVar.d = this.a.V();
        bwqv rD2 = this.a.eW.a.rD();
        dxjg.e(rD2);
        bqzoVar.e = rD2;
        bqzoVar.f = this.a.wq();
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        bqzoVar.g = tr2;
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        bqzoVar.ad = tn;
        bqzoVar.ae = this.a.ge();
        bqzoVar.af = dxjc.c(this.a.aK());
        bqzoVar.ag = this.a.wl();
        new iwh(this.a.ad(), this.a.kI(), this.a.eW.V());
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new flg(this);
            this.b = dzsjVar;
        }
        bqzoVar.ah = new bsrq(il, dzsjVar);
        ckmp s = this.a.eW.a.s();
        dxjg.e(s);
        bqzoVar.ai = s;
        bqzoVar.aj = this.a.eW.bW();
    }
}
