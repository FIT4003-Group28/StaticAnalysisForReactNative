package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fsq  reason: default package */
/* loaded from: classes6.dex */
public final class fsq<T> implements dzsj<T> {
    final /* synthetic */ fsr a;
    private final int b;

    public fsq(fsr fsrVar, int i) {
        this.a = fsrVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [abtz] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fsr fsrVar = this.a;
                dzsj<Application> m = fsrVar.g.eW.m();
                dzsj dzsjVar = fsrVar.b;
                if (dzsjVar == null) {
                    dzsjVar = new fsq(fsrVar, 1);
                    fsrVar.b = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = fsrVar.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fsq(fsrVar, 3);
                    fsrVar.c = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj<cqhn> il = fsrVar.g.eW.il();
                dzsj dzsjVar5 = fsrVar.d;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fsq(fsrVar, 4);
                    fsrVar.d = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj<acel> b = fsrVar.b();
                dzsj<cqhu> eS = fsrVar.g.eS();
                dzsj dzsjVar7 = fsrVar.e;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fsq(fsrVar, 6);
                    fsrVar.e = dzsjVar7;
                }
                return (T) new acbw(m, dzsjVar2, dzsjVar4, il, dzsjVar6, b, eS, dzsjVar7);
            case 1:
                fsr fsrVar2 = this.a;
                dzsj<Application> m2 = fsrVar2.g.eW.m();
                dzsj dzsjVar8 = fsrVar2.a;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fsq(fsrVar2, 2);
                    fsrVar2.a = dzsjVar8;
                }
                return (T) new acbi(m2, dzsjVar8);
            case 2:
                fsr fsrVar3 = this.a;
                return (T) new bdvd(fsrVar3.g.eW.m(), fsrVar3.g.eW.R(), fsrVar3.g.eW.V(), fsrVar3.g.eW.at(), fsrVar3.g.eW.al());
            case 3:
                fsr fsrVar4 = this.a;
                return (T) new accn(fsrVar4.g.eW.il(), fsrVar4.g.vG(), fsrVar4.g.eS());
            case 4:
                Application a = this.a.g.eW.a.a();
                dxjg.e(a);
                return (T) new acbg(a);
            case 5:
                fsr fsrVar5 = this.a;
                return (T) new acel(fsrVar5.g.be(), fsrVar5.g.vF(), fsrVar5.g.ap());
            case 6:
                return (T) new bckz(this.a.g.eS());
            case 7:
                fsr fsrVar6 = this.a;
                T t = (T) fsrVar6.h;
                T t2 = t;
                if (t == null) {
                    ftt fttVar = fsrVar6.g;
                    dzsj<rb> dzsjVar9 = fttVar.eV;
                    dzsj<cqhn> il2 = fttVar.eW.il();
                    dzsj<abfa> mq = fsrVar6.g.eW.mq();
                    dzsj<adza> ij = fsrVar6.g.eW.ij();
                    dzsj dzsjVar10 = fsrVar6.f;
                    if (dzsjVar10 == null) {
                        dzsjVar10 = new fsq(fsrVar6, 8);
                        fsrVar6.f = dzsjVar10;
                    }
                    ?? r1 = (T) new abtz(dzsjVar9, il2, mq, ij, dzsjVar10);
                    fsrVar6.h = r1;
                    t2 = r1;
                }
                return t2;
            default:
                fsr fsrVar7 = this.a;
                ftt fttVar2 = fsrVar7.g;
                return (T) new abus(fttVar2.eV, fttVar2.rr(), fsrVar7.g.as());
        }
    }
}
