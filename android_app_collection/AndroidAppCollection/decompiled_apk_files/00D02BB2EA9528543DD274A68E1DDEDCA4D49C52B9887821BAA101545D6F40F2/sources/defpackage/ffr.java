package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ffr  reason: default package */
/* loaded from: classes6.dex */
public final class ffr<T> implements dzsj<T> {
    final /* synthetic */ ffs a;
    private final int b;

    public ffr(ffs ffsVar, int i) {
        this.a = ffsVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                ffs ffsVar = this.a;
                dzsj<cqhn> il = ffsVar.e.eW.il();
                dzsj<begg> az = ffsVar.e.az();
                dzsj<axyp> iW = ffsVar.e.iW();
                dzsj<axwy> J = ffsVar.e.J();
                dzsj<bwqv> er = ffsVar.e.eW.er();
                dzsj<gga> ad = ffsVar.e.ad();
                dzsj<anhg> aX = ffsVar.e.aX();
                dzsj<angp> jB = ffsVar.e.eW.jB();
                dzsj<anhk> mf = ffsVar.e.eW.mf();
                dzsj<Executor> di = ffsVar.e.eW.di();
                dzsj<cjqy> al = ffsVar.e.eW.al();
                dzsj dzsjVar = ffsVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new ffr(ffsVar, 1);
                    ffsVar.a = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = ffsVar.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new ffr(ffsVar, 2);
                    ffsVar.b = dzsjVar3;
                }
                return (T) new apen(il, az, iW, J, er, ad, aX, jB, mf, di, al, dzsjVar2, dzsjVar3, ffsVar.e.eW.oB(), ffsVar.e.eW.V());
            case 1:
                ffs ffsVar2 = this.a;
                ftt fttVar = ffsVar2.e;
                return (T) new apdb(fttVar.eV, fttVar.eW.k(), ffsVar2.e.eW.lL(), ffsVar2.e.pl());
            case 2:
                return (T) this.a.b();
            case 3:
                ffs ffsVar3 = this.a;
                dzsj<bwqv> er2 = ffsVar3.e.eW.er();
                dzsj dzsjVar4 = ffsVar3.c;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new ffr(ffsVar3, 4);
                    ffsVar3.c = dzsjVar4;
                }
                return (T) new apep(er2, dzsjVar4, ffsVar3.e.ad());
            case 4:
                return (T) this.a.c();
            case 5:
                ffs ffsVar4 = this.a;
                cjqy tr = ffsVar4.e.eW.a.tr();
                dxjg.e(tr);
                return (T) new apcf(tr, ffsVar4.e.eW.oA());
            case 6:
                ffs ffsVar5 = this.a;
                dzsj<cqhn> il2 = ffsVar5.e.eW.il();
                dzsj dzsjVar5 = ffsVar5.d;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new ffr(ffsVar5, 7);
                    ffsVar5.d = dzsjVar5;
                }
                return (T) new apgh(il2, dzsjVar5);
            case 7:
                ffs ffsVar6 = this.a;
                return (T) new apge(ffsVar6.e.eW.fr(), ffsVar6.e());
            case 8:
                return (T) this.a.d();
            default:
                return (T) new apgx(this.a.e.eW.fr());
        }
    }
}
