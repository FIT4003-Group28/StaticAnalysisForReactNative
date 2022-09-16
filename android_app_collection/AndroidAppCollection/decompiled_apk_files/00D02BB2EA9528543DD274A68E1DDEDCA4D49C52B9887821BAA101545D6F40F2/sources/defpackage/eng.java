package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eng  reason: default package */
/* loaded from: classes6.dex */
final class eng<T> implements dzsj<T> {
    final /* synthetic */ enh a;
    private final int b;

    public eng(enh enhVar, int i) {
        this.a = enhVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i == 0) {
            enh enhVar = this.a;
            dzsj<gga> ad = enhVar.e.ad();
            dzsj<begg> az = enhVar.e.az();
            dzsj dzsjVar = enhVar.a;
            if (dzsjVar == null) {
                dzsjVar = new eng(enhVar, 1);
                enhVar.a = dzsjVar;
            }
            dzsj dzsjVar2 = enhVar.b;
            if (dzsjVar2 == null) {
                dzsjVar2 = new eng(enhVar, 2);
                enhVar.b = dzsjVar2;
            }
            return (T) new bbaa(ad, az, dzsjVar, dzsjVar2);
        } else if (i == 1) {
            enh enhVar2 = this.a;
            ftt fttVar = enhVar2.e;
            return (T) new bfcd(fttVar.eV, fttVar.eW.il(), enhVar2.e.eW.bk());
        } else if (i == 2) {
            return (T) bnht.b(this.a.e.eW.nf());
        } else {
            if (i != 3) {
                return (T) baua.b(this.a.e.fc());
            }
            enh enhVar3 = this.a;
            gga wk = enhVar3.e.wk();
            cqat rR = enhVar3.e.eW.a.rR();
            dxjg.e(rR);
            aybl b = aybm.b(wk, rR, enhVar3.e.eW.wf());
            dzsj<gga> ad2 = enhVar3.e.ad();
            dzsj<baas> dzsjVar3 = enhVar3.d;
            dzsj<ahjq> k = enhVar3.e.eW.k();
            dzsj c = dxjh.c(enhVar3.e.uo());
            dzsj<btpc> cx = enhVar3.e.eW.cx();
            dzsj<begg> az2 = enhVar3.e.az();
            dzsj<bvrb> R = enhVar3.e.eW.R();
            dzsj<cztz> dd = enhVar3.e.eW.dd();
            dzsj<bnjv> pl = enhVar3.e.pl();
            dzsj<btvo> V = enhVar3.e.eW.V();
            dzsj<btrg> mG = enhVar3.e.eW.mG();
            dzsj<Executor> di = enhVar3.e.eW.di();
            dzsj dzsjVar4 = enhVar3.c;
            if (dzsjVar4 == null) {
                dzsjVar4 = new eng(enhVar3, 4);
                enhVar3.c = dzsjVar4;
            }
            return (T) new bafk(b, new ayfl(ad2, dzsjVar3, k, c, cx, az2, R, dd, pl, V, mG, di, dzsjVar4));
        }
    }
}
