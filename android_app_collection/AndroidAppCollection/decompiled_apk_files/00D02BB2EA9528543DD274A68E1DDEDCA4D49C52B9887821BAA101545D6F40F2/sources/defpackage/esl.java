package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: esl  reason: default package */
/* loaded from: classes6.dex */
public final class esl implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<zzh> b;
    private volatile dzsj<zzn> c;

    public esl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        zyy zyyVar = (zyy) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        zyyVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        zyyVar.aI = tr;
        zyyVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        zyyVar.aK = sU;
        zyyVar.aL = new cpv();
        zyyVar.aM = dxjc.c(this.a.eW.ie());
        zyyVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        zyyVar.a = tr2;
        zyyVar.b = this.a.ap();
        zyyVar.c = dxjc.c(this.a.av());
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new esk(this, 0);
            this.b = dzsjVar;
        }
        zyyVar.d = dxjc.c(dzsjVar);
        zyyVar.e = this.a.wl();
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        zyyVar.f = rz;
        zyyVar.g = this.a.wq();
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        zyyVar.ad = rU;
        zyyVar.ae = this.a.bC();
        zyyVar.af = b();
        zyyVar.ag = new aaaa(this.a.eV);
        zyyVar.ah = new zzu(this.a.eW.kf(), this.a.eW.R());
        dzsj<rb> dzsjVar2 = this.a.eV;
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new esk(this, 1);
            this.c = dzsjVar3;
        }
        zyyVar.ai = new zzq(dzsjVar2, dzsjVar3);
    }

    public final zzn b() {
        ftt fttVar = this.a;
        return new zzn(fttVar.a, dxjc.c(fttVar.av()));
    }
}
