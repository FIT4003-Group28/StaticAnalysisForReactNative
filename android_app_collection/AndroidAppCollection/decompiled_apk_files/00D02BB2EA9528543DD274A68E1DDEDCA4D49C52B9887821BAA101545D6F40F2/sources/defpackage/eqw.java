package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eqw  reason: default package */
/* loaded from: classes6.dex */
public final class eqw<T> implements dzsj<T> {
    final /* synthetic */ eqx a;
    private final int b;

    public eqw(eqx eqxVar, int i) {
        this.a = eqxVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [T, bvap, bvan] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                eqx eqxVar = this.a;
                return (T) new bdfc(eqxVar.f.eW.fr(), eqxVar.b());
            case 1:
                return (T) this.a.a.g().b;
            case 2:
                eqx eqxVar2 = this.a;
                T t = (T) eqxVar2.b;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(eqxVar2.f.eW.h());
                bvrb tn = eqxVar2.f.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) bvar.b(bvaq.b(c, tn));
                eqxVar2.b = r1;
                return r1;
            case 3:
                return (T) new bdfe(this.a.f.eW.il());
            case 4:
                eqx eqxVar3 = this.a;
                dzsj<gga> ad = eqxVar3.f.ad();
                dzsj<cqhn> il = eqxVar3.f.eW.il();
                dzsj<cafi> aR = eqxVar3.f.aR();
                dzsj<begg> az = eqxVar3.f.az();
                dzsj c2 = dxjh.c(eqxVar3.f.m());
                dzsj<btvo> V = eqxVar3.f.eW.V();
                dzsj dzsjVar = eqxVar3.c;
                if (dzsjVar == null) {
                    dzsjVar = new eqw(eqxVar3, 5);
                    eqxVar3.c = dzsjVar;
                }
                return (T) new bdbx(ad, il, aR, az, c2, V, dzsjVar);
            case 5:
                return (T) this.a.c();
            case 6:
                eqx eqxVar4 = this.a;
                dzsj<Context> I = eqxVar4.f.eW.I();
                dzsj<cqhn> il2 = eqxVar4.f.eW.il();
                dzsj<cjqy> al = eqxVar4.f.eW.al();
                dzsj<cjqq> hN = eqxVar4.f.eW.hN();
                dzsj dzsjVar2 = eqxVar4.d;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new eqw(eqxVar4, 7);
                    eqxVar4.d = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj<afxn> pg = eqxVar4.f.eW.pg();
                dzsj dzsjVar4 = eqxVar4.e;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new eqw(eqxVar4, 8);
                    eqxVar4.e = dzsjVar4;
                }
                return (T) new bdch(I, il2, al, hN, dzsjVar3, pg, dzsjVar4);
            case 7:
                eqx eqxVar5 = this.a;
                return (T) new afxz(eqxVar5.f.eW.I(), eqxVar5.f.eW.V(), eqxVar5.f.ux(), eqxVar5.f.eW.pg());
            case 8:
                eqx eqxVar6 = this.a;
                afxv uw = eqxVar6.f.uw();
                btvo rp = eqxVar6.f.eW.a.rp();
                dxjg.e(rp);
                return (T) new bcro(uw, rp);
            case 9:
                return (T) new bdcj(this.a.f.ux());
            case 10:
                eqx eqxVar7 = this.a;
                rb rbVar = eqxVar7.f.a;
                cqhn cqhnVar = new cqhn();
                apqe le = eqxVar7.f.le();
                cjqy tr = eqxVar7.f.eW.a.tr();
                dxjg.e(tr);
                bcpz bcpzVar = eqxVar7.a;
                bdcn c3 = eqxVar7.c();
                bbvl bbvlVar = eqxVar7.a.g().a;
                bbtx n = eqxVar7.a.am.n();
                dxjg.f(n);
                return (T) new bddb(rbVar, cqhnVar, le, tr, bcpzVar, c3, bbvlVar, n);
            default:
                return (T) bcbb.b();
        }
    }
}
