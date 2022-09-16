package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ert  reason: default package */
/* loaded from: classes6.dex */
public final class ert<T> implements dzsj<T> {
    final /* synthetic */ eru a;
    private final int b;

    public ert(eru eruVar, int i) {
        this.a = eruVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                eru eruVar = this.a;
                ftt fttVar = eruVar.g.y;
                dzsj<rb> dzsjVar = fttVar.eV;
                dzsj<cqhn> il = fttVar.eW.il();
                ese eseVar = eruVar.g;
                dzsj dzsjVar2 = eseVar.u;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new erv(eseVar, 32);
                    eseVar.u = dzsjVar2;
                }
                dzsj dzsjVar3 = eruVar.f;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new ert(eruVar, 1);
                    eruVar.f = dzsjVar3;
                }
                return (T) new ubw(dzsjVar, il, dzsjVar2, dzsjVar3);
            case 1:
                eru eruVar2 = this.a;
                dzsj<rb> dzsjVar4 = eruVar2.g.y.eV;
                dzsj dzsjVar5 = eruVar2.a;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new ert(eruVar2, 2);
                    eruVar2.a = dzsjVar5;
                }
                uaq uaqVar = new uaq(dzsjVar4, dzsjVar5, eruVar2.g.y.eW.ob(), eruVar2.b(), eruVar2.g.C(), eruVar2.g.D(), eruVar2.c());
                uat uatVar = new uat(eruVar2.g.y.eV, eruVar2.d(), eruVar2.g.C(), eruVar2.g.D(), eruVar2.g.y.eW.K());
                ftt fttVar2 = eruVar2.g.y;
                uaw uawVar = new uaw(fttVar2.eV, fttVar2.eW.jm(), eruVar2.d(), eruVar2.e(), eruVar2.g.C(), eruVar2.g.D(), eruVar2.g.y.eW.K());
                ftt fttVar3 = eruVar2.g.y;
                uba ubaVar = new uba(fttVar3.eV, fttVar3.m(), eruVar2.g.C());
                dzsj<rb> dzsjVar6 = eruVar2.g.y.eV;
                dzsj<twn> b = eruVar2.b();
                dzsj dzsjVar7 = eruVar2.e;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new ert(eruVar2, 10);
                    eruVar2.e = dzsjVar7;
                }
                return (T) new tuo(uaqVar, uatVar, uawVar, ubaVar, new ube(dzsjVar6, b, dzsjVar7, eruVar2.g.y.ir(), eruVar2.g.C(), eruVar2.g.D(), eruVar2.c()), new ubh(eruVar2.g.y.eV, eruVar2.b(), eruVar2.g.y.eW.K(), eruVar2.g.y.ix(), eruVar2.g.y.iA(), eruVar2.g.y.iv(), eruVar2.g.C(), eruVar2.g.D()), new ubk(eruVar2.g.y.eV, eruVar2.d(), eruVar2.e(), eruVar2.g.y.eW.jm(), eruVar2.g.C(), eruVar2.g.D(), eruVar2.g.y.eW.K()), new ubn(eruVar2.g.y.eV, eruVar2.d(), eruVar2.g.C(), eruVar2.g.D(), eruVar2.g.y.eW.K()), new wuw());
            case 2:
                return (T) new qhn(this.a.g.y.eW.sA());
            case 3:
                ftt fttVar4 = this.a.g.y;
                return (T) new twn(fttVar4.eV, fttVar4.eW.V());
            case 4:
                return (T) new suq(this.a.g.y.eV);
            case 5:
                ese eseVar2 = this.a.g;
                return (T) new twk(eseVar2.y.eV, eseVar2.r());
            case 6:
                eru eruVar3 = this.a;
                dzsj<rb> dzsjVar8 = eruVar3.g.y.eV;
                dzsj dzsjVar9 = eruVar3.b;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new ert(eruVar3, 7);
                    eruVar3.b = dzsjVar9;
                }
                dzsj dzsjVar10 = eruVar3.c;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new ert(eruVar3, 8);
                    eruVar3.c = dzsjVar10;
                }
                dzsj dzsjVar11 = eruVar3.d;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new ert(eruVar3, 9);
                    eruVar3.d = dzsjVar11;
                }
                return (T) new twf(dzsjVar8, dzsjVar9, dzsjVar10, dzsjVar11);
            case 7:
                return (T) new twt(this.a.g.y.eV);
            case 8:
                return (T) new twv(this.a.g.y.eW.jm());
            case 9:
                eru eruVar4 = this.a;
                ftt fttVar5 = eruVar4.g.y;
                return (T) new twr(fttVar5.eV, fttVar5.eW.ds(), eruVar4.g.y.eW.jm());
            case 10:
                return (T) new twh();
            case 11:
                eru eruVar5 = this.a;
                ese eseVar3 = eruVar5.g;
                return (T) new uch(eseVar3.y.eV, eseVar3.u(), eruVar5.g.f(), eruVar5.g.y.eW.il(), eruVar5.g.y.eW.K(), eruVar5.g.y.y(), eruVar5.g.y.eS(), eruVar5.g.y.eW.di());
            case 12:
                eru eruVar6 = this.a;
                return (T) new uck(eruVar6.g.i(), eruVar6.g.y.eW.il());
            case 13:
                ese eseVar4 = this.a.g;
                return (T) new uca(eseVar4.y.eV, eseVar4.i());
            default:
                ese eseVar5 = this.a.g;
                return (T) new ucq(eseVar5.y.eV, eseVar5.i());
        }
    }
}
