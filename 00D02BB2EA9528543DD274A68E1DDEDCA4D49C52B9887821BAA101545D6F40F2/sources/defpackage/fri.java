package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fri  reason: default package */
/* loaded from: classes6.dex */
public final class fri<T> implements dzsj<T> {
    final /* synthetic */ frj a;
    private final int b;

    public fri(frj frjVar, int i) {
        this.a = frjVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                frj frjVar = this.a;
                return (T) new cgbl(frjVar.h.eW.fd(), frjVar.h.eW.il(), frjVar.h.eW.p(), frjVar.h.cP(), frjVar.h.cN(), frjVar.h.eW.ik(), frjVar.h.eW.cl());
            case 1:
                frj frjVar2 = this.a;
                dzsj dzsjVar = frjVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fri(frjVar2, 2);
                    frjVar2.a = dzsjVar;
                }
                return (T) new cfyp(dzsjVar, frjVar2.b(), frjVar2.h.eW.il(), dxjh.c(frjVar2.h.eW.jB()), dxjh.c(frjVar2.h.m()), frjVar2.h.vs(), frjVar2.h.eW.mf(), frjVar2.h.eW.mj(), frjVar2.h.ad(), frjVar2.h.eW.di(), frjVar2.h.vt());
            case 2:
                frj frjVar3 = this.a;
                return (T) new cgaf(frjVar3.h.eW.lL(), frjVar3.h.eW.il());
            case 3:
                frj frjVar4 = this.a;
                return (T) new cftd(dxjh.c(frjVar4.h.cQ()), frjVar4.h.eW.fr());
            case 4:
                frj frjVar5 = this.a;
                return (T) new cfzb(frjVar5.h.eW.V(), dxjh.c(frjVar5.h.aJ()), frjVar5.h.vt(), dxjh.c(frjVar5.h.az()));
            case 5:
                frj frjVar6 = this.a;
                dzsj dzsjVar2 = frjVar6.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fri(frjVar6, 6);
                    frjVar6.b = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj dzsjVar4 = frjVar6.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fri(frjVar6, 7);
                    frjVar6.d = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj dzsjVar6 = frjVar6.e;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fri(frjVar6, 9);
                    frjVar6.e = dzsjVar6;
                }
                dzsj dzsjVar7 = dzsjVar6;
                dzsj dzsjVar8 = frjVar6.f;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fri(frjVar6, 10);
                    frjVar6.f = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj dzsjVar10 = frjVar6.g;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fri(frjVar6, 11);
                    frjVar6.g = dzsjVar10;
                }
                return (T) new cfso(dzsjVar3, dzsjVar5, dzsjVar7, dzsjVar9, dzsjVar10, frjVar6.h.vu());
            case 6:
                frj frjVar7 = this.a;
                return (T) new cfsc(dxjh.c(frjVar7.h.bf()), frjVar7.h.av(), frjVar7.h.eW.fr());
            case 7:
                frj frjVar8 = this.a;
                dzsj dzsjVar11 = frjVar8.c;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fri(frjVar8, 8);
                    frjVar8.c = dzsjVar11;
                }
                return (T) new cfum(dzsjVar11, dxjh.c(frjVar8.h.ef()), dxjh.c(frjVar8.h.aJ()), frjVar8.h.eW.fr());
            case 8:
                frj frjVar9 = this.a;
                dxio c = dxjc.c(frjVar9.h.eW.k());
                Executor sU = frjVar9.h.eW.a.sU();
                dxjg.e(sU);
                return (T) new cftt(c, sU, new cfuj(frjVar9.h.eW.aI(), frjVar9.h.T()), frjVar9.h.ea());
            case 9:
                frj frjVar10 = this.a;
                return (T) new cfse(dxjh.c(frjVar10.h.cS()), frjVar10.h.eW.fr());
            case 10:
                frj frjVar11 = this.a;
                return (T) new cftf(dxjh.c(frjVar11.h.bh()), frjVar11.h.eW.fr());
            case 11:
                return (T) new cfue();
            case 12:
                return (T) new cfvt(this.a.h.cN());
            case 13:
                return (T) new cfth();
            case 14:
                frj frjVar12 = this.a;
                return (T) new bzrc(dxjh.c(frjVar12.h.cx()), dxjh.c(frjVar12.h.m()), dxjh.c(frjVar12.h.ai()), dxjh.c(frjVar12.h.tk()), dxjh.c(frjVar12.h.fe()), frjVar12.h.eW.V());
            default:
                return (T) new cfxj();
        }
    }
}
