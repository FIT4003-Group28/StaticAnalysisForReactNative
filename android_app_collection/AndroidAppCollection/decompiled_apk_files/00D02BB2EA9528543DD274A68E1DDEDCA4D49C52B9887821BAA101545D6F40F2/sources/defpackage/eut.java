package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eut  reason: default package */
/* loaded from: classes6.dex */
final class eut<T> implements dzsj<T> {
    final /* synthetic */ euu a;
    private final int b;

    public eut(euu euuVar, int i) {
        this.a = euuVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                euu euuVar = this.a;
                dzsj<gga> ad = euuVar.j.ad();
                dzsj dzsjVar = euuVar.b;
                if (dzsjVar == null) {
                    dzsjVar = new eut(euuVar, 1);
                    euuVar.b = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = euuVar.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new eut(euuVar, 3);
                    euuVar.c = dzsjVar3;
                }
                return (T) new cbvn(ad, dzsjVar2, dzsjVar3, euuVar.j.eW.di(), euuVar.j.eW.il());
            case 1:
                euu euuVar2 = this.a;
                dzsj<Executor> di = euuVar2.j.eW.di();
                dzsj dzsjVar4 = euuVar2.a;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new eut(euuVar2, 2);
                    euuVar2.a = dzsjVar4;
                }
                return (T) new cbuw(di, dzsjVar4, euuVar2.j.eW.il());
            case 2:
                return (T) new cbvd();
            case 3:
                return (T) new cbvt();
            case 4:
                euu euuVar3 = this.a;
                dzsj<cqhn> il = euuVar3.j.eW.il();
                dzsj dzsjVar5 = euuVar3.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new eut(euuVar3, 5);
                    euuVar3.e = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = euuVar3.f;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new eut(euuVar3, 7);
                    euuVar3.f = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj dzsjVar9 = euuVar3.g;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new eut(euuVar3, 8);
                    euuVar3.g = dzsjVar9;
                }
                return (T) new cbvy(il, dzsjVar6, dzsjVar8, dzsjVar9, euuVar3.j.eW.di());
            case 5:
                euu euuVar4 = this.a;
                dzsj dzsjVar10 = euuVar4.d;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new eut(euuVar4, 6);
                    euuVar4.d = dzsjVar10;
                }
                return (T) new cbyi(dzsjVar10, euuVar4.j.eW.il(), euuVar4.j.ad());
            case 6:
                return (T) new cbyx();
            case 7:
                euu euuVar5 = this.a;
                return (T) new cbxa(euuVar5.j.eW.il(), euuVar5.j.ad(), euuVar5.j.jn());
            case 8:
                return (T) new cbxu(this.a.j.ad());
            case 9:
                euu euuVar6 = this.a;
                dzsj dzsjVar11 = euuVar6.h;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new eut(euuVar6, 10);
                    euuVar6.h = dzsjVar11;
                }
                dzsj dzsjVar12 = euuVar6.i;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new eut(euuVar6, 11);
                    euuVar6.i = dzsjVar12;
                }
                return (T) new cbsl(dzsjVar11, dzsjVar12);
            case 10:
                euu euuVar7 = this.a;
                return (T) new cbsq(euuVar7.j.ad(), euuVar7.j.vf(), euuVar7.j.eW.aw());
            case 11:
                euu euuVar8 = this.a;
                return (T) new cbtc(euuVar8.j.ad(), euuVar8.j.vf(), euuVar8.j.eW.aw());
            default:
                return (T) new cbsi(this.a.j.ad());
        }
    }
}
