package defpackage;
/* compiled from: PG */
/* renamed from: fqs  reason: default package */
/* loaded from: classes6.dex */
final class fqs<T> implements dzsj<T> {
    final /* synthetic */ fqt a;
    private final int b;

    public fqs(fqt fqtVar, int i) {
        this.a = fqtVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fqt fqtVar = this.a;
                dzsj dzsjVar = fqtVar.b;
                if (dzsjVar == null) {
                    dzsjVar = new fqs(fqtVar, 1);
                    fqtVar.b = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = fqtVar.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fqs(fqtVar, 3);
                    fqtVar.d = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fqtVar.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fqs(fqtVar, 5);
                    fqtVar.e = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj<wvp> jP = fqtVar.g.jP();
                dzsj<cqhn> il = fqtVar.g.eW.il();
                ftt fttVar = fqtVar.g;
                return (T) new wzj(dzsjVar2, dzsjVar4, dzsjVar6, jP, il, fttVar.eV, fttVar.jN());
            case 1:
                fqt fqtVar2 = this.a;
                dzsj dzsjVar7 = fqtVar2.a;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fqs(fqtVar2, 2);
                    fqtVar2.a = dzsjVar7;
                }
                return (T) new wzp(dzsjVar7);
            case 2:
                fqt fqtVar3 = this.a;
                return (T) new wzm(fqtVar3.g.eW.il(), fqtVar3.g.eW.jm(), fqtVar3.g.eW.ie());
            case 3:
                fqt fqtVar4 = this.a;
                dzsj dzsjVar8 = fqtVar4.c;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fqs(fqtVar4, 4);
                    fqtVar4.c = dzsjVar8;
                }
                return (T) new wzc(dzsjVar8);
            case 4:
                fqt fqtVar5 = this.a;
                return (T) new wza(fqtVar5.g.eW.il(), fqtVar5.g.eV);
            case 5:
                fqt fqtVar6 = this.a;
                return (T) new wze(fqtVar6.g.eW.il(), fqtVar6.g.eV);
            case 6:
                fqt fqtVar7 = this.a;
                dzsj<gga> ad = fqtVar7.g.ad();
                dzsj dzsjVar9 = fqtVar7.f;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fqs(fqtVar7, 7);
                    fqtVar7.f = dzsjVar9;
                }
                return (T) new wyy(ad, dzsjVar9, fqtVar7.g.eW.lP(), fqtVar7.g.jP());
            default:
                fqt fqtVar8 = this.a;
                ftt fttVar2 = fqtVar8.g;
                return (T) new wyw(fttVar2.eV, fttVar2.eW.il(), fqtVar8.g.eW.jm(), fqtVar8.g.eW.V(), fqtVar8.g.eW.ie());
        }
    }
}
