package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: foe  reason: default package */
/* loaded from: classes6.dex */
public final class foe<T> implements dzsj<T> {
    final /* synthetic */ fof a;
    private final int b;

    public foe(fof fofVar, int i) {
        this.a = fofVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                fof fofVar = this.a;
                Object obj2 = fofVar.b;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = fofVar.b;
                        if (obj instanceof dxjf) {
                            obj = dbpk.a(fofVar.a);
                            dxjc.d(fofVar.b, obj);
                            fofVar.b = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (T) ((dbpk) obj2);
            } else if (i == 2) {
                return (T) chiv.b(this.a.e.a);
            } else {
                if (i == 3) {
                    return (T) new chjx(this.a.e.eW.fr());
                }
                if (i == 4) {
                    fof fofVar2 = this.a;
                    return (T) new chkg(fofVar2.e.eW.il(), fofVar2.e.eW.fr());
                } else if (i == 5) {
                    return (T) new chgz();
                } else {
                    fof fofVar3 = this.a;
                    cqhn cqhnVar = new cqhn();
                    ccgr fc = fofVar3.e.eW.fc();
                    Executor sU = fofVar3.e.eW.a.sU();
                    dxjg.e(sU);
                    caxo ff = fofVar3.e.ff();
                    caxa caxaVar = caxa.PHOTOS;
                    dxjg.f(caxaVar);
                    return (T) cayk.b(cqhnVar, fc, sU, ff, caxaVar);
                }
            }
        }
        fof fofVar4 = this.a;
        dxjg.e(fofVar4.e.eW.a.rp());
        dzsj<gga> ad = fofVar4.e.ad();
        dzsj<cqhn> il = fofVar4.e.eW.il();
        dzsj<beya> qz = fofVar4.e.qz();
        ftt fttVar = fofVar4.e;
        dzsj dzsjVar = fttVar.dU;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar, 1399);
            fttVar.dU = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        ftt fttVar2 = fofVar4.e;
        dzsj dzsjVar3 = fttVar2.dV;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fns(fttVar2, 1400);
            fttVar2.dV = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj<bfaq> qA = fofVar4.e.qA();
        dzsj dzsjVar5 = fofVar4.c;
        if (dzsjVar5 == null) {
            dzsjVar5 = new foe(fofVar4, 1);
            fofVar4.c = dzsjVar5;
        }
        chjl chjlVar = new chjl(ad, il, qz, dzsjVar2, dzsjVar4, qA, dzsjVar5, fofVar4.e.eW.er(), fofVar4.e.eW.R(), dxjh.c(fofVar4.e.eW.im()), fofVar4.e.eW.di(), fofVar4.e.qC(), fofVar4.e.eW.mI());
        fofVar4.e.eW.il();
        fofVar4.e.bf();
        fofVar4.e.qw();
        chjt chjtVar = new chjt(fofVar4.e.eW.fd(), fofVar4.b(), fofVar4.e.eW.fr());
        chjr chjrVar = new chjr(fofVar4.e.eW.fd(), fofVar4.e.eW.il(), fofVar4.e.eW.di(), fofVar4.e.bb(), fofVar4.e.eW.fr());
        chjv chjvVar = new chjv(fofVar4.e.eW.fd(), fofVar4.b());
        chjz chjzVar = new chjz(fofVar4.e.eW.fd(), fofVar4.e.eW.V(), fofVar4.c(), fofVar4.e.fI(), fofVar4.b());
        ftt fttVar3 = fofVar4.e;
        dzsj<rb> dzsjVar6 = fttVar3.eV;
        dzsj<cqhn> il2 = fttVar3.eW.il();
        dzsj<Executor> di = fofVar4.e.eW.di();
        dzsj<buqs> ks = fofVar4.e.ks();
        dzsj<cklf> fe = fofVar4.e.fe();
        dzsj<bmdv> lL = fofVar4.e.eW.lL();
        dzsj c = dxjh.c(fofVar4.e.eW.k());
        dzsj<axrg> aI = fofVar4.e.eW.aI();
        dzsj<axrx> T = fofVar4.e.T();
        dzsj<bbut> bf = fofVar4.e.bf();
        dzsj<Resources> fr = fofVar4.e.eW.fr();
        dzsj<cdfx> fD = fofVar4.e.fD();
        dzsj dzsjVar7 = fofVar4.d;
        if (dzsjVar7 == null) {
            dzsjVar7 = new foe(fofVar4, 4);
            fofVar4.d = dzsjVar7;
        }
        chko chkoVar = new chko(dzsjVar6, il2, di, ks, fe, lL, c, aI, T, bf, fr, fD, dzsjVar7);
        chkr chkrVar = new chkr(fofVar4.e.eW.V(), fofVar4.c(), fofVar4.e.fI(), fofVar4.b());
        chku chkuVar = new chku(fofVar4.e.eW.di(), fofVar4.e.ks());
        chlv chlvVar = new chlv(fofVar4.e.eW.fd(), fofVar4.e.eW.V(), fofVar4.c(), fofVar4.e.fI(), fofVar4.b());
        chly chlyVar = new chly(fofVar4.e.aJ());
        Resources c2 = fofVar4.e.eW.a.c();
        dxjg.e(c2);
        return (T) new chkv(chjlVar, chjtVar, chjrVar, chjvVar, chjzVar, chkoVar, chkrVar, chkuVar, chlvVar, chlyVar, c2);
    }
}
