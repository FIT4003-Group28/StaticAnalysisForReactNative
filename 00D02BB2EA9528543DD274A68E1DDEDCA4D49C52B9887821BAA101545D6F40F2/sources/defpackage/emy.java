package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: emy  reason: default package */
/* loaded from: classes6.dex */
public final class emy<T> implements dzsj<T> {
    final /* synthetic */ emz a;
    private final int b;

    public emy(emz emzVar, int i) {
        this.a = emzVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, bvet, bver] */
    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            emz emzVar = this.a;
            dzsj<gga> ad = emzVar.e.ad();
            dzsj<jmx> fO = emzVar.e.fO();
            dzsj<cqhn> il = emzVar.e.eW.il();
            dzsj<cqhu> eS = emzVar.e.eS();
            dzsj dzsjVar = emzVar.b;
            if (dzsjVar == null) {
                dzsjVar = new emy(emzVar, 1);
                emzVar.b = dzsjVar;
            }
            dzsj dzsjVar2 = dzsjVar;
            dzsj<Executor> di = emzVar.e.eW.di();
            dzsj dzsjVar3 = emzVar.c;
            if (dzsjVar3 == null) {
                dzsjVar3 = new emy(emzVar, 2);
                emzVar.c = dzsjVar3;
            }
            dzsj dzsjVar4 = dzsjVar3;
            dzsj dzsjVar5 = emzVar.d;
            if (dzsjVar5 == null) {
                dzsjVar5 = new emy(emzVar, 5);
                emzVar.d = dzsjVar5;
            }
            return (T) new bkag(ad, fO, il, eS, dzsjVar2, di, dzsjVar4, dzsjVar5);
        } else if (i == 1) {
            emz emzVar2 = this.a;
            T t = (T) emzVar2.a;
            if (t != null) {
                return t;
            }
            dxio c = dxjc.c(emzVar2.e.eW.h());
            bvrb tn = emzVar2.e.eW.a.tn();
            dxjg.e(tn);
            ?? r1 = (T) new bvet(new bves(c, tn));
            emzVar2.a = r1;
            return r1;
        } else if (i == 2) {
            emz emzVar3 = this.a;
            return (T) new bjyc(emzVar3.e.ad(), emzVar3.e.fF(), emzVar3.e.qb(), emzVar3.b(), emzVar3.c());
        } else if (i == 3) {
            return (T) new bjxv(this.a.e.ad());
        } else {
            if (i == 4) {
                return (T) new bkaa(this.a.e.eW.il());
            }
            if (i != 5) {
                emz emzVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                ccgr fc = emzVar4.e.eW.fc();
                Executor sU = emzVar4.e.eW.a.sU();
                dxjg.e(sU);
                caxo ff = emzVar4.e.ff();
                caxa caxaVar = caxa.QA;
                dxjg.f(caxaVar);
                return (T) cayk.b(cqhnVar, fc, sU, ff, caxaVar);
            }
            emz emzVar5 = this.a;
            return (T) new bjyj(emzVar5.e.ad(), emzVar5.e.aH(), emzVar5.b(), emzVar5.c(), emzVar5.e.pT());
        }
    }
}
