package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ezd  reason: default package */
/* loaded from: classes6.dex */
final class ezd<T> implements dzsj<T> {
    final /* synthetic */ eze a;
    private final int b;

    public ezd(eze ezeVar, int i) {
        this.a = ezeVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                eze ezeVar = this.a;
                return (T) new bgyb(ezeVar.i.wk(), ezeVar.i.wl());
            case 1:
                eze ezeVar2 = this.a;
                dzsj dzsjVar = ezeVar2.b;
                if (dzsjVar == null) {
                    dzsjVar = new ezd(ezeVar2, 2);
                    ezeVar2.b = dzsjVar;
                }
                return (T) new beot(dzsjVar);
            case 2:
                eze ezeVar3 = this.a;
                dzsj<bmdq> jG = ezeVar3.i.jG();
                dzsj c = dxjh.c(ezeVar3.i.ti());
                dzsj<cqhn> il = ezeVar3.i.eW.il();
                dzsj<cqhu> eS = ezeVar3.i.eS();
                dzsj<rb> dzsjVar2 = ezeVar3.i.eV;
                dzsj dzsjVar3 = ezeVar3.a;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new ezd(ezeVar3, 3);
                    ezeVar3.a = dzsjVar3;
                }
                return (T) new beor(jG, c, il, eS, dzsjVar2, dzsjVar3);
            case 3:
                return (T) this.a.b();
            case 4:
                eze ezeVar4 = this.a;
                dzsj<rb> dzsjVar4 = ezeVar4.i.eV;
                dzsj dzsjVar5 = ezeVar4.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new ezd(ezeVar4, 5);
                    ezeVar4.c = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj<cqhn> il2 = ezeVar4.i.eW.il();
                dzsj dzsjVar7 = ezeVar4.d;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new ezd(ezeVar4, 6);
                    ezeVar4.d = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj<beik> nl = ezeVar4.i.eW.nl();
                dzsj dzsjVar9 = ezeVar4.h;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new ezd(ezeVar4, 7);
                    ezeVar4.h = dzsjVar9;
                }
                return (T) new beoh(dzsjVar4, dzsjVar6, il2, dzsjVar8, nl, dzsjVar9, ezeVar4.i.eW.al(), ezeVar4.i.eW.di());
            case 5:
                return (T) new apnm();
            case 6:
                return (T) new bgyj(this.a.b());
            case 7:
                eze ezeVar5 = this.a;
                dzsj<Application> m = ezeVar5.i.eW.m();
                dzsj dzsjVar10 = ezeVar5.e;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new ezd(ezeVar5, 8);
                    ezeVar5.e = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj c2 = dxjh.c(ezeVar5.i.ti());
                dzsj dzsjVar12 = ezeVar5.f;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new ezd(ezeVar5, 9);
                    ezeVar5.f = dzsjVar12;
                }
                dzsj dzsjVar13 = dzsjVar12;
                dzsj dzsjVar14 = ezeVar5.g;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new ezd(ezeVar5, 10);
                    ezeVar5.g = dzsjVar14;
                }
                return (T) new beov(m, dzsjVar11, c2, dzsjVar13, dzsjVar14, ezeVar5.i.eW.il());
            case 8:
                eze ezeVar6 = this.a;
                ftt fttVar = ezeVar6.i;
                return (T) apnz.b(fttVar.eV, fttVar.eW.il(), dxjh.c(ezeVar6.i.ld()), dxjh.c(ezeVar6.i.eW.p()), dxjh.c(ezeVar6.i.li()), ezeVar6.i.pw());
            case 9:
                eze ezeVar7 = this.a;
                Application a = ezeVar7.i.eW.a.a();
                dxjg.e(a);
                cqat rR = ezeVar7.i.eW.a.rR();
                dxjg.e(rR);
                return (T) new benm(a, rR);
            case 10:
                return (T) new bgyg(this.a.i.eS());
            default:
                eze ezeVar8 = this.a;
                return (T) new bepv(ezeVar8.i.eW.fr(), ezeVar8.i.eW.il(), dxjh.c(ezeVar8.i.ti()), ezeVar8.i.eW.R());
        }
    }
}
